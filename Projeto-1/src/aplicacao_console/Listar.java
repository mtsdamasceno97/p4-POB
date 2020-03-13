package aplicacao_console;

import fachada.Fachada;

public class Listar {

	public Listar(){
		Fachada.inicializar();
		try {
			System.out.println(Fachada.listarClientes());
			//System.out.println(Fachada.listarAlunos());
			//System.out.println(Fachada.listarTelefones());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Fachada.finalizar();
		System.out.println("fim do programa");
	}


	//=================================================
	public static void main(String[] args) {
		new Listar();
	}
}
