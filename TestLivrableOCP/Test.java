import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread foo = new Thread(r);
		foo.start();
		Thread bar = new Thread(r);
		bar.start();
		Thread bat = new Thread(r);
	}
}
