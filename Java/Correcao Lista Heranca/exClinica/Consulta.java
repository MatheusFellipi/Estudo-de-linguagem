package exClinica;

import java.util.ArrayList;

public class Consulta {
	private Medico medico;
	private Paciente paciente;
	private Secretario secretario;
	private PlanoSaude planoSaude;
	private String horaConsulta;
	
	private ArrayList<String> sintomas;
	private ArrayList<String> medicamentos;
	private ArrayList<String> exames;
	
	public Consulta(Medico medico, Paciente paciente, Secretario secretario, PlanoSaude planoSaude,
			String horaConsulta) {
		super();
		if(planoSaude != null && medico.getPlanosSaude().contains(planoSaude)) {
			this.medico = medico;
			this.paciente = paciente;
			this.secretario = secretario;
			this.planoSaude = planoSaude;
			this.horaConsulta = horaConsulta;
			
			this.sintomas = new ArrayList<String>();
			this.medicamentos = new ArrayList<String>();
			this.exames = new ArrayList<String>();
			System.out.println("Consulta marcada com sucesso!");
		}else {
			
			System.out.println("O médico não atende pelo Plano de Saúde!");
		}
		
		
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Secretario getSecretario() {
		return secretario;
	}

	public void setSecretario(Secretario secretario) {
		this.secretario = secretario;
	}

	public PlanoSaude getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(PlanoSaude planoSaude) {
		this.planoSaude = planoSaude;
	}

	public String getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public ArrayList<String> getSintomas() {
		return sintomas;
	}

	public void setSintomas(ArrayList<String> sintomas) {
		this.sintomas = sintomas;
	}

	public ArrayList<String> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(ArrayList<String> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public ArrayList<String> getExames() {
		return exames;
	}

	public void setExames(ArrayList<String> exames) {
		this.exames = exames;
	}
	
	public boolean addSintoma(String sintoma) {
		this.sintomas.add(sintoma);
		return true;
	}
	public boolean removeSintoma(String sintoma) {
		return this.sintomas.remove(sintoma);
	}
	
	public boolean addMedicamento(String medicamento) {
		this.medicamentos.add(medicamento);
		return true;
	}
	public boolean removeMedicamento(String medicamento) {
		return this.medicamentos.remove(medicamento);
	}
	
	public boolean addExame(String exame) {
		this.exames.add(exame);
		return true;
	}
	public boolean removeExame(String exame) {
		return this.exames.remove(exame);
	}
	
	
	
	
}
