package com.spock.demo

import static org.junit.Assert.*

import spock.lang.Specification;
import org.junit.Test

import com.spock.demo.caixaeletronico.CaixaEletronicoDeposito

class CaixaEletronicoDemo extends Specification {

	def "Primeiro deposito no caixa eletrônico"() {
		given: "Sr Pedro informou sua agência 0666"
		String agencia = "0666";
			
		and: "Informou sua conta 67898-1"
		String conta = "67898-1"
		
		and: "Informou sua senha 123456"
		String senha = "123456"
		
		and: "Informou a operação de depósito"
		String operacao = "DEPOSITO"
		
		and: "Informou o valor de 100.00"
		BigDecimal valor = 100;
		
		when: "Ele confirmar a operação"
		CaixaEletronicoDeposito caixaEletronico = new CaixaEletronicoDeposito(agencia, conta, senha, operacao, valor)
		BigDecimal saldo = caixaEletronico.getSaldo()
		
		then: "Seu saldo será atualizado para 100.00"
		assertTrue("Saldo é:", saldo.compareTo(BigDecimal.valueOf(100)) == 0)
		
	}
	
	def "Segundo deposito no caixa eletrônico"() {
		given: "Sr Pedro informou sua agência 0666"
		String agencia = "0666";
			
		and: "Informou sua conta 67898-1"
		String conta = "67898-1"
		
		and: "Informou sua senha 123456"
		String senha = "123456"
		
		and: "Informou a operação de depósito"
		String operacao = "DEPOSITO"
		
		and: "Informou o valor de 100.00"
		BigDecimal valor = 100;
		
		and: "E Já tenha um saldo de 100.00"
		CaixaEletronicoDeposito caixaEletronico = new CaixaEletronicoDeposito(agencia, conta, senha, operacao, BigDecimal.valueOf(100))
		
		when: "Ele confirmar a operação"
		caixaEletronico.efetuarDeposito(100);
		BigDecimal saldo = caixaEletronico.getSaldo()
		
		then: "Seu saldo será atualizado para 200.00"
		assertTrue("Saldo é:", saldo.compareTo(BigDecimal.valueOf(200)) == 0)
		
	}

}
