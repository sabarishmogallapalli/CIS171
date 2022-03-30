/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* 3/28/2022
*/ 

public class PizzaTesterMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza myPizza = new Pizza();
		Pizza yourPizza = new Pizza("pineapple", "extra large", 13.50);
		myPizza.setPrice(12.50);
		myPizza.setTopping("mushroom");
		System.out.println("My Pizza: " + myPizza.repeatOrder());
		System.out.println("Your Pizza: " + yourPizza.repeatOrder());
	}

}
