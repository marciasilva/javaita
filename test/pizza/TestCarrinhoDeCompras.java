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
public class TestCarrinhoDeCompras {

	@Test
	public void addPizzaSemIngrediente(){
		Pizza p = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.addPizza(p);
		assertTrue(carrinho.totalPizzas() == 0);
	}
	
	@Test
	public void verificaPrecoTotal(){
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		
		pizza1.adicionaIngrediente("cebola");
		pizza1.adicionaIngrediente("calabresa");
		pizza1.adicionaIngrediente("queijo");
		
		pizza2.adicionaIngrediente("presunto de parma");
		pizza2.adicionaIngrediente("alecrim");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pizza1);
		carrinho.addPizza(pizza2);
		assertTrue(carrinho.valorTotal() == 35);
	}
}
