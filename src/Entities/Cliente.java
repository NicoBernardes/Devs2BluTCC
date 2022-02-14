package Entities;

public class Cliente {

	private int id;
	private String nome_cliente;
	private String endereco_cliente;
	private int tel_movel_cliente1;
	private int tel_movel_cliente2;
	private int tel_fixo_cliente;
	private String obs;

	public Cliente(int id, String nome_cliente, String endereco_cliente, int tel_movel_cliente1, int tel_fixo_cliente,
			String obs) {
		super();
		this.id = id;
		this.nome_cliente = nome_cliente;
		this.endereco_cliente = endereco_cliente;
		this.tel_movel_cliente1 = tel_movel_cliente1;
		this.tel_fixo_cliente = tel_fixo_cliente;
		this.obs = obs;
	}

	public Cliente () {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getEndereco_cliente() {
		return endereco_cliente;
	}

	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}

	public int getTel_movel_cliente1() {
		return tel_movel_cliente1;
	}

	public void setTel_movel_cliente1(int tel_movel_cliente1) {
		this.tel_movel_cliente1 = tel_movel_cliente1;
	}

	public int getTel_fixo_cliente() {
		return tel_fixo_cliente;
	}

	public void setTel_fixo_cliente(int tel_fixo_cliente) {
		this.tel_fixo_cliente = tel_fixo_cliente;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public int getTel_movel_cliente2() {
		return tel_movel_cliente2;
	}

	public void setTel_movel_cliente2(int tel_movel_cliente2) {
		this.tel_movel_cliente2 = tel_movel_cliente2;
	}

	public String getData_Nasc() {
		return null;
	}

	public String getCpf() {
		return null;
	}

	public String getCnpj() {
		return null;
	}

	public int getRgNum() {
		return 0;
	}

	public String getDataNasc() {
		return null;
	}

}