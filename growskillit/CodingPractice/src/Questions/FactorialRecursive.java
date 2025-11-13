package Questions;

public class FactorialRecursive {
	static int fact(int n) {
		return (n == 0) ? 1 : n * fact(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}
