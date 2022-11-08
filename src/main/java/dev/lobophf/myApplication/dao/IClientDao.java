package dev.lobophf.myApplication.dao;

import dev.lobophf.myApplication.domain.Client;

public interface IClientDao {

	public Boolean save(Client client);

	public Client findByCpf(Long cpf);

	public void removeClient(Long cpf);

	public void modify(Client client);
}
