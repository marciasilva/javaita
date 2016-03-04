package pizza;
import java.util.HashMap;


public class Pizza {
	
	private HashMap<String, Integer> ingredientes; 
	static HashMap<String, Integer> totalIngredientes; 
	
	public Pizza(){
		this.ingredientes = new HashMap<String, Integer>();
		totalIngredientes = new HashMap<String, Integer>();

	}
	
	public boolean isEmpty(){
		return ingredientes.isEmpty();
	}
	
	public void adicionaIngrediente(String newItem){
		if(!ingredientes.containsKey(newItem)){
			ingredientes.put(newItem, 1);
		}
		else{
			Integer qtd = ingredientes.get(newItem);
			qtd += 1;
			ingredientes.put(newItem, qtd);
		}
		contabilizaIngrediente(newItem);
	}
	
	private static void contabilizaIngrediente(String newItem){
		
		if(!totalIngredientes.containsKey(newItem)){
			totalIngredientes.put(newItem, 1);
		}
		else{
			Integer qtd = totalIngredientes.get(newItem);
			qtd += 1;
			totalIngredientes.put(newItem, qtd);
		}
	}
	
	public void printIngredientes(){
		for(String key : totalIngredientes.keySet()){
			System.out.println(key  + " - " + totalIngredientes.get(key));
		}
	}
	
	public int getPreco(){
		int qtd = 0;
		
		for (Integer v : ingredientes.values()) {
		    qtd += v.intValue(); 
		}
		if(qtd <= 2){
			return 15;
		}
		else if(qtd >=3 && qtd < 5){
			return 20;
		}
		else
			return 23;
	}
}
