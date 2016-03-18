package war;

public class Deck {

	private static final int CARDS_IN_SUIT = 13;
	private static final int NORMAL_CARDS = 9;
	private static final int MAX_CARDS = 52;
	private Card[] cards;
	private int getIndex;
	private int insertIndex;
	private int cardsInDeck;
	
    Deck() {
		this.cards = new Card[MAX_CARDS];
		this.getIndex=-1;
	    this.insertIndex=-1;
	    this.cardsInDeck=0;
	}

	public void generateFullDeck() {
		char startChar = '1';
		String[] numbers = { "10", "J", "Q", "K", "A" };
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		for (int suit = 0; suit < 4; suit++) {
			for (int i = 1; i <= CARDS_IN_SUIT; i++) {
				if (i > 8) {
					Card temp=new Card(suits[suit], (numbers[i - NORMAL_CARDS]), (short) i);
					this.insertCard( temp);
					continue;

				}
				Card temp=new Card(suits[suit], "" + ((char) (startChar + i)), (short) i);
				this.insertCard( temp);

			}
		}

	}

	public void showDeck() {
		for (int i = 0; i < this.cards.length; i++) {
			if (this.cards[i]==null) {
				continue;
			}
			cards[i].showCard();
			
		}
		System.out.println(this.getCardsInDeck());
	}

	public void shuffleDeck(int times) {

		if (times >= 1) {
			for (int i = 0; i <= times; i++) {
				for (int j = 0; j < cards.length; j++) {

					int random = (int) (Math.random() * 51);

					Card temp = this.cards[random];
					this.cards[random] = this.cards[0];
					this.cards[0] = temp;
				}
			}
		}

	}

	public void dealCards(int start,int end,Player player){
		for (;start <=end ; start++) {
			player.getPlayersDeck().insertCard(this.getCard());
		}
	}
	public void dumpWholeDeckToPlayer(Player player){
		
		do {
			Card temp=this.getCard();
			if (temp==null) {
				break;
			}
			player.getPlayersDeck().insertCard(temp);
			
		} while (2>1);
		
	}
    public void insertCard(Card card){
    	if (card==null) {
			return;
		}
    	this.insertIndex++;
    	if (this.insertIndex>51) {
			insertIndex=0;
		}
    	if(this.cards[insertIndex]!=null){
//    		System.out.println("The deck is full");
    		return;
    	}
    	this.cards[insertIndex]=card;
    	this.cardsInDeck++;
    }
    
    public Card getCard(){
    	this.getIndex++;
    	if (this.getIndex>51) {
			getIndex=0;
		}
    	if(this.cards[getIndex]==null){
//    		System.out.println("The deck is empty");
    		return null;
    	}
    	Card temp=new Card();
    	temp=this.cards[getIndex];
    	this.cards[getIndex]=null;
    	this.cardsInDeck--;
    	return temp;
    }
    
    public int getCardsInDeck() {
		return cardsInDeck;
	}

	public boolean checkIfEmpty(){
    	boolean isEmpty=true;
    	for (int i = 0; i < cards.length; i++) {
			if (this.cards[i]!=null) {
				isEmpty=false;
			}
		}
    	return isEmpty;
    }
    public int getGetIndex() {
		return getIndex;
	}

	public int getInsertIndex() {
		return insertIndex;
	}
}
