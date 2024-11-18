package Loja;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {

	private List<Game> availableGames;

	public Store() {
		availableGames = new ArrayList<>();
		availableGames.add(new Game("Chrono Trigger(PlayStation 1)", 120.0, "RPG"));
		availableGames.add(new Game("Resident Evil 2 (PlayStation 1)", 129.0, "Survival Horror"));
		availableGames.add(new Game("Sonic the Hedgehog (Mega Drive)", 69.0 , "Plataform"));
		availableGames.add(new Game("Final Fantasy VII (PlayStation 1)", 129.0, "RPG"));
		availableGames.add(new Game("Metal Gear Solid (PlayStation 1)", 129.0, "Action"));
		availableGames.add(new Game("The Legend of Zelda: Ocarina of Time (Nintendo 64)", 129.0, "RPG"));
		availableGames.add(new Game("Super Mario World (Super Nintendo)", 129.0, "Plataform"));
	}

	public void displayGames() {
		System.out.println("Jogos Disponiveis na loja: ");
		for (int i = 0; i < availableGames.size(); i++) {
			System.out.println((i + 1) + " - " + availableGames.get(i));
		}
	}

	public Game getGame(int index) {
		if (index >= 1 && index <= availableGames.size()) {
			return availableGames.get(index - 1);
		}
		return null;
	}
}
