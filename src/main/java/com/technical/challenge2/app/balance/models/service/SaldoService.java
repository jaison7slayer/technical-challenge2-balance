package com.technical.challenge2.app.balance.models.service;

import java.util.List;

import com.technical.challenge2.app.balance.models.Saldo;

public interface SaldoService {
	
	public List<Saldo> findAll();
	public Saldo findByIdCliente(String idCliente);

}
