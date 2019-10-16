package forCheck;

public class Test1 implements Test{

	@Override
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
		
	}

}
