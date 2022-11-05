package dev.lobophf.myApplication.dao;

import dev.lobophf.myApplication.domain.Client;

public interface IClientDao {

	public void save(Client client);
	public Client findByCpf(Long cpf);
}

