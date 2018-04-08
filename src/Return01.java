
public class Return01 {
	
	static void test()
	{
		System.out.println("test begin");
		if(true)
			{
			System.out.println("from if");
			return;
			}
		System.out.println("test end");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Begin");
		test();
		System.out.println("Main Ends");
		}

}
