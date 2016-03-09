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
public class TestCarrinhoDeCompra {

	@Test
	public void testRemoveProductDiffTamanho() {
		
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
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionaProduto(p1, 2);
		carrinho.adicionaProduto(p2, 2);
		
		carrinho.removeProduct(p1, 1);
		
		assertTrue(3 == carrinho.getTotalItems());
				
	}
	
	@Test
	public void testTotalPrice(){
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
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionaProduto(p1, 2);
		carrinho.adicionaProduto(p2, 2);
		
		assertTrue(679.60 == carrinho.getTotalPrice());
	}

}
