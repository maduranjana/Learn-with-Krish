package cor;

public class Discount extends Handler {
	
	@Override
	public double getDiscount(OrderDetails orderDetails) {
		return successor.getDiscount(orderDetails); 
	}
	
}
