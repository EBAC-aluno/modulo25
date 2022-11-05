package dev.lobophf.myApplication.dao;

import dev.lobophf.myApplication.domain.Client;

public class ClientDaoMock implements IClientDao{

	@Override
	public void save(Client client) {

	}

	@Override
	public Client findByCpf(Long cpf) {
		Client client = new Client();
		client.setCpf(cpf);
		return client;
	}

}
