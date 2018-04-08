
public class Section2003 {

	static int x=0,i;
	static void test1()
	{
		System.out.println("test1 :" +x);
		x=1;
	}
	static void test2()
	{
		System.out.println("test2 :" +x);
		x=2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j=0;
		//double j=0.3; duplicate local variable declare
		test1();
		System.out.println("Main 1:" +x);
		test2();
		System.out.println("Main 2:" +x);
		System.out.println("a:"+i);
		int i=10;
		System.out.println("b:"+i);
		i=20;
		System.out.println("c:"+i);
		System.out.println(j);
	}

}
