package dao;

import java.util.List;
import com.db4o.query.Query;

import modelo.Aluguel;




public class DAOAluguel  extends DAO<Aluguel>{

	//private static DAOVeiculo daoVeiculo = new DAOVeiculo();
	//nome é campo unico 
	public Aluguel read (Object chave) {
		
		String placa = (String) chave;
		Query q = manager.query();
		q.constrain(Aluguel.class);
		q.descend("veiculo").descend("placa").constrain(placa);
		List<Aluguel> resultados = q.execute();
		if (resultados.size()>0)
			return resultados.get(0);
		else
			return null;
	}


	public  Aluguel consultarVeiculoAluguel(Object chave) {
		String placa = (String) chave;
		Query q = manager.query();
		q.constrain(Aluguel.class);
		q.descend("veiculo").descend("placa").constrain(placa).like();
		List<Aluguel> result = q.execute(); 
		if (result.size()>0)
			return result.get(0);
		else
			return null;
	}
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

