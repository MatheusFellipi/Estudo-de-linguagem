import java.util.ArrayList;
/**
 * Medica
 */
public class Medica extends Funcionario {

    private String crm;
    private Especialidade especialidade;
    private ArrayList<PlanoDeSaude> planoDeSaude;
    private String horaInicio;
    private String horaFim;

    public Medica(String crm, Especialidade especialidade, ArrayList<PlanoDeSaude> planoDeSaude, String horaInicio,
     String horaFim,double salario,String nome,String telefone, String endereco,String cpf){
        super(salario, nome, telefone, endereco, cpf);
        this.crm = crm;
        this.especialidade = especialidade;
        this.planoDeSaude = new ArrayList<PlanoDeSaude>();
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }
    

    public String getCrm() {
        return this.crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return this.planoDeSaude;
    }

    public void setPlanoDeSaude(ArrayList<PlanoDeSaude> planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public String getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return this.horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    
    public void addPlanoDeSaude(PlanoDeSaude planoDeSaude)
    {
        this.planoDeSaude.add(planoDeSaude);
    }

    public boolean removerPlanoDeSaude(PlanoDeSaude planoDeSaude) {

        return this.planoDeSaude.remove(planoDeSaude);
          
    }
}