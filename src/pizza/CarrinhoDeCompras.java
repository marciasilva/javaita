package pizza;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private ArrayList<Pizza> pizzas;
	
	public CarrinhoDeCompras(){
		this.pizzas = new ArrayList<Pizza>();
	}
	
	public void addPizza(Pizza pizza){
		//Add only if pizza has one or more ingredientes
		if(!pizza.isEmpty())
			pizzas.add(pizza);
	}
	
	public int totalPizzas(){
		return pizzas.size();
	}
	
	public int valorTotal(){
		int valorTotal = 0;
		 for (Pizza p : pizzas){
			valorTotal += p.getPreco(); 
		 }
		 return valorTotal;
	}
	
}
