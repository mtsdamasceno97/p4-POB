package modelo;

import java.time.LocalDateTime;

public class Aluguel {

	private LocalDateTime dataAluguel;
	private LocalDateTime dataDevolucao;
	private double valorDiaria;
	private Veiculo veiculo;
	private Cliente cliente;
	
	// CONSTRUTOR
	public Aluguel(LocalDateTime dataAluguel, LocalDateTime dataDevolucao, double valorDiaria, Cliente cliente, Veiculo veiculo) {
		super();
		this.dataAluguel = dataAluguel;
		this.dataDevolucao = dataDevolucao;
		this.valorDiaria = valorDiaria;
		this.cliente = cliente;
		this.veiculo = veiculo;
	}
	
	// GET & SET
	public LocalDateTime getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(LocalDateTime dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDateTime dataDevolucao) {
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
				+ valorDiaria + "]";
	}
		
}
