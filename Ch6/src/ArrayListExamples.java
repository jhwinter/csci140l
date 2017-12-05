import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		/*
		 * int -> Integer
		 * byte -> Byte
		 * short -> Short
		 * char -> Character
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * boolean -> Boolean
		 */
		
		Integer x = new Integer(3);
		//Integer y = 3;
		int z = x; //this is a copy, not an alias
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		int y = 2;
		numbers.add(y);
		int n = numbers.get(0);
		
		ArrayList<String> names = new ArrayList<String>();
		
		// names[0] = "blah";
		
		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		
		System.out.println(names);
		
		System.out.println("Size: " + names.size());
		
		System.out.println("First: " + names.get(0));
		System.out.println("Last: " + names.get(names.size() - 1));
		
		names.set(0,"Alice Thompson");
		
		System.out.println(names);
		
		for(int i = 0; i<names.size(); i++) {
			System.out.println("Name: " + names.get(i));
		}
		
		System.out.println();
		
		for (String name : names) {
			System.out.println("Names: " + name);
		}
		
		names.add(1, "Charles");
		
		System.out.println(names);
		
		names.remove(2);
		
		System.out.println(names);
		
		ArrayList<String> names2 = new ArrayList<String>(names); //copy
		ArrayList<String> names3 = names; //alias
		names2.remove(0);
		System.out.println(names);
		System.out.println(names2);
		
		
		
		
		
		
		
	}
}
