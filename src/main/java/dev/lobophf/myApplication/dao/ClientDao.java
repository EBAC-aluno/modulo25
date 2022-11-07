package dev.lobophf.myApplication.dao;

import dev.lobophf.myApplication.domain.Client;

public class ClientDao implements IClientDao {

	@Override
	public Boolean save(Client client) {
					return true;
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

}

