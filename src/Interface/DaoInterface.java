package Interface;

import java.util.List;

public interface DaoInterface {

	public interface DaoInferface<T> {
		public boolean salvarPf (T t);
		public boolean salvarPj (T t);
		public boolean update(T t);
		public boolean excluir(int id);
		public boolean excluir(T t);
		public T retornarUm(int id);
		public List<T> retornarTodos();
	}
	
}
