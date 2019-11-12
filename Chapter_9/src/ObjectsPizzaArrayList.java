import java.util.ArrayList;

public class ObjectsPizzaArrayList {

	public static void main(String[] args) {
		ArrayList<Pizza> pizzaArray = new ArrayList<Pizza>();

		pizzaArray.add(new Pizza("Diavolo", 8.75));
		pizzaArray.add(new Pizza("Frutti al Mare", 9.00));
		pizzaArray.add(new Pizza("Alla Pollo", 7.50));

		for (Pizza pizzaObj : pizzaArray) {
			System.out.println(pizzaObj);
		}
	}

}
