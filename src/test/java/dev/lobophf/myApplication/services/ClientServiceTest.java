package dev.lobophf.myApplication.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.lobophf.myApplication.dao.ClientDaoMock;
import dev.lobophf.myApplication.dao.IClientDao;
import dev.lobophf.myApplication.domain.Client;

public class ClientServiceTest {

	IClientService clientService;
	Client client;

	public ClientServiceTest() {
		IClientDao dao = new ClientDaoMock();
		clientService = new ClientService(dao);
		client = new Client();

	}

	@BeforeEach
	public void setUp() {
		client.setCpf(12312L);
		client.setName("Pedro");
		client.setAddress("São Paulo");
		client.setState("SP");
		client.setHouseNumber(123);
		client.setTelephone(23213L);
		clientService.save(client);
	}

	@Test
	public void searchByClient() {
		Client foundClient = clientService.findByCpf(client.getCpf());
		Assertions.assertNotNull(foundClient);
	}

	@Test
	public void saveClient(){
				Boolean isClientSaved = clientService.save(client);
				Assertions.assertTrue(isClientSaved);
	}

	@Test
	public void removeClient(){
				clientService.remove(client.getCpf());
	}
}
