/*
 * Creating a program with that Generates a first last name by taking in two string arrays and outputting all combinations of first and last names.
 */
public class NameGenerator {
	public static void main(String[] args) {
		
		//declare both string arrays
		String[] arr1 = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
		String[] arr2 = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		
		
		//iterate through the first array
		for (int i = 0; i < arr1.length; i++) {
			
			//iterate through the second array
			for (int j = 0; j < arr2.length; j++) {
				System.out.println(arr1[i] + " " + arr2[j]);
			}
		}
	}
}
