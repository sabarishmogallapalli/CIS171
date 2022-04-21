/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* 3/28/2022
*/ 

public class PizzaTesterMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza myPizza = new Pizza("mushroom", "large", 9.99);
		Pizza yourPizza = new Pizza("pineapple", "extra large", 13.50);
//		Pizza thirdPizza = new Pizza("pepperoni", "extra small", 7.99);
		Pizza fourthPizza = Pizza.quickOrder("pepperoni");
		Order sab = new Order();
		yourPizza.setDescription("a flat bread with meat and cheese");
		sab.addToOrder(myPizza);
		sab.addToOrder(yourPizza);
		sab.addToOrder(fourthPizza);
		yourPizza.getOvenTemperature();
		System.out.println(yourPizza.prepareIngredients());
		System.out.println("Ready for the Oven: " + yourPizza.readyForOven());
		System.out.println("My Pizza: " + myPizza.repeatOrder());
		System.out.println("Your Pizza: " + yourPizza.repeatOrder());
//		System.out.println("Third Pizza: " + thirdPizza.repeatOrder());
		System.out.println("Fourth pizza: " + fourthPizza.repeatOrder());
		System.out.println(sab.getOrderTotal());
	}

}
