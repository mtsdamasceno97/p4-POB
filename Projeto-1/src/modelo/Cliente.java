package modelo;

import java.util.ArrayList;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String endereco;
	private int idade;
	private ArrayList<Aluguel> aluguel = new ArrayList<Aluguel>();
	
	
	// CONSTRUTOR
	public Cliente (String cpf, String nome, String endereco, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}

	//GET & SET
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public ArrayList<Aluguel> getAluguel() {
		return aluguel;
	}
	public void setAluguel(Aluguel aluguel) {
		this.aluguel.add(aluguel);
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + "]";
	}
		
}
