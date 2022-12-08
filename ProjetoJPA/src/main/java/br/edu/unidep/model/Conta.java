package br.edu.unidep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "titular")
	private String titular;
	
	@Column(name = "saldo_conta")
	private double saldoConta;
	
	public Conta() {
		super();
	}

	public Conta(String titular, double saldoConta) {
		super();
		this.titular = titular;
		this.saldoConta = saldoConta;
	}

}
