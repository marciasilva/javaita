package imc;

public class Paciente {
	
	private double peso;
	private double altura;
	
	
	public Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	private double calcularIMC(){
		return this.peso / (altura * altura);
	}
	
	public String diagnostico(){
		double imc = calcularIMC();
		if(imc < 16){
			return "Baixo peso muito grave";
		}
		else if( 16.0 < imc && imc < 16.99){
			return "Baixo peso grave";
		}
		else if( 17.0 < imc && imc < 18.49){
			return "Baixo peso";
		}
		else if(18.50 < imc && imc < 24.99){
			return "Peso normal";
		}
		else if(25.0 < imc && imc < 29.99){
			return "Sobrepeso";
		}
		else if(30.0 < imc && imc < 34.99){
			return "Obesidade grau I";
		}
		else if(35.0 < imc && imc < 39.99){
			return "Obesidade grau II";
		}
		else{
			return "Obesidade grau III (obesidade mórbida)";
		}
	}
}
