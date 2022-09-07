package cor;

public class OrderDetails {
	
	private int orderId;
	private double priceOfProducts;
	private double discountPrice;

	protected void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public OrderDetails(int orderId, double priceOfProducts) {
		this.orderId = orderId;
		this.priceOfProducts = priceOfProducts;
	}

	public int getorderId() {
		return orderId;
	}

	public double getPriceOfProducts() {
		return priceOfProducts;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}


}
