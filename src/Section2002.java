
public class Section2002 {

	static int i;
	static void test()
	{
		System.out.println("from Test :" +i);
		i=10;
	}
/*	static int j;
	static void test1()
	{
		System.out.println("From test1 :" +j);
		j=10;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("From main 1:" +i);
		i=20;
		test();
		System.out.println("From main 2:" +i);
		/*System.out.println("From main :" +j);
		j=20;
		test1();
		System.out.println("From main 1 :" +j);*/
	}

}
