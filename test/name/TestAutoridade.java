/**
 * 
 */
package name;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author masilva
 *
 */
public class TestAutoridade {

	@Test
	public void testInformal() {
		Informal inf = new Informal();
		Autoridade a = new Autoridade("Marcia", "Silva", inf);
		assertEquals("Marcia",a.getTratamento());
	}
	
	@Test 
	public void testRespeitoso(){
		Respeitoso respeitoso = new Respeitoso("feminino");
		Autoridade a = new Autoridade("Marcia", "Silva", respeitoso);
		
		assertEquals("Sra. Silva",a.getTratamento());
	}
	
	@Test
	public void testComTitulo(){
		ComTitulo title = new ComTitulo("Respeitosa");
		Autoridade a = new Autoridade("Marcia", "Silva", title);
		assertEquals("Respeitosa Marcia Silva",a.getTratamento());

	}

}
