package dev.lobophf.myApplication.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dev.lobophf.myApplication.dao.ClientDaoMock;
import dev.lobophf.myApplication.dao.IClientDao;
import dev.lobophf.myApplication.services.ClientService;
import dev.lobophf.myApplication.services.IClientService;

public class ClientTest {

	IClientService clientService;

        public ClientTest(){
          IClientDao dao = new ClientDaoMock();
          clientService = new ClientService(dao);
        }

	@Test
	public void searchByClient() {
		Client client = new Client();
		client.setCpf(12312L);
		client.setName("Pedro");
		client.setAddress("São Paulo");
		client.setState("SP");
		client.setHouseNumber(123);
		client.setTelephone(23213L);

                clientService.save(client);
                Client foundClient = clientService.findByCpf(client.getCpf());

                Assertions.assertNotNull(foundClient);
	}
}
