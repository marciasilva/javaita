/**
 * 
 */
package name;

/**
 * @author masilva
 *
 */
public class Autoridade {

	private String name;
	private String surname;
	
	private FormatadorNome formatter;
	
	public Autoridade(String name, String surname, FormatadorNome formatter){
		this.name = name;
		this.surname = surname;
		this.formatter = formatter;
	}
	
	public String getTratamento(){
		return formatter.formatarNome(this.name, this.surname);
		
	}
}
