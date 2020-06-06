package exClinica;

import java.util.ArrayList;

public class Clinica extends PessoaJuridica{
	private String crm;
	private ArrayList<Funcionario> funcionarios;
	
//	ArrayList<Medico> medicos;
//	ArrayList<Secretario> secretarios;
	
	
	public Clinica(String nome, String endereco, String telefone, String cnpj, String crm) {
		super(nome, endereco, telefone, cnpj);
		this.crm = crm;
		this.funcionarios = new ArrayList<Funcionario>();
	}


	public Clinica(String nome, String endereco, String telefone, String cnpj, String crm,
			ArrayList<Funcionario> funcionarios) {
		super(nome, endereco, telefone, cnpj);
		this.crm = crm;
		this.funcionarios = funcionarios;
	}



	public String getCrm() {
		return this.crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public boolean addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		return true;
	}
	public boolean removeFuncionario(Funcionario funcionario) {
		return this.funcionarios.remove(funcionario);
	}
}
