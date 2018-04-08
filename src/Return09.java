
public class Return09 {

	static void test(boolean flag, int x)
	{
		System.out.println("from test");
		System.out.println(flag);
		System.out.println(x);
	}
	static void test2(double d1,char c1)
	{
		System.out.println("from test2");
		System.out.println(d1);
		System.out.println(c1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From main");
		test(true,20);
		System.out.println("=========");
		boolean f1 =false;
		test(f1,30);
		test2(90.90909,'a');
		double v1=89.09095;
		char v2='1';
		test2(v1,v2);
		char v3='6';
		test2(v1,v3);
	}

}
