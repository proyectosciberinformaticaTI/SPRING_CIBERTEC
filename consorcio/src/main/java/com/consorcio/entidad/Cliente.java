package com.consorcio.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_cli")
	private long codCliente;
	@Column(name="nom_cli")
	private String nomCliente;
	@Column(name="ape_cli")
	private String apeCliente;
	@Column(name="credito_cli")
	private double creditoCliente;
	@Column(name="sexo_cli")
	private String sexoCliente;
	public long getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(long codCliente) {
		this.codCliente = codCliente;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getApeCliente() {
		return apeCliente;
	}
	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}
	public double getCreditoCliente() {
		return creditoCliente;
	}
	public void setCreditoCliente(double creditoCliente) {
		this.creditoCliente = creditoCliente;
	}
	public String getSexoCliente() {
		return sexoCliente;
	}
	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}
	
	
}
