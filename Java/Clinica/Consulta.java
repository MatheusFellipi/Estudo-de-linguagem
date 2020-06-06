import java.util.ArrayList;

/**
 * Consulta
 */
public class Consulta {

    private Medica medico;
    private Paciente paciente;
    private Secretario secretario;
    private PlanoDeSaude planoDeSaude;
    private String horaConsulta;
    
    private ArrayList<String> sistoma;
    private ArrayList<String> medcamentos;
    private ArrayList<String> exames;





    public Consulta(Medica medico, Paciente paciente, Secretario secretario, PlanoDeSaude planoDeSaude, String horaConsulta, ArrayList<String> sistoma, ArrayList<String> medcamentos, ArrayList<String> exames) {
        if (planoDeSaude != null && medico.getPlanoDeSaude().contains(planoDeSaude)) {
            
            this.medico = medico;
            this.paciente = paciente;
            this.secretario = secretario;
            this.planoDeSaude = planoDeSaude;
            this.horaConsulta = horaConsulta;
            this.sistoma =new ArrayList<String>();
            this.medcamentos =new ArrayList<String>();
            this.exames = new ArrayList<String>();
            System.out.println("consulta marcada com sucesso");
        }
        System.out.println("o medico nao atentende pelo plano de saude");

       
    }

    public Medica getMedico() {
        return this.medico;
    }

    public void setMedico(Medica medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Secretario getSecretario() {
        return this.secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return this.planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public String getHoraConsulta() {
        return this.horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public ArrayList<String> getSistoma() {
        return this.sistoma;
    }

    public void setSistoma(ArrayList<String> sistoma) {
        this.sistoma = sistoma;
    }

    public ArrayList<String> getMedcamentos() {
        return this.medcamentos;
    }

    public void setMedcamentos(ArrayList<String> medcamentos) {
        this.medcamentos = medcamentos;
    }

    public ArrayList<String> getExames() {
        return this.exames;
    }

    public void setExames(ArrayList<String> exames) {
        this.exames = exames;
    }

    public boolean addSistoma(String sistoma) {
        return this.sistoma.add(sistoma);
        
    }


}