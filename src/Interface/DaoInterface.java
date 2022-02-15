package Interface;

import java.util.List;

import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public interface DaoInterface {

	public interface DaoInferface<T> {
		public boolean salvar (T t);
		public boolean salvarPf (T t);
		public boolean salvarPj (T t);
		public boolean update(T t);
		public boolean excluir(int id);
		public boolean excluir(T t);
		public T retornarUm(int id);
		public List<T> retornarTodos();
		boolean update(PessoaFisica t);
		boolean update(PessoaJuridica t);
	}
	
}
