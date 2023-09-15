package com.technical.challenge2.app.balance.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Saldo {
	
	private String idCliente;
	private String idCuenta;
	private String monedaCuenta;
	private Double saldoCuenta;

}
