package Entities;

public class Contrato {

	private int idContrato;
	private int idCliente;
	private String vendedor;
	private double valor;
	private int qtdParcelas;
	private String objeto;

	public Contrato(int idContrato, int idCliente, String vendedor, double valor, int qtdParcelas, String objeto) {
		super();
		this.idContrato = idContrato;
		this.idCliente = idCliente;
		this.vendedor = vendedor;
		this.valor = valor;
		this.qtdParcelas = qtdParcelas;
		this.objeto = objeto;
	}

	public int getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

}
