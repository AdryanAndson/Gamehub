package Loja;

public class Game {
   //Atributos
	private String name;
	private double price;
	private String category;
	
	
	//Construtor
	public Game (String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Game [" + name + ", price=" + price + " category="+ category + "]";
		
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
}
