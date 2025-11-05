package scenarioBasedProblems;

abstract class FoodOrder {
    int orderId;
    String customerName;

    public abstract double calculateTotal();

    public void generateBill() {
        System.out.println("Bill for Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Total Amount: " + calculateTotal());
    }
}

class RestaurantOrder extends FoodOrder {
    double foodPrice;
    double tax = 0.1;

    public RestaurantOrder(int id, String name, double price) {
        orderId = id;
        customerName = name;
        foodPrice = price;
    }

    @Override
    public double calculateTotal() {
        return foodPrice + (foodPrice * tax);
    }
}

class CloudKitchenOrder extends FoodOrder {
    double basePrice;
    double deliveryCharge = 50;

    public CloudKitchenOrder(int id, String name, double price) {
        orderId = id;
        customerName = name;
        basePrice = price;
    }

    @Override
    public double calculateTotal() {
        return basePrice + deliveryCharge;
    }
}

public class FoodAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder order1 = new RestaurantOrder(101, "Alice", 500);
        order1.generateBill();

        System.out.println();

        FoodOrder order2 = new CloudKitchenOrder(102, "Bob", 400);
        order2.generateBill();
	}

}
