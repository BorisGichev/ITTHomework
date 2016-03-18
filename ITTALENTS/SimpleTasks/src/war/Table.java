package war;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Deck onTable = new Deck();
		onTable.generateFullDeck();
		onTable.shuffleDeck(2);
		// onTable.showDeck();

		Player p1 = new Player("James");
		Player p2 = new Player("Deen");

		onTable.dealCards(0, 25, p1);
		onTable.dealCards(26, 51, p2);
		Scanner sc = new Scanner(System.in);
		int countRounds = 1;
		boolean isThereWar=false;
		
		// System.out.println(p1.getName());
		// p1.getPlayersDeck().showDeck();
		// System.out.println();
		//
		//
		//
		// System.out.println(p2.getName());
		// p2.getPlayersDeck().showDeck();
		// System.out.println();
		// onTable.showDeck();

		do {
			System.out.println("ROUND " + countRounds+"\n");
			if (isThereWar) {
				if (p1.getPlayersDeck().getCardsInDeck()<3) {
					System.out.println("Player one has not enough cards for war but still the last one counts");
				}
				if (p2.getPlayersDeck().getCardsInDeck()<3) {
					System.out.println("Player two has not enough cards for war but still the last one counts");
				}
				
				System.out.println("War Cards that does not matter but still we have to show them");
				System.out.println("Player 1:");
				
				if (p1.getPlayersDeck().getCardsInDeck()!=1) {
					Card player1FirstCard = p1.getPlayersDeck().getCard();
					player1FirstCard.showCard();
					onTable.insertCard(player1FirstCard);
				}
				
				if (p1.getPlayersDeck().getCardsInDeck()!=1) {
					Card player1SecondCard = p1.getPlayersDeck().getCard();
					player1SecondCard.showCard();
					onTable.insertCard(player1SecondCard);
				}
				
				System.out.println("Player 2:");
				
				if (p2.getPlayersDeck().getCardsInDeck()!=1) {
					Card player2FirstCard = p2.getPlayersDeck().getCard();
					player2FirstCard.showCard();
					onTable.insertCard(player2FirstCard);
				}
				
				if (p2.getPlayersDeck().getCardsInDeck()!=1) {
					Card player2SecondCard = p2.getPlayersDeck().getCard();
					player2SecondCard.showCard();
					onTable.insertCard(player2SecondCard);
				}
				
				
				
			}
			Card player1 = p1.getPlayersDeck().getCard();
			Card player2 = p2.getPlayersDeck().getCard();
			
			
			System.out.println("Player 1:");
			player1.showCard();
			System.out.println("Player 2:");
			player2.showCard();

			onTable.insertCard(player1);
			onTable.insertCard(player2);
			
			if ((compareCards(player1, player2))==1) {
				System.out.println("Player 1 wins the round");
				onTable.dumpWholeDeckToPlayer(p2);
			}
			
			if ((compareCards(player1, player2))==-1) {
				System.out.println("Player 2 wins the round");
				onTable.dumpWholeDeckToPlayer(p1);
			}
			if ((compareCards(player1, player2))==0) {
				System.out.println("War");
				isThereWar=true;
			}
			
			if (p1.getPlayersDeck().checkIfEmpty()) {
				System.out.println("Player one wins");
				break;
			}
			if (p2.getPlayersDeck().checkIfEmpty()) {
				System.out.println("Player two wins");
				break;
			}
			
			char menu;
			do {
				System.out
						.println("\nPlease enter\nc to continue\nq to quit\n1 to see player ones cards\n2 to see player ones cards\nd to see cards on the table");
				menu = sc.next().charAt(0);
				if (menu == 'q') {
					break;
				}
				if (menu == '1') {
					p1.getPlayersDeck().showDeck();
					

				}
				if (menu == '2') {
					p2.getPlayersDeck().showDeck();
					

				}
				if (menu == 'd') {
					onTable.showDeck();

				}
			} while (menu!='c');

			
			countRounds++;
		} while (5 > 1);
		sc.close();
	}

	static int compareCards(Card card1, Card card2) {
		if (card1.getSecretPower() > card2.getSecretPower()) {
			return 1;
		}
		if (card1.getSecretPower() < card2.getSecretPower()) {
			return -1;
		}
		return 0;
	}

}
