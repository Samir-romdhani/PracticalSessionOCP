import java.util.Arrays;
import java.util.function.Function;
/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("############  The Function Interface ################");
		Arrays.stream("4, -9, 16".split(", "))
		.map(Integer::parseInt)
		.map(i -> (i < 0) ? -i : i)
		.forEach(System.out::println);
		
		System.out.println("############   Demo  ################");
		Function<String, Integer> strToInt = str -> Integer.parseInt(str);
		Function<Integer, Integer> posNumber = num -> num < 0 ? -num : num;
		System.out.println(strToInt.apply("15"));
		
		System.out.println("############  The Function Interface ################");
		Arrays.stream("4, -9, 16".split(", "))
		.map(i -> strToInt.apply(i))
		.map(i -> posNumber.apply(i))
		.forEach(System.out::println);
	}
}
