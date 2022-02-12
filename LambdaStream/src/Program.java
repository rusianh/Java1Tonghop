import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @note [LambdaStream]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 1, 2021 (8:00:10 PM)
 * @version 1.0
 */
public class Program {
	/**
	 * Ham chay chuong trinh
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		Program program = new Program();
		program.loadData(list, null);

		// xuat list theo firstnam
		// list.forEach(p -> {System.out.println(p.getFirstName());} );
		// list.forEach(p -> p.display());

		// 1.Tao Stream theo list Person
		Stream<Person> st = list.stream();

		// 2.Xu ly stream - Intermadiate operations
		// filter nhan 1 Predicatec
//		st.filter(p -> p.getCountry().equalsIgnoreCase("Vietnam"))
//		.forEach(p -> p.display());

		// ==========================================================
		// distinct - tra ve 1 stream - loai bo cac gia tri trung nhau (1:28)
//		st.map(p-> p.getCountry()).distinct().forEach(p -> System.out.println(p));

		// =======================================================
		// map()- nhat person tao thanh 1 stream khac | tao mot source moi/ hay mot
		// stream moi
		// st.filter(p -> p.getCountry().equalsIgnoreCase("Vietnam"));
//		st.map(p-> p.getCountry());

		// Tuong duong voi
//		Stream<String> stringStream = st.map(p-> p.getCountry());

		// ============================================================
		// limit() Quy dinh toi da so phan tu thuc hien, skip() Bo qua so phan tu cua
		// source | make a stream smaller.
//		st.map(p-> p.getCountry()).distinct().limit(4).skip(1).forEach(p-> System.out.println(p));

		// ============================================================
		// sorted() - retunr stream with the elements sorted.
//		list.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(p -> p.display());

		// ============================================================
		// peak() - Dung de debug - Kiem tra dau ra co dung yeu cau khong
//		list.stream().peek(p->p.display()).sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(p -> p.display());

		// ===========================================================================================
		// 3. Ouput - Terminal Operation
		// count - Dem item trong stream
//		long result = st.sorted((p1, p2) -> p1.getAge() - p2.getAge()).count();
//		System.out.println(result);

		// ============================================================
		// min, max
//		Optional<Person> result = list.stream().min((p1,p2)-> p1.getAge() - p2.getAge());
//		result.ifPresent(p-> p.display() ); // in ra nguoi co tuoi nho nhat

		// ============================================================
		// findAny() - Da luong lay ra item random trong so luong xu ly , findFist() -
		// Goi ra item dau tien trong list
//		Optional<Person> result = list.stream().findFirst();
//		result.ifPresent(p-> p.display() );

		// ============================================================
		// allMatch() - Tat ca ca phan tu co thoa man dieu kien khong, anyMatch - Chi co
		// 1 phan tu thoan man dieu kien la dc, noneMatch() - Khong co ai thoa man dieu
		// kien | Tra ve boolean
//		boolean result = list.stream().anyMatch(p-> p.getAge() > 20);
//		System.out.println(result);

		// ========================================================
		// reduce - DUNG 2 PARA TRA VE 1 DOI TUONG CUNG DU LIEU - THUONG DUNG GHEP CHUOI
//		Optional<Person> result = st.filter(p -> p.getCountry().equalsIgnoreCase("Vietnam")) // Neu goi stream goi foreach roi thi khong goi dc filter nua
//		.reduce((Person p1, Person p2)-> {p1.setFirstName(p2.getFirstName()); return p1;});
//				
//		result.ifPresent(p->p.display());

		// ===========================================================================================
		// 4. Primitive Stream (2:00)
		// average(), sum(), min(), max() (2:00)
//		OptionalDouble result =list.stream().mapToInt(p -> p.getAge()).average();
//		result.ifPresent(p -> System.out.println(result));

		// ========================================================
		// summaryStatistics - Moi lan dung tenery se ket thuc 1 stream -
		// summaryStatistics cho phep su dung dc nhieu tenery
//		IntSummaryStatistics result =list.stream().mapToInt(p -> p.getAge()).summaryStatistics();
//		System.out.println(result.getAverage());
//		System.out.println(result.getMin());
//		System.out.println(result.getMax());

		// ===========================================================================================
		// 5. Collecting Result (2:10) tra 1 stream ve arraylist
		// Colectors - Giup thu thap du lieu trong 1 cai stream
		// Cach1
//		ArrayList<Person> listResult = list.stream().filter(p -> p.getCountry().equalsIgnoreCase("Vietnam")).collect(
//				() -> new ArrayList<Person>(), (ArrayList<Person> l, Person p) -> l.add(p),
//				(ArrayList<Person> l1, ArrayList<Person> l2) -> l1.addAll(l2));
//		listResult.forEach(p -> p.display());

		// ========================================================
		// Cach2 : List la
//		List<Person> listResult2 = list.stream().filter(p -> p.getCountry().equalsIgnoreCase("Vietnam"))
//				.collect(Collectors.toList());
//		listResult2.forEach(p->p.display());
		
		// ========================================================
		//Collecttors averaginDouble
//		double listResult3 = list.stream().filter(p -> p.getCountry().equalsIgnoreCase("Vietnam"))
//				.collect(Collectors.averagingDouble(p->p.getAge()));
//		System.out.println(listResult3);
		
		// ========================================================
		//Colecttor.maxby
//		list.stream().filter(p -> p.getCountry().equalsIgnoreCase("Vietnam"))
//		.collect(Collectors.maxBy((Person p, Person p2)-> p.getAge() -p2.getAge())).ifPresent(p -> p.display());
		
		// ========================================================
		//GroupingBy Luu danh sach theo tieu chi
		//Map
		Map<String, List<Person>> map;
		map = list.stream().collect(Collectors.groupingBy(p-> p.getCountry())); // Luu danh sach Map co key theo country, value List<Person>
		
		// ========================================================
		//Tao stream cho map dung entrySet()
		map.entrySet().stream().forEach(m-> {
			System.out.println("___________" +m.getKey()+ "___________" );
			m.getValue().forEach(p-> p.display());});
		
		// ========================================================
		Map<String, Double> map2;
		//Tao colectors thu thap du lieu tu list moi thu thap dc tu colectors cuar strem (groupingBy cung cap colectors thu thap du lieu)
		map2 = list.stream().collect(Collectors.groupingBy(p-> p.getCountry(), Collectors.averagingDouble(p->p.getAge())));
		map2.entrySet().stream().forEach(m -> {
			System.out.println(m.getKey() + " avr " + m.getValue());
		});
		
		// ========================================================
		//partitioningBy tra ve boolean - vd tra ve danh dach nhung nguoi 30 tuoi
		Map<Boolean, List<Person>> map3;
		map3 = list.stream().collect(Collectors.partitioningBy(p -> p.getAge()>25));
		map3.entrySet().stream().forEach(m-> {
			System.out.println("___________" +m.getKey()+ "___________" );
			m.getValue().forEach(p-> p.display());});
		
		// ========================================================
		//joinning chi dung cho kieu String - Cong tat ca nhung string voi nhau va them phan "," vao
		String data = list.stream().map(p-> p.getFirstName()).collect(Collectors.joining(","));
		System.out.println(data);
	}

	// ============================================================================
	// 5. business methods
	// Ham tao du lieu
	 void loadData(List<Person> person, String packageName) {

		try {
			// Path read = Paths.get("src/" + packageName + "/person_list.txt");
			Path read = Paths.get("src/person_list.txt");

			BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);

			String line = null;
			int i = 0;
			while ((line = br.readLine()) != null) {
				String[] personData = line.split("\t");
				if (i > 0) {
					person.add(new Person(personData[0], personData[1], personData[2], Integer.parseInt(personData[3]),
							personData[4]));
				}
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
