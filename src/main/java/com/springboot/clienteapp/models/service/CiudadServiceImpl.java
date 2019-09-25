package com.springboot.clienteapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clienteapp.models.entity.Ciudad;
import com.springboot.clienteapp.models.repository.CiudadRespository;

@Service
public class CiudadServiceImpl implements ICiudadService {

	@Autowired
	private CiudadRespository ciudadRepository;
	
	@Override
	public List<Ciudad> listaCiudades() {
		
		return (List<Ciudad>) ciudadRepository.findAll();
	}

}
