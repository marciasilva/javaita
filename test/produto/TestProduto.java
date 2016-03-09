/**
 * 
 */
package produto;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author masilva
 *
 */
public class TestProduto {

	@Test
	public void testEqualsWithDiffPrice(){
		Produto p1 = new Produto();
		p1.setName("sandalia");
		p1.setPrice(169.90);
		p1.setCode("sl35");
		
		Produto p2 = new Produto();
		p1.setName("sandalia");
		p1.setPrice(129.90);
		p1.setCode("sl35");
		
		assertEquals(false, p1.equals(p2));
	}
	
	@Test
	public void testEqualsWithDiffCode(){
		Produto p1 = new Produto();
		p1.setName("sandalia");
		p1.setPrice(129.90);
		p1.setCode("sl35");
		
		Produto p2 = new Produto();
		p1.setName("sandalia");
		p1.setPrice(129.90);
		p1.setCode("sl36");
		
		assertEquals(false, p1.equals(p2));
	}
	
	@Test
	public void testEqualsWithDiffName(){
		Produto p1 = new Produto();
		p1.setName("sandalia");
		p1.setPrice(129.90);
		p1.setCode("ac36");
		
		Produto p2 = new Produto();
		p1.setName("bolsa");
		p1.setPrice(129.90);
		p1.setCode("ac36");
		
		assertEquals(false, p1.equals(p2));
	}
}
