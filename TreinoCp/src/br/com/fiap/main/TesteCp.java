package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCp {

	public static void main(String[] args) {
	
		Cliente objCliente = new Cliente ();
		Endereco objEndereco = new Endereco ();
		Telefone objTelefone = new Telefone ();
		
		objCliente.setNome("Elen Cabral");
		objCliente.setIdade(18);
		objCliente.setPeso(65);
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		
		objEndereco.setBairro("prosperidade");
		objEndereco.setLogradouro("rua");
		objEndereco.setCidade("scs");
		objEndereco.setNumero(203);
		objEndereco.setCep(00000000);
		
		objTelefone.setCelular("11900000000");
		objTelefone.setFixo("0000-0000");
		
		System.out.println("Nome: " + objCliente.getNome()+
				"\nIdade: " + objCliente.getIdade()+
				"\nPeso: " + objCliente.getPeso()+
				"\nBairro: "+ objEndereco.getBairro()+
				"\nLogradouro: "+ objEndereco.getLogradouro()+
				"\nCidade: "+ objEndereco.getCidade()+
				"\nNumero: "+ objEndereco.getNumero()+
				"\nCep: "+ objEndereco.getCep()+
				"\nCelular: "+ objTelefone.getCelular()+
				"\nFixo: "+ objTelefone.getFixo());
		
	}

}
