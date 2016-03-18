package oOP;

public class Buyer {
	private Shop shop;
	private double money;
	private Product[] cart;
	private int placeForNextProduct;
	private int freePlacesInCarts;
	private final int cartPlaces;
	private double moneyToGive;

	public Buyer(Shop shop, double money, int cartPlaces) {
		this.setShop(shop);
		this.setMoney(money);
		this.cart = new Product[cartPlaces];
		this.freePlacesInCarts = cartPlaces;
		this.placeForNextProduct = 0;
		this.cartPlaces = cartPlaces;
	}

	public void setShop(Shop shop) {
		if (shop == null) {
			return;
		}
		this.shop = shop;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if (money < 0) {
			return;
		}
		this.money = money;
	}

	public void addKiloProductInInventory(String product, double kilo) {
		if (this.freePlacesInCarts <= 0 || product == null) {
			return;
		}
		int place = this.shop.checkKiloProduct(product, kilo);
		if (place != -1) {
			this.cart[this.placeForNextProduct] = new KiloProduct(product, shop
					.getProduct(place).getPrice(), kilo);
			((KiloProduct)shop.getProduct(place)).setKilo(((KiloProduct)shop.getProduct(place)).getKilo()-kilo);
			if(((KiloProduct)shop.getProduct(place)).getKilo()==0){
				shop.removeProductInInventory(place);
			}
			
			this.setMoneyToGive(this.getMoneyToGive() + kilo*shop
					.getProduct(place).getPrice());
			
		}
		this.placeForNextProduct++;
		this.freePlacesInCarts--;

	}

	public void payForProducts() {

	}

	public double getMoneyToGive() {
		return moneyToGive;
	}

	public void setMoneyToGive(double moneyToGive) {
		this.moneyToGive = moneyToGive;
	}
	
	public void showInventory(){
		for (int i = 0; i < cart.length; i++) {
			if (cart[i]!=null) {
				System.out.println(cart[i].toString());
			}
		}
	}


}
