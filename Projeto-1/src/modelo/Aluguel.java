package modelo;

import java.sql.Date;
import java.time.LocalDate;


public class Aluguel {

	private LocalDate dataAluguel;
	private String dataDevolucao;
	private double valorDiaria;
	private Veiculo veiculo;
	private Cliente cliente;
	
	// CONSTRUTOR
	public Aluguel(String dataDevolucao, double valorDiaria, Cliente cliente, Veiculo veiculo) {
		super();
		this.dataAluguel = LocalDate.now();
		this.dataDevolucao = dataDevolucao;
		this.valorDiaria = valorDiaria;
		this.cliente = cliente;
		this.veiculo = veiculo;
	}
	
	// GET & SET
	public LocalDate getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(LocalDate dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public String toString() {
		return "Aluguel [dataAluguel=" + dataAluguel + ", dataDevolucao=" + dataDevolucao + ", valorDiaria="
				+ valorDiaria + ", veiculo=" + veiculo + ", cliente=" + cliente + "]";
	}


	
		
}
