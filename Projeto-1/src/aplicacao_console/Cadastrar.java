package aplicacao_console;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POB - Persistencia de Objetos
 * Prof. Fausto Ayres
 *
 */

import fachada.Fachada;
import modelo.Cliente;


public class Cadastrar {

	public Cadastrar(){
		try {
			Fachada.inicializar();
			Cliente c;
//			Telefone t;
			System.out.println("cadastrando...");
			c=Fachada.cadastrarCliente("123456781", "joao", "paulo freire", 31);
//			t=Fachada.adicionarTelefonePessoa("joao","88880000");
//			t=Fachada.adicionarTelefonePessoa("joao","88881111");	
			System.out.println(c);
			
			c=Fachada.cadastrarCliente("123456782", "maria", "paulo ricardo goulart", 25);
//			t=Fachada.adicionarTelefonePessoa("maria","87882222");
//			t=Fachada.adicionarTelefonePessoa("maria","88883333");
			System.out.println(c);

			c=Fachada.cadastrarCliente("123456783", "jose", "epitacio pessoa", 45);
//			t=Fachada.adicionarTelefonePessoa("jose","87884444");
			System.out.println(c);

//			p=Fachada.cadastrarAluno("paulo", 9);
//			System.out.println(p);
//
//			p=Fachada.cadastrarProfessor("fausto", 1000.0);
//			System.out.println(p);

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


