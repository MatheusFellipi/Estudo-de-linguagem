package exClinica;

public class Programa {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Clinica1", "Rua O", "1234234", "32.2323.2323/0001-01", "234234");
		
		Secretario secretaria = new Secretario("Secretaria", "(34) 234234-2234", "Rua 1", "111.111.111-11", 1000);
		
		Especialidade cardiologia = new Especialidade("Cardiologia", "234234");
		
		PlanoSaude planoSaude1 = new PlanoSaude("Bradesco", "Rua 05", "(62) 234-2344", "12.344.434-3444");
		Medico medico = new Medico("Medico 01", "(64) 98347-2398", "Rua 02", "000.000.000-00", 10000.00, "234345", cardiologia, "10h", "15h");
		medico.addPlanoSaude(planoSaude1);
		
		clinica.addFuncionario(secretaria);
		clinica.addFuncionario(medico);
		
		PlanoSaude planoSaude2 = new PlanoSaude("Unimed", "Rua 04", "(62) 23422-2344", "12.344.434-3444");
		
		Paciente paciente = new Paciente("Paciente 1", "(11) 3243-3434", "Rua 03", "333.333.333-33", "professor", "10/10/10");
		
		//Essa consulta dará erro pois o plano de saúde não é o atendido pelo médico
		Consulta consultaIncorreta = new Consulta(medico, paciente, secretaria, planoSaude2, "11h");
		
		//Essa dará certo. 
		Consulta consultaCorreta = new Consulta(medico, paciente, secretaria, planoSaude1, "11h");
	
		
		
		
		
		//Utilizado na aula de polimorfismo
//		clinica.getFuncionarios().get(0).getSalario();
//		clinica.getFuncionarios().get(1).getSalario();
//		
//		
//		
//		Funcionario medicoPolimorfismo = new Medico("Medico 01", "(64) 98347-2398", "Rua 02", "000.000.000-00", 10000.00, "234345", cardiologia, "10h", "15h");
//		medicoPolimorfismo = new Secretario("Secretaria", "(34) 234234-2234", "Rua 1", "111.111.111-11", 1000);
//		
//		if(medicoPolimorfismo.getClass() == Medico.class) {
//			((Medico) medicoPolimorfismo).getEspecialidade();
//		}else if(medicoPolimorfismo.getClass() == Secretario.class) {
//			((Secretario) medicoPolimorfismo).getSalario();
//		}
	
		
		
		
		
		
		
		
		
		
	}

}
