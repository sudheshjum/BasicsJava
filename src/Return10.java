
public class Return10 {

	static int test(int i)
	{
		//int i=0;
		return --i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=6;
		System.out.println(i);
		System.out.println(test(i++));
		System.out.println(i);
		i=test(i);
		System.out.println(i);
		System.out.println("----------");
		System.out.println(test(9));
		int j=0;
		System.out.println(test(--j)+ j
				);
		System.out.println(j);
	}

}
