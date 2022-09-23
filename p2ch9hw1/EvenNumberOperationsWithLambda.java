package p2ch9hw1;
import java.util.function.Consumer;

public class EvenNumberOperationsWithLambda {
	
	private static int total;
	private static int product = 1;
	private static int[] squares = new int[5];
	
	public static void main(String[] args) {

		Consumer<Integer> calculator = i -> System.out.print(i + " ");
		doEvenNumberOperation(calculator, 10);
		
		System.out.println();
		
		doEvenNumberOperation(i->total+=i, 10);
		System.out.println(total);
				
		doEvenNumberOperation(i->product*=i, 10);
		System.out.println(product);

		doEvenNumberOperation(i-> squares[i / 2 - 1]=i * i, 10);
		for(int j : squares)
			System.out.print(j + " ");

	}

	public static void doEvenNumberOperation(Consumer<Integer> consumer, int number) {
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				consumer.accept(i);
			}
		}

	}

}