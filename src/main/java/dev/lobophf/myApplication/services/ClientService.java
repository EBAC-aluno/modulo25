package dev.lobophf.myApplication.services;

import dev.lobophf.myApplication.domain.Client;
import dev.lobophf.myApplication.dao.IClientDao;

public class ClientService implements IClientService{

	private IClientDao clientDao;

	public ClientService(IClientDao clientDao){
		this.clientDao = clientDao;
	}

	@Override
	public void save(Client client) {
				
	}

	@Override
	public Client findByCpf(Long cpf) {
		return clientDao.findByCpf(cpf);
	}


}
