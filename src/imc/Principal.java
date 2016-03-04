package imc;

public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente(49.8, 1.52);
		Paciente paciente2 = new Paciente(60.7, 1.48);
		Paciente paciente3 = new Paciente(70.9, 1.75);
		
		System.out.println("Paciente 1: " + paciente1.diagnostico());
		System.out.println("Paciente 2: " + paciente2.diagnostico());
		System.out.println("Paciente 3: " + paciente3.diagnostico());
	}

}
