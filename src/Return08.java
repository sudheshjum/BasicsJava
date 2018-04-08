
public class Return08 {

	static void test(int i)
	{
		System.out.println("test: "+i++);
		System.out.println("test2 : "+ i);
		i=10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		System.out.println("Main begin : "+i++);
		test(i);	// here it will consider the local variable
		System.out.println("Main End : "+ ++i);
	}

}
