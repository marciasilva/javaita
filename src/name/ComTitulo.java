/**
 * 
 */
package name;

/**
 * @author masilva
 *
 */
public class ComTitulo implements FormatadorNome {
	
	private String titulo;
	
	public ComTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String formatarNome(String nome, String sobrenome){
		return this.titulo + " " +  nome +  " " + sobrenome;
	}

}
