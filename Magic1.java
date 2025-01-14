import java.util.ArrayList;

public class Magic1 {
    public static void main(String[] args){
		//creating an object of arrayList
        ArrayList<String> animals = new ArrayList<>();

        // Add elements
        animals.add("Panther");
        animals.add("Tiger");
        animals.add("Cheetah");

		System.out.println("############# Printing Current Array ##########");
        System.out.println(animals);
        System.out.println("");

		animals.clear();

		System.out.println("############# Printing Cleared Array ##########");
		System.out.println("Empty Array : " + animals);
        System.out.println("");

		if(animals.isEmpty()){
			System.out.println("Array is empty");
		}
		else{
			System.out.println("Array is not empty");
		}

        System.out.println("");

		animals.add("Panther");
        animals.add("Tiger");
        animals.add("Cheetah");

		System.out.println("The size of Array: " + animals.size());
        System.out.println("");

		System.out.println("Adding more element " + animals.add("Cat"));

        System.out.println("");

		System.out.println(animals);

        System.out.println("");

        System.out.println("after removing element at index 2:");

		animals.remove(2);//removes the string at 2
		System.out.println(animals);
		System.out.println("");
    }
}
