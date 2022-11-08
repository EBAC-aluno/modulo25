package dev.lobophf.myApplication.services;

import dev.lobophf.myApplication.domain.Client;

public interface IClientService{

    Boolean save(Client client);

    Client findByCpf(Long cpf);

    void remove(Long cpf);

    void modify(Client client);

}
