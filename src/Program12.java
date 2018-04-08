
public class Program12 {

	static void test1()
	{
		System.out.println("From Test 1");
	}
	static void test2()
	{
		System.out.println("From Test 2 starts");
		test1();
		System.out.println("From Test 2 Ends");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Main starts");
	test1();
	test2();
	//test3();	-> Throw an Error because method test3() is undefined.
	System.out.println("Mian Ends");
	}

}
