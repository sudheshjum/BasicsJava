
public class Return05 {

	static int test1()
	{
		System.out.println("From test1");
		return 10;
	}
	static int test2()
	{
		System.out.println("From test2");
		return test1();
	}
	static int test3()
	{
		System.out.println("From test3");
		return test1() + test2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test1());
		System.out.println(test2());
		System.out.println(test3());
	}

}
