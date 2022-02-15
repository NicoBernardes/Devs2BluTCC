package Entities;

public class Funcionario {

	private int idFuncionario;
	private String nomeFunc;
	private String enderecoFunc;
	private int telFunc;
	private String cpfFunc;
	private String dtContrat;
	private double salarioBruto;
	private String funcao;

	public Funcionario() {

	}

	public Funcionario(int idFuncionario, String nomeFunc, String enderecoFunc, int telFunc, String cpfFunc,
			String dtContrat, double salarioBruto, String funcao) {
		super();
		this.idFuncionario = idFuncionario;
		this.nomeFunc = nomeFunc;
		this.enderecoFunc = enderecoFunc;
		this.telFunc = telFunc;
		this.cpfFunc = cpfFunc;
		this.dtContrat = dtContrat;
		this.salarioBruto = salarioBruto;
		this.funcao = funcao;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getEnderecoFunc() {
		return enderecoFunc;
	}

	public void setEnderecoFunc(String enderecoFunc) {
		this.enderecoFunc = enderecoFunc;
	}

	public int getTelFunc() {
		return telFunc;
	}

	public void setTelFunc(int telFunc) {
		this.telFunc = telFunc;
	}

	public String getDtContrat() {
		return dtContrat;
	}

	public void setDtContrat(String dtContrat) {
		this.dtContrat = dtContrat;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCpfFunc() {
		return cpfFunc;
	}

	public void setCpfFunc(String cpfFunc) {
		this.cpfFunc = cpfFunc;
	}

}
