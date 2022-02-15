package DaoEntities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.Cliente;
import Entities.PessoaFisica;
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
	public boolean update(PessoaFisica t) {
		Connection con = Conexao.conectar();
		String sql = "update Cliente set nome_cliente = ?, data_nasc = ?,  cpf = ?, rgnum = ?, endereco_cliente = ?, tel_movel_cliente1 = ?, tel_movel_cliente2 = ?, tel_fixo_cliente = ?, obs = ?";
		sql += " where id = ?";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNome_cliente());
			stm.setString(2, t.getData_Nasc());
			stm.setString(3, t.getCpf());
			stm.setInt(4, t.getRgNum());
			stm.setString(5, t.getEndereco_cliente());
			stm.setInt(6, t.getTel_movel_cliente1());
			stm.setInt(7, t.getTel_movel_cliente2());
			stm.setInt(8, t.getTel_fixo_cliente());
			stm.setString(9, t.getObs());
			stm.setInt(10, t.getId());

			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(int id) {
		String sql = "delete from Cliente where id = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(Cliente t) {
		return false;
	}

	@Override
	public Cliente retornarUm(int id) {
		Cliente cliente = null;
		String sql = "select * from Cliente where id = " + id;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				cliente = new Cliente();
				cliente.setId(rs.getInt("id_cliente"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

	@Override
	public List<Cliente> retornarTodos() {
		List<Cliente> clientes = new ArrayList<>();
		String sql = "select * from Cliente";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id_cliente"));
				cliente.setNome_cliente(rs.getString("nome_cliente"));
				cliente.setEndereco_cliente(rs.getString("endereco_cliente"));
				cliente.setTel_movel_cliente1(rs.getInt("tel_movel_cliente1"));
				cliente.setTel_movel_cliente2(rs.getInt("tel_movel_cliente2"));
				cliente.setTel_fixo_cliente(rs.getInt("tel_fixo_cliente"));
				cliente.setObs(rs.getString("obs"));
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	@Override
	public boolean salvar(Cliente t) {
		// TODO Auto-generated method stub
		return false;
	}

}
