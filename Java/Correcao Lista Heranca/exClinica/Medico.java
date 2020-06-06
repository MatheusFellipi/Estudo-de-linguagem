package exClinica;

import java.util.ArrayList;

public class Medico extends Funcionario{
	private String crm;
	private Especialidade especialidade;
	private ArrayList<PlanoSaude> planosSaude;
	private String horaInicio;
	private String horaFim;
	
	
	public Medico(String nome, String telefone, String endereco, String cpf, double salario, String crm,
			Especialidade especialidade, String horaInicio, String horaFim) {
		super(nome, telefone, endereco, cpf, salario);
		this.crm = crm;
		this.planosSaude = new ArrayList<PlanoSaude>();
		this.especialidade = especialidade;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public ArrayList<PlanoSaude> getPlanosSaude() {
		return planosSaude;
	}

	public void setPlanosSaude(ArrayList<PlanoSaude> planosSaude) {
		this.planosSaude = planosSaude;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
	
	public boolean addPlanoSaude(PlanoSaude planoSaude) {
		this.planosSaude.add(planoSaude);
		return true;
	}
	
	public boolean removePlanoSaude(PlanoSaude planoSaude) {
		return this.planosSaude.remove(planoSaude);
	}
}
