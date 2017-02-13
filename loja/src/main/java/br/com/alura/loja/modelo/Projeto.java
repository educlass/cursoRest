package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {
	
	private String nome;
	private long id;
	private int anoInicio;

	public Projeto() {
		// TODO Auto-generated constructor stub
	}
	
	public Projeto(String nome, long id, int anoInicio) {
		this.nome = nome;
		this.id = id;
		this.anoInicio = anoInicio;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}
	
	public String toXML() {
		XStream xt = new XStream();
        return  xt.toXML(this);
	}

}
