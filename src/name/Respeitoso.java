/**
 * 
 */
package name;

/**
 * @author masilva
 *
 */
public class Respeitoso implements FormatadorNome {
	
	private String genero;
	
	
	public Respeitoso(String genero){
		this.genero = genero;
	}
	
	public String formatarNome(String nome, String sobrenome){
		if(this.genero.equals("masculino")){
			return "Sr. " + sobrenome;
		}
		else{
			return "Sra. " + sobrenome;
		}
	}

}
