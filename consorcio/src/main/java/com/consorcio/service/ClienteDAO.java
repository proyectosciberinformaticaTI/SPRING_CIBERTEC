package com.consorcio.service;

import java.util.List;

import com.consorcio.entidad.Cliente;

public interface ClienteDAO {
	public List<Cliente> listAllCliente();
	public void addCliente(Cliente c);
	public void deleteCliente(long cod);
	public Cliente findCliente(long cod);
}
