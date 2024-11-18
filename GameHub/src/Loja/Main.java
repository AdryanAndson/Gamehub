package Loja;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Store store = new Store();
		Cart cart = new Cart();

		while (true) {
			System.out.println("======GAMEHUB======");
			store.displayGames();
			System.out.print(
					"Escolha um jogo para adicionar ao carrinho (1-3), ou 0 para ver o carrinho e finalizar a compra: ");
			int choice = scan.nextInt();
			if (choice == 0) {
				cart.viewCart();
				System.out.println("Total: R$" + cart.getTotal());
				System.out.println("Deseja finalizar a compra? (S/N)");
				String choice2 = scan.next();
				if(choice2.equalsIgnoreCase("s")) {
					System.out.println("Compra finalizada com sucesso! Total R$" + cart.getTotal());
					break;
				}else {
					System.out.println("Carrinho nao foi finalizado.");
				}
			}else {
				Game selectedGame = store.getGame(choice);
				if(selectedGame != null) {
					cart.addGame(selectedGame);
					System.out.println("Jogo adicionado ao carrinho!");
				}
				else {
					System.out.println("Jogo nao encontrado!");
				}
			}
			
		}
		scan.close();
	}
}
