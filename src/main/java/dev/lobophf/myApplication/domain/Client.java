package dev.lobophf.myApplication.domain;

import dev.lobophf.myApplication.dao.Persistente;

public class Client implements Persistente {
	
	private String name;
	private Long cpf;
	private Long telephone;
	private String address;
	private String city;
	private Integer houseNumber;
	private String State;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getCpf() {
    return cpf;
  }

  public void setCpf(Long cpf) {
    this.cpf = cpf;
  }

  public Long getTelephone() {
    return telephone;
  }

  public void setTelephone(Long telephone) {
    this.telephone = telephone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Integer getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(Integer houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getState() {
    return State;
  }

  public void setState(String state) {
    State = state;
  }

}

