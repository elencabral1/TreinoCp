package br.com.fiap.beans;

public class Telefone {

	private String celular;
	private String fixo;
	
	//setters(entradas)
	public void setCelular(String celular){
		this.celular = celular;
	}
	public void setFixo(String fixo){
		this.fixo = fixo;
	}
	
	//getters(saidas)
	public String getCelular(){
		return celular;
	}
	public String getFixo(){
		return fixo;
	}
	
}
