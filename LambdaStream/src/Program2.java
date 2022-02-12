import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * 
 */

/**
 * @note [LambdaStream] Bai tap lab7 | Thay Duc
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 2, 2021 (5:33:41 AM)
 * @version 1.0
 */
public class Program2 {

	public static void main(String[] args) {
//		System.out.println("Hello Worlds");
		Program program = new Program();
		ArrayList<Person> listPerson = new ArrayList<Person>();
		program.loadData(listPerson, null);

		// Xuat listPerson
		//listPerson.forEach(p -> p.display());

		// Creat stream
		Stream<Person> st = listPerson.stream();

		// =========================Exam1================
		// Sort persons by firstName in ascending order then print out to confirm
		// System.out.println("======================================================");
		// st.sorted((Person p, Person p2) ->
		// p.getFirstName().compareToIgnoreCase(p2.getFirstName())).forEach(p->p.display());

		// Sort persons by lastName in descending order then print out to confirm
		// =========================Exam2================ | Check?
		// System.out.println("======================================================");
		// st.sorted((Person p, Person p2)->
		// p.getLastName().compareToIgnoreCase(p.getLastName())).limit(10).forEach(p->
		// p.display());

		// Sort persons by age in descending order then print out to confirm
		// =========================Exam3================ |
		// System.out.println("======================================================");
		// st.sorted((Person p, Person p2)-> p.getAge()-p2.getAge()).forEach(p->
		// p.display());

		// Print out all persons born after 1968
		// =========================Exam4================ |
		// System.out.println("======================================================");
		// st.filter(p-> p.getBirthYear()>1968).forEach(p->p.display());

		// Print out all persons from Vietnam
		// =========================Exam5================ |
		// System.out.println("======================================================");
		// st.filter(p-> p.getCountry().equalsIgnoreCase("Vietnam")).forEach(p->
		// p.display());

		// Print out all persons older than 40
		// =========================Exam6================
		//System.out.println("======================================================");
		//st.filter(p -> p.getAge() > 40).forEach(p -> p.display());

		// Print out all persons who have the longest lastName
		// =========================Exam7================ |check?
		//System.out.println("======================================================");
		//st.sorted((Person p, Person p2)-> p2.getLastName().length() - p.getLastName().length()).forEach(p->p.display());
		
		//map = st.collect(Collectors.groupingBy(p-> p.getLastName().length()));
		//map.entrySet().stream().sorted((Entry e, Entry e2)-> e.getKey().length() - e2.getKey().length());
		//Map<Integer, List<Person>> map;
//		map.entrySet().stream().forEach(m-> {
//			System.out.println("_____"+ m.getKey()+"_____");
//			m.getValue().forEach(p->p.display())
//			;});
		
		//st.min((Person p, Person p2)-> p2.getLastName().length() - p.getLastName().length() ).ifPresent(p->p.display());
		//st.max((Person p, Person p2)-> p.getLastName().length() - p2.getLastName().length()).ifPresent(p-> p.display());
		
		//Map<Integer, List<Person>> map;
		//map = st.collect(Collectors.groupingBy(p-> p.getLastName().length()));
//		map.entrySet().
		//map.entrySet().stream().max((e1,e2)-> e1.getKey() - e2.getKey()).ifPresent(e-> {
			//e.getValue().forEach(p->p.display())
			//;});
		
		
		
		
		//Print out all persons less than 30 years old and from Japan
		// =========================Exam8================
		//System.out.println("======================================================");
		//st.filter(p-> p.getCountry().equalsIgnoreCase("Japan")).filter(p-> p.getAge() <30).forEach(p-> p.display());
		
		//Print out the youngest person
		// =========================Exam9================
		//System.out.println("======================================================");
		//st.min((Person p, Person p2)-> p.getAge()- p2.getAge()).ifPresent(p-> p.display()); //min() return ve Optional<Person>
		
		//Print out the oldest person
		// =========================Exam10===============
		//System.out.println("======================================================");
		//st.max((Person p, Person p2)-> p.getAge()- p2.getAge()).ifPresent(p-> p.display()); //max() return ve Optional<Person>
		
		//Calculate total age of all males. Hint: .sum()
		// =========================Exam11===============
		//System.out.println("======================================================");
		//Integer result = st.mapToInt(p-> p.getAge()).sum(); //mapToInt() return Int Stream
		//System.out.println(result);
		
		//Calculate total age of all females from United States
		// =========================Exam12===============
		//System.out.println("======================================================");
		//st.filter(p-> p.getCountry().equalsIgnoreCase("United States")).filter(p-> p.getGender().equalsIgnoreCase("Female")).forEach(p-> p.display());
		
		//Calculate the average age of persons from Vietnam
		// =========================Exam13===============
		//System.out.println("======================================================");
		//OptionalDouble result = st.filter(p->p.getCountry().equalsIgnoreCase("Vietnam")).mapToInt(p-> p.getAge()).average(); //average() return OptionalDouble
		//System.out.println(result);
		
		//Among Vietnam, Thailand, and Japan, which country has the maximum total age of all males?
		// =========================Exam14===============
		//System.out.println("======================================================");
		//Map<String, Double> map;
		//map = st.filter(p->p.getGender().equalsIgnoreCase("male")).collect(Collectors.groupingBy(p->p.getCountry(), Collectors.averagingDouble(p->p.getAge())));
		//map.entrySet().stream().forEach(m -> {
			//System.out.println("_____"+ m.getKey() +"______"+m.getValue())
			//;});
		
		Map<String, Integer> map;
		map = st.filter(p->p.getGender().equalsIgnoreCase("male"))
		.filter(p->p.getCountry().equalsIgnoreCase("Vietnam") || 
				p.getCountry().equalsIgnoreCase("Japan") ||
				p.getCountry().equalsIgnoreCase("Thailand")).collect(Collectors.groupingBy(p->p.getCountry(),
								Collectors.summingInt(p-> p.getAge()))); 
		map.entrySet().stream().max((e1,e2)-> e1.getValue()- e2.getValue()).ifPresent(e-> 
		System.out.println(e.getKey() + e.getValue()));
		
		
		//mong United States, United Kingdom, which country has the minimum total age of all females?
		// =========================Exam15===============
		System.out.println("======================================================");
	}

}
