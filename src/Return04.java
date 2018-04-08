
public class Return04 {

	static int test1()
	{
		System.out.println("From test1");
		return 100;
	}
	static int test2()
	{
		System.out.println("From test2");
		return test1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		System.out.println(test2());
		System.out.println(test1() + test2());
		//test2();
	}

}
