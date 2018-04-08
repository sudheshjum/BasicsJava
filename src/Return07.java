
public class Return07 {

	static void test(int i, int j)
	{
		System.out.println("i ="+i+",j="+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10,20);
		int i=24;
		test(i,20);
		test(20,i);
		test(i,i);
		System.out.println("Done");
	}

}
