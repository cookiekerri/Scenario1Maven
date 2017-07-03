package scenario1;

public class Bug {

	private static int count;

	public static void main(String[] args) {
		count = 0;
		count = 1;
		System.out.println(count + 1);
		
	}

}
