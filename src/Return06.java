
public class Return06 {

	static void test(int i)	// throws CTE if int value has not been initialized. 
	{
		System.out.println("From test"+i);
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Main Starts");
test(10); //Unresolved compilation problem and throws CTE if int has not initialized.
		System.out.println("--------------");
		int k=100;
		test(k);
		test(k+400);
		int m;
		m=50;
		test(m);
		test(m=20);
		System.out.println("Value of m: "+m);
		System.out.println("From Main ends");
	}

}
