package Entities;

public class PessoaFisica extends Cliente {

	private String cpf;
	private int rgNum;
	private String dataNasc;

	public PessoaFisica(int id, String nome_cliente, String endereco_cliente, int tel_movel_cliente1,
			int tel_fixo_cliente, String obs, String cpf, int rgNum, String dataNasc) {
		super(id, nome_cliente, endereco_cliente, tel_movel_cliente1, tel_fixo_cliente, obs);
		this.cpf = cpf;
		this.rgNum = rgNum;
		this.dataNasc = dataNasc;
	}

	public PessoaFisica() {
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getRgNum() {
		return rgNum;
	}

	public void setRgNum(int rgNum) {
		this.rgNum = rgNum;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

}
