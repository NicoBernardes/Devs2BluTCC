package DaoEntities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Entities.Funcionario;
import Interface.DaoInterface.DaoInferface;
import Utils.Conexao;

public class DaoFuncionario implements DaoInferface<Funcionario> {

	public boolean salvar(Funcionario t) {
		Connection con = Conexao.conectar();
		String sql = "insert into Funcionario(nome_func, cpf_func, endereco_func, telefone_func, dt_contratacao, salario_bruto, funcao) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNomeFunc());
			stm.setString(2, t.getCpfFunc());
			stm.setString(3, t.getEnderecoFunc());
			stm.setInt(4, t.getTelFunc());
			stm.setString(5, t.getDtContrat());
			stm.setDouble(6, t.getSalarioBruto());
			stm.setString(7, t.getFuncao());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	

	public boolean update(Funcionario t) {
		return false;
	}


	public boolean excluir(int id) {
		return false;
	}


	public boolean excluir(Funcionario t) {
		return false;
	}


	public Funcionario retornarUm(int id) {
		return null;
	}

	public List<Funcionario> retornarTodos() {
		return null;
	}


	public boolean salvarPf(Funcionario t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean salvarPj(Funcionario t) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
