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
		yourPizza.setDescription("a flat bread with meat and cheese");
		System.out.println("My Pizza: " + myPizza.repeatOrder());
		System.out.println("Your Pizza: " + yourPizza.repeatOrder());
//		System.out.println("Third Pizza: " + thirdPizza.repeatOrder());
	}

}
