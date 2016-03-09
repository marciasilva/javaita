/**
 * 
 */
package produto;

import java.util.HashMap;

/**
 * @author masilva
 *
 */
public class CarrinhoDeCompra {
	private HashMap<ProdutoComTamanho, Integer> carrinho;

	public CarrinhoDeCompra(){
		this.carrinho = new HashMap<ProdutoComTamanho, Integer>();
	}

	/**
	 * @return the carrinho
	 */
	public HashMap<ProdutoComTamanho, Integer> getCarrinho() {
		return carrinho;
	}

	
	public void setCarrinho(HashMap<ProdutoComTamanho, Integer> carrinho) {
		this.carrinho = carrinho;
	}
	
	public void adicionaProduto(ProdutoComTamanho product, int number){
		if(!carrinho.containsKey(product)){
			carrinho.put(product, number);
		}
		else{
			Integer qtd = carrinho.get(product);
			qtd += number;
			carrinho.put(product, qtd);
		}
	}
	
	public void removeProduct(ProdutoComTamanho product, int number){
		int currentQtd = carrinho.get(product);
		if(currentQtd - number > 0){
			carrinho.replace(product, currentQtd, currentQtd - number);
		}
		else{
			carrinho.remove(product);
		}
	}
	
	public double getTotalPrice(){
		double totalPrice = 0.0;
		
		for(ProdutoComTamanho product : carrinho.keySet()){
			totalPrice += product.getPrice() * carrinho.get(product);
		}
		
		return totalPrice;
	}
	
	public int getTotalItems(){
		int totalProducts = 0;
		for(Integer qtd : carrinho.values()){
			totalProducts += qtd;
		}
		return totalProducts;
	}
}
