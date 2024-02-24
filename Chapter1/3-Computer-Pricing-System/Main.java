
public class Main 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d1 = new Desktop(500.0, 100.0, 50.0, 80.0, 20.0, 30.0);
        Notebook n1 = new Notebook(800.0, 150.0, 100.0, 120.0, 30.0, 40.0, 50.0);

        System.out.println("Desktop Price: $" + d1.calculatePrice());
        System.out.println("Desktop Shipping Cost: $" + d1.calculateShippingCost());
        double db1 = d1.calculatePrice() + d1.calculateShippingCost();
        System.out.println("Total: $" + db1);
        
        
        System.out.println("Notebook Price: $" + n1.calculatePrice());
        System.out.println("Notebook Shipping Cost: $" + n1.calculateShippingCost());
        double db2 = n1.calculatePrice() + n1.calculateShippingCost();
        System.out.println("Total: $" + db2);
    }
	}


