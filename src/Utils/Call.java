package Utils;

import DaoEntities.DaoCliente;
import Entities.Cliente;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class Call {

	public static void addClientePj() {
		DaoCliente dao = new DaoCliente();
		PessoaJuridica pj = new PessoaJuridica();

		pj.setNome_cliente("Sandy Aranda de Souza Bernardes");
		pj.setCnpj("07.663.140/0001-99");
		pj.setEndereco_cliente("Rua Catapimbas lote 111 nº 1723");
		pj.setTel_movel_cliente1(478789321);
		pj.setTel_fixo_cliente(473447894);
		pj.setObs("Qçlaskdm,nqwjehiqjweiojasdk teste teste empresa");

		if (new DaoCliente().salvarPj(pj)) {
			System.out.println("Pessoa jurídica Salva com sucesso!");
		}
	}
	
	public static void addClientePf() {
		DaoCliente dao = new DaoCliente();
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome_cliente("Sandy Aranda de Souza Bernardes");
		pf.setDataNasc("11/12/1999");
		pf.setCpf("111.222.333-44");
		pf.setRgNum(456123789);
		pf.setEndereco_cliente("Rua Capivara 111");
		pf.setTel_movel_cliente1(478888999);
		pf.setTel_fixo_cliente(473331111);
		pf.setObs("Qçlaskdm,nqwjehiqjweiojasdk teste teste teste");
		
		if (new DaoCliente().salvarPf(pf)) {
			System.out.println("Pessoa física Salva com sucesso!");
		}
	}
	
	public static void updateCliente() {
		Cliente cliente = new DaoCliente().retornarUm(1);
		cliente.setNome_cliente("NomeTesteEdição");
		// não finalizado
	}
	
	
	
}
