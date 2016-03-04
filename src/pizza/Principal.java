package pizza;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cria 3 pizzas com ingredientes diferentes
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		//Adiciona ingredientes nas pizzas
		pizza1.adicionaIngrediente("cebola");
		pizza1.adicionaIngrediente("calabresa");
		pizza1.adicionaIngrediente("queijo");
		
		pizza2.adicionaIngrediente("presunto de parma");
		pizza2.adicionaIngrediente("alecrim");
		
		pizza3.adicionaIngrediente("frango desfiado");
		pizza3.adicionaIngrediente("abacaxi");
		pizza3.adicionaIngrediente("queijo");
		
		//Adiciona essas Pizzas em um CarrinhoDeCompra
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pizza1);
		carrinho.addPizza(pizza2);
		carrinho.addPizza(pizza3);
		
		//Imprime o total do CarrinhoDeCompra
		System.out.println("Total de pizzas no carrinho: " + carrinho.totalPizzas());
		System.out.println("Valor total: R$ " + carrinho.valorTotal());
		
		System.out.println("Total de cada ingrediente: ");
		pizza3.printIngredientes();
		
	}

}
