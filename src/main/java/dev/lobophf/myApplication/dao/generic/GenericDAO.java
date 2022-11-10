package dev.lobophf.myApplication.dao.generic;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import annotation.Key;
import dev.lobophf.myApplication.dao.Persistence;
import dev.lobophf.myApplication.exceptions.KeyNotFoundException;


public abstract class GenericDAO<T extends Persistence, E extends Serializable> implements IGenericDAO<T,E> {
    private SingletonMap singletonMap;

    public abstract Class<T> getClassType();

    public abstract void updateData(T entity, T entityRegistered);

    public GenericDAO() {
        this.singletonMap = SingletonMap.getInstance();
    }

    public E getKey(T entity) throws KeyNotFoundException {
        Field[] fields = entity.getClass().getDeclaredFields();
        E returnValue = null;
        for (Field field : fields) {
            if (field.isAnnotationPresent(Key.class)) {
                Key key = field.getAnnotation(Key.class);
                String nomeMetodo = key.value();
                try {
                    Method method = entity.getClass().getMethod(nomeMetodo);
                    returnValue = (E) method.invoke(entity);
                    return returnValue;
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    //Criar exception de negócio TipoChaveNaoEncontradaException
                    e.printStackTrace();
                    throw new KeyNotFoundException("Main Key of object " + entity.getClass() + " not found", e);
                }
            }
        }
        if (returnValue == null) {
            String msg = "Main object key " + entity.getClass() + " not found";
            System.out.println("ERROR: " + msg);
            throw new KeyNotFoundException(msg);
        }
        return null;
    }

    @Override
    public Boolean register(T entity) throws KeyNotFoundException {
        Map<E, T> internalMap = getMap();
        E key = getKey(entity);
        if (internalMap.containsKey(key)) {
            return false;
        }

        internalMap.put(key, entity);
        return true;
    }

	private Map<E, T> getMap() {
		Map<E, T> internalMap = (Map<E, T>) this.singletonMap.getMap().get(getClassType());
		if (internalMap == null) {
			internalMap = new HashMap<>();
			this.singletonMap.getMap().put(getClassType(), internalMap);
		}
		return internalMap;
	}

    @Override
    public void remove(E valor) {
        Map<E, T> internalMap = getMap();
        T registeredObject = internalMap.get(valor);
        if (registeredObject != null) {
            internalMap.remove(valor, registeredObject);
        }
    }

    @Override
    public void modify(T entity) throws KeyNotFoundException {
        Map<E, T> internalMap = getMap();
        E key = getKey(entity);
        T registeredObject = internalMap.get(key);
        if (registeredObject != null) {
            updateData(entity, registeredObject);
        }
    }

    @Override
    public T search(E valor) {
        Map<E, T> internalMap = getMap();
        return internalMap.get(valor);
    }

    @Override
    public Collection<T> getAll() {
        Map<E, T> internalMap = getMap();
        return internalMap.values();
    }
}
