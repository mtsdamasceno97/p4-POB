package aplicacao_console;

import fachada.Fachada;

public class Deletar {

	public Deletar(){
		Fachada.inicializar();
		try {
			//System.out.println("deletando...");
			//Fachada.excluirCliente("123456782");
			//System.out.println("deletou cliente do cpf: 123456782");
			Fachada.excluirAluguel("AAA1111");
			System.out.println("deletou aluguel");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Fachada.finalizar();
		System.out.println("fim do programa");
	}



	//=================================================
	public static void main(String[] args) {
		new Deletar();
	}
}


