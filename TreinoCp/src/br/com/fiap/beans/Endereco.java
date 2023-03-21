package br.com.fiap.beans;

public class Endereco {

	private String bairro;
	private String logradouro;
	private String cidade;
	private int numero;
	private int cep;
	
	//setters(entradas)
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public void setCep(int cep){
		this.cep = cep;
	}
	
	
	//getters(saidas)
	public String getBairro(){
		return bairro;
	}
	public String getLogradouro(){
		return logradouro;
	}
	public String getCidade(){
		return cidade;
	}
	public int getNumero(){
		return numero;
	}
	public int getCep(){
		return cep;
	}
	
	
}
