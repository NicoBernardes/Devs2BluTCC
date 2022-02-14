package DaoEntities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Entities.Cliente;
import Interface.DaoInterface.DaoInferface;
import Utils.Conexao;

public class DaoCliente implements DaoInferface<Cliente> {

	@Override
	public boolean salvarPf(Cliente t) {
		Connection con = Conexao.conectar();
		String sql = "insert into Cliente(nome_cliente, data_nasc, cpf, rgnum, endereco_cliente, tel_movel_cliente1, tel_movel_cliente2, tel_fixo_cliente, obs) values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNome_cliente());
			stm.setString(2, t.getDataNasc());
			stm.setString(3, t.getCpf());
			stm.setInt(4, t.getRgNum());
			stm.setString(5, t.getEndereco_cliente());
			stm.setInt(6, t.getTel_movel_cliente1());
			stm.setInt(7, t.getTel_movel_cliente2());
			stm.setInt(8, t.getTel_fixo_cliente());
			stm.setString(9, t.getObs());
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
	
	@Override
	public boolean salvarPj(Cliente t) {
		Connection con = Conexao.conectar();
		String sql = "insert into Cliente(nome_cliente, cnpj, endereco_cliente, tel_movel_cliente1, tel_fixo_cliente, obs) values(?,?,?,?,?,?)";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNome_cliente());
			stm.setString(2, t.getCnpj());
			stm.setString(3, t.getEndereco_cliente());
			stm.setInt(4, t.getTel_movel_cliente1());
			stm.setInt(5, t.getTel_fixo_cliente());
			stm.setString(6, t.getObs());
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

	@Override
	public boolean update(Cliente t) {
		return false;
	}

	@Override
	public boolean excluir(int id) {
		return false;
	}

	@Override
	public boolean excluir(Cliente t) {
		return false;
	}

	@Override
	public Cliente retornarUm(int id) {
		return null;
	}

	@Override
	public List<Cliente> retornarTodos() {
		return null;
	}



	
}
