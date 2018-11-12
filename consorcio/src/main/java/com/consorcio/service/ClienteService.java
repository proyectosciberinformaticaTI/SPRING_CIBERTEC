package com.consorcio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consorcio.entidad.Cliente;
import com.consorcio.repository.ClienteRepository;

@Service
public class ClienteService implements ClienteDAO{
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listAllCliente() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public void addCliente(Cliente c) {
		clienteRepository.save(c);
		
	}

	@Override
	public void deleteCliente(long cod) {
		clienteRepository.deleteById(cod);
		
	}

	@Override
	public Cliente findCliente(long cod) {
		// TODO Auto-generated method stub
		return clienteRepository.getOne(cod);
	}
	
	
}
