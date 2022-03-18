
/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 7, 2022
 */

public class ArrayCheckMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minValue = 1;
		int maxValue = 100;
		int[] numbers = new int[5];
		int randNumOne = minValue + (int) (Math.random() * maxValue);
		int randNumTwo = minValue + (int) (Math.random() * maxValue);
		int randNumThree = minValue + (int) (Math.random() * maxValue);
		int randNumFour = minValue + (int) (Math.random() * maxValue);
		int randNumFive = minValue + (int) (Math.random() * maxValue);
		numbers[0] = randNumOne;
		numbers[1] = randNumTwo;
		numbers[2] = randNumThree;
		numbers[3] = randNumFour;
		numbers[4] = randNumFive;
		System.out.println("The elements of the array in original order: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("The first element in the array is: " + numbers[0]);
		System.out.println("The last element in the array is: " + numbers[numbers.length - 1]);
		System.out.println("The lowest number in the array is: " + lowestElement(numbers));
		System.out.println("The highest number in the array is: " + highestElement(numbers));

		System.out.println("The elements of the array in reverse order: ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}

		System.out.println("Every element at an odd index in the array: ");
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.println(numbers[i]);
		}

		System.out.println("Every odd element in the array: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				System.out.println(numbers[i]);
			}
		}
	}

	public static int lowestElement(int[] array) {
		int lowest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < lowest) {
				lowest = array[i];
			}
		}
		return lowest;
	}

	public static int highestElement(int[] array) {
		int highest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > highest) {
				highest = array[i];
			}
		}
		return highest;
	}
}
