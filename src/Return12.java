
public class Return12 {

	static int test1(int i)
	{
		return ++i;
	}
	static int test2(int i)
	{
		return test1(++i)+test1(i++);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		i=test1(i++)+i+test2(i++)+i+test2(++i)+i;
		System.out.println(i);
	}

}
