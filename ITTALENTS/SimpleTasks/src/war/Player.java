package war;

public class Player {
	private String name;
	private Deck playersDeck;

	Player(String name) {
		this.setName(name);
		this.setPlayersDeck(new Deck());
	}

	public Deck getPlayersDeck() {
		return playersDeck;
	}

	public void setPlayersDeck(Deck playersDeck) {
		this.playersDeck = playersDeck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
