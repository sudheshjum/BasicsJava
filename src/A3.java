
 class V {
	void test()
	{
		System.out.println("mukesh");
	}
}
	public class A3 extends V
	{
		void test()
		{
			System.out.println("from V class");
		}
	
	public static void main(String[] args) {
	V a = new A3();
	a.test();
	
	}

}
