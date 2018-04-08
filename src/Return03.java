
public class Return03 {

	static int test()
	{
		System.out.println("from test");
		return 20;// this return 20 is coded due to the method having int method type.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main end");
		int i =test();
		int j =10 + test();
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j+test());
		//test();
		System.out.println("Main End");
	}

}
