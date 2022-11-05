package dev.lobophf.myApplication.services;

import dev.lobophf.myApplication.domain.Client;

public interface IClientService{

    void save(Client client);

    Client findByCpf(Long cpf);

}
