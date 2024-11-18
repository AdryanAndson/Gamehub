package Loja;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	// Atributos
	private List<Game> games;

	// Construtor
	public Cart() {
		this.games = new ArrayList<>();
	}

	// Métodos
	public void addGame(Game game) {
		games.add(game);
	}

	// Métodos
	public void viewCart() {
		if (games.isEmpty()) {
			System.out.println("Esta vazio!");

		} else {
			for (Game game : games) {
				System.out.println(game);
			}
		}
	}

	// Métodos
	public double getTotal() {
		double total = 0;
		for (Game game : games) {
			total += game.getPrice();
		}
		return total;
	}
}
