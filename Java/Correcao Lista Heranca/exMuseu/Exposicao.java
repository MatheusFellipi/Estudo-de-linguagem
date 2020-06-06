package exMuseu;

import java.util.ArrayList;

public class Exposicao {
	private String nome;
	private String dataInicio;
	private String dataFim;
	ArrayList<ObraArte> obras;
	
//	ArrayList<Pintura> pintura;
//	ArrayList<Outros> outros;
//	ArrayList<Escultura> escultura;
//	ArrayList<Estatuaria> estatuaria;
	
	public Exposicao(String nome, String dataInicio, String dataFim) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.obras = new ArrayList<ObraArte>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public ArrayList<ObraArte> getObras() {
		return obras;
	}
	public void setObras(ArrayList<ObraArte> obras) {
		this.obras = obras;
	}
	public boolean addObraArte(ObraArte obra) {
		if(!obra.isObraExposta()) {
			obra.exporObraExposicao();
			this.obras.add(obra);
			return true;
		}
		return false;
	}
	
	public boolean removeObraArte(ObraArte obra) {
		if(this.obras.remove(obra)) {
			obra.retirarObraExposicao();
			return true;
		}
		return false;
	}
	
}
