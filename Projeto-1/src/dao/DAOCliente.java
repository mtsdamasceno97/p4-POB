package dao;

import java.util.List;
import com.db4o.query.Query;
import modelo.Cliente;

public class DAOCliente  extends DAO<Cliente>{

	//nome é campo unico 
	public Cliente read (Object chave) {
		String nome = (String) chave;	//casting para o tipo da chave
		Query q = manager.query();
		q.constrain(Cliente.class);
		q.descend("nome").constrain(nome);
		List<Cliente> resultados = q.execute();
		if (resultados.size()>0)
			return resultados.get(0);
		else
			return null;
	}


	/**********************************************************
	 * 
	 * TODAS AS CONSULTAS DE PESSOA
	 * 
	 **********************************************************/
//	public  List<Pessoa> consultarPessoasPorParteNome(String caracteres) {
//		Query q = manager.query();
//		q.constrain(Pessoa.class);
//		q.descend("nome").constrain(caracteres).like();
//		List<Pessoa> result = q.execute(); 
//		return result;
//	}
//
//	public List<Pessoa>  consultarPessoasNTelefones(int n) {
//		Query q = manager.query();
//		q.constrain(Pessoa.class);
//		q.constrain(new Filtro(n));
//		List<Pessoa> result = q.execute(); 
//		return result;
//	}
//
//	public int consultarTotalAlunos() {
//		Query q = manager.query();
//		q.constrain(Aluno.class);
//		int total = q.execute().size(); 
//		return total;
//	}
//
//	public Pessoa consultarPessoaPorNumero(String n){
//		Query q = manager.query();
//		q.constrain(Pessoa.class);
//		q.descend("telefones").descend("numero").constrain(n);
//		List<Pessoa> resultados = q.execute();
//		if(resultados.size()==0)
//			return null;
//		else
//			return resultados.get(0);
//
//	}
//	
//}
//
//
///*-------------------------------------------------*/
//@SuppressWarnings("serial")
//class Filtro  implements Evaluation {
//	private int n;
//	public Filtro (int n) {this.n=n;}
//	public void evaluate(Candidate candidate) {
//		Pessoa p = (Pessoa) candidate.getObject();
//		candidate.include( p.getTelefones().size()==n);
//	}
////	private boolean compara(Pessoa p, int n) {
////		return p.getTelefones().size()==n;
////	}
}

