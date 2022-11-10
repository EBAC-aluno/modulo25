package dev.lobophf.myApplication.dao;

import java.io.Serializable;

import dev.lobophf.myApplication.dao.generic.GenericDAO;
import dev.lobophf.myApplication.domain.Client;

public class ClientDao extends GenericDAO<Client, Serializable> implements IClientDao {

	@Override
	public Boolean save(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findByCpf(Long cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeClient(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData(Client entity, Client entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<Client> getClassType() {
		// TODO Auto-generated method stub
		return null;
	}

}

