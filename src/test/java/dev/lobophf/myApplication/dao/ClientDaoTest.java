package dev.lobophf.myApplication.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.lobophf.myApplication.domain.Client;

public class ClientDaoTest {

	private IClientDao clientDao;

	private Client client;

	public ClientDaoTest() {
		clientDao = new ClientDaoMock();
	}

	@BeforeEach
	public void setUp() {
		client = new Client();
		client.setCpf(12312312312L);
		client.setName("Pedro");
		client.setCity("São Paulo");
		client.setAddress("End");
		client.setState("SP");
		client.setHouseNumber(10);
		client.setTelephone(123123L);
		clientDao.save(client);
	}

	@Test
	public void searchByClient() {
		Client searchedClient = clientDao.findByCpf(client.getCpf());
		Assertions.assertNotNull(searchedClient);
	}

	@Test
	public void removeClient() {
		clientDao.removeClient(client.getCpf());
	}

}
