package com.spock.demo.caixaeletronico;

import java.math.BigDecimal;

public class CaixaEletronicoDeposito {
	
	BigDecimal saldo;
	
	public CaixaEletronicoDeposito(String agencia, String conta, String senha, String operacao, BigDecimal valor) {
		saldo = valor;
	}
	
	public void efetuarDeposito(BigDecimal valor) {
		this.saldo = this.saldo.add(valor);
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	

}
