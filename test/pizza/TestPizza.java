/**
 * 
 */
package pizza;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author masilva
 *
 */
public class TestPizza {

	@Test
	public void testEmpty() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("frango");
		p.adicionaIngrediente("abacaxi");
		assertEquals(false, p.isEmpty());

	}
	
	@Test
	public void testPrice(){
		Pizza p = new Pizza();
		p.adicionaIngrediente("frango");
		p.adicionaIngrediente("abacaxi");
		assertEquals(15, p.getPreco());
	}

}
