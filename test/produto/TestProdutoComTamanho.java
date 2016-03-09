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
public class TestProdutoComTamanho {

	@Test
	public void testEqualsWithDiffTamanho(){
		ProdutoComTamanho p1 = new ProdutoComTamanho();
		p1.setName("sandalia");
		p1.setTamanho("35");
		p1.setPrice(169.90);
		p1.setCode("sl35");
		
		ProdutoComTamanho p2 = new ProdutoComTamanho();
		p2.setName("sandalia");
		p2.setTamanho("36");
		p2.setPrice(169.90);
		p2.setCode("sl35");
		
		assertEquals(false, p1.equals(p2));
	}
	
	@Test
	public void testEqualsWithSameTamanho(){
		ProdutoComTamanho p1 = new ProdutoComTamanho();
		p1.setName("sandalia");
		p1.setTamanho("35");
		p1.setPrice(169.90);
		p1.setCode("sl35");
		
		ProdutoComTamanho p2 = new ProdutoComTamanho();
		p2.setName("sandalia");
		p2.setTamanho("35");
		p2.setPrice(169.90);
		p2.setCode("sl35");
		
		assertEquals(true, p1.equals(p2));
	}
}
