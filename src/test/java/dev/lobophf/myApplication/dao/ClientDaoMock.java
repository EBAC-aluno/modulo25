package dev.lobophf.myApplication.dao;

import dev.lobophf.myApplication.domain.Client;

public class ClientDaoMock implements IClientDao {

	@Override
	public Boolean save(Client client) {
		return true;
	}

	@Override
	public Client findByCpf(Long cpf) {
		Client client = new Client();
		client.setCpf(cpf);

		return client;
	}

	@Override
	public void removeClient(Long cpf) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modify(Client client) {
		// TODO Auto-generated method stub

	}
}
