
public class A1 {
	static int test()
	{
		System.out.println("mukesh");
		return 30;
	}
	public static void main(String[] args) {
		System.out.println("hello ray");
		int i = test();
		System.out.println(i);
		System.out.println(test());
		int j = 10+test();
		System.out.println(j);
		test();
		
	}
}