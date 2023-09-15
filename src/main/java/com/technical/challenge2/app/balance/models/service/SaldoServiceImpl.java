package com.technical.challenge2.app.balance.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.technical.challenge2.app.balance.models.Saldo;

@Service
public class SaldoServiceImpl implements SaldoService {
	
	@Autowired
	private RestTemplate saldoClienteRest;

	@Override
	public List<Saldo> findAll() {
		List<Saldo> saldos = Arrays.asList(saldoClienteRest.getForObject("http://localhost:8001/listarSaldos", Saldo[].class));
		
		return saldos;
	}

	@Override
	public Saldo findByIdCliente(String idCliente) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("idCliente", idCliente);
		
		Saldo saldo = saldoClienteRest.getForObject("http://localhost:8001/listarSaldo/{idCliente}", Saldo.class, pathVariables);
		
		return saldo;
	}

}
