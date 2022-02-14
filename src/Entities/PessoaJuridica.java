package Entities;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(int id, String nome_cliente, String endereco_cliente, int tel_movel_cliente1,
			int tel_fixo_cliente, String obs, String cnpj) {
		super(id, nome_cliente, endereco_cliente, tel_movel_cliente1, tel_fixo_cliente, obs);
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
