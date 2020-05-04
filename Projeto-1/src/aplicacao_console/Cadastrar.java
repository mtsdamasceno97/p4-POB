package aplicacao_console;

import java.time.LocalDate;
import java.time.LocalDateTime;

import fachada.Fachada;
import modelo.Aluguel;
import modelo.Cliente;
import modelo.Veiculo;


public class Cadastrar {

	public Cadastrar(){
		try {
			Fachada.inicializar();
			Cliente c6;
			Veiculo v7;
			Aluguel a6;
			  
			System.out.println("cadastrando...");
			c6=Fachada.cadastrarCliente("122558899", "Lukz", "Rua Eliza de Holanda", 112);
			v7=Fachada.cadastrarVeiculo("ABC9876","ww","Gol",2022);
			a6 = Fachada.cadastrarAluguel("22/04/2020", 136,c6,v7);	
			
			
			// ----------------- TESTANDO STATUS DE ALUGUEL
			//Fachada.pesquisarVeiculo("ADE8888");
			Fachada.pesquisarVeiculo("AAA1111");
			//Fachada.pesquisarVeiculo("AAA2222");


		} catch (Exception e) 	{
			System.out.println(e.getMessage());
		}
		finally {
			Fachada.finalizar();
		}

		System.out.println("fim do programa");
	}


	//=================================================
	public static void main(String[] args) {
		new Cadastrar();
	}
}


