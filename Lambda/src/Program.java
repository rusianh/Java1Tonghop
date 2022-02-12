import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 */

/**
 * @note [Lambda]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 31, 2021 (9:06:43 PM)
 * @version 1.0
 */
public class Program {
	// 1. Attribute
	// 2. Get, set methods
	// 3. Constructor
	// 4. Input, output methods
	// 5. Business methods
	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangooroo1", true, false));
		animals.add(new Animal("rabbit", true, true));
		animals.add(new Animal("turtle", false, true));
		
		List<Integer> numbers = Arrays.asList(1,2,3);
		
		// print(animals, new CheckIfHopper());
		print(animals, a -> !a.canHop());
		// print(animals, (Animal a) -> {return a.canSwim();});

		// print(animals, a -> a.toString()); Doi tham so nhan cua print thanh
		// CheckSpices

		// Predicae
		printPredicate(animals, a ->  a.canHop());
		printPredicate(animals, a -> {return a.canHop();});

		// Apply lambda Predicate
		animals.removeIf((Animal s) -> s.toString().startsWith("f"));
		//animals.removeIf((Animal s) -> {s.toString().startsWith("f");});
		
		// Apply lambda UnaryOperator'
		animals.replaceAll( s -> s);
		numbers.replaceAll(s -> s*2);
		
		// Apply lambda foreach
		animals.forEach(s -> {System.out.println(s);});
		
		//=================================================Stream===================================================
	}

	//5. Business methods
	private static void print(ArrayList<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.println(animal + " n");
		}
		System.out.println();
	}

	private static void printPredicate(ArrayList<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.println(animal + " n");
		}
		System.out.println();
	}

	/*public interface CheckTrait1 {
		String test1(Animal a);
	}
	*/
}
