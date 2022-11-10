package dev.lobophf.myApplication.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import dev.lobophf.myApplication.dao.Persistence;
import dev.lobophf.myApplication.exceptions.KeyNotFoundException;

public interface IGenericDAO <T extends Persistence, E extends Serializable> {

    public Boolean register(T entity) throws KeyNotFoundException;

    public void remove(E valor);

    public void modify(T entity) throws KeyNotFoundException;

    public T search(E valor);

    public Collection<T> getAll();
}
