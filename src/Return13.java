
public class Return13 {

	static int test1(int i)
	{
		return test2(i++)+test2(++i);
	}
	static int test2(int i)
	{
		return test3(i--)+test3(--i);
	}
	static int test3(int i)
	{
		return i++ + ++i + i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		i=test1(i=0);
		System.out.println(i);
		i=test2(i=0);
		System.out.println(i);
		i=test1(i++);
		System.out.println(i);
		i=test2(++i);
		System.out.println(i);
	}

}
