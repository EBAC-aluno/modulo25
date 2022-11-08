package dev.lobophf.myApplication.services;

import dev.lobophf.myApplication.domain.Client;
import dev.lobophf.myApplication.dao.IClientDao;

public class ClientService implements IClientService{

	private IClientDao clientDao;

	public ClientService(IClientDao clientDao){
		this.clientDao = clientDao;
	}

	@Override
	public Boolean save(Client client) {
				return true;	
	}

	@Override
	public Client findByCpf(Long cpf) {
		return clientDao.findByCpf(cpf);
	}

	@Override
	public void remove(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Client client) {
		clientDao.modify(client);		// TODO Auto-generated method stub
		
	}
}
