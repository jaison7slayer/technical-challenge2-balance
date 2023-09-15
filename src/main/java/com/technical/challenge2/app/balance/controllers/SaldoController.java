package com.technical.challenge2.app.balance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.technical.challenge2.app.balance.models.Saldo;
import com.technical.challenge2.app.balance.models.service.SaldoService;

@RestController
public class SaldoController {
	
	@Autowired
	private SaldoService saldoService;
	
	@GetMapping("/listarSaldos")
	public List<Saldo> listar(){
		return saldoService.findAll();
	}

	@GetMapping("/listarSaldo/{idCliente}")
	public Saldo listarPorCliente(@PathVariable String idCliente){
		return saldoService.findByIdCliente(idCliente);
	}
}
