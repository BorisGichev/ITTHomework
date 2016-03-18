package oOP;

public class KiloProduct extends Product {
		
		private double kilo;
		
		public KiloProduct(String name, double price, double kilo) {
			super(name, price);
			this.setKilo(kilo);
		}

		public double getKilo() {
			return kilo;
		}

		public void setKilo(double kilo) {
			if (kilo<0) {
				return;
			}
			this.kilo = kilo;
		}

		@Override
		public String toString() {
			return "KiloProduct [kilo=" + kilo + ", getName()=" + getName()
					+ ", getPrice()=" + getPrice() + "]";
		}

}
