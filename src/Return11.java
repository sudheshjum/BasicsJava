
public class Return11 {

	static int test1(int i)
	{
		return i++;
	}
	static int test2(int i)
	{
		return test1(++i);
	}
	static int test3(int i)
	{
		return test1(i++);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		int j=test1(i++) + i;//i=1,j=1
		System.out.println(i);//1
		System.out.println(j);//1
		i=j=0;
		j=test2(++i)+i;//i=1,j=3
		System.out.println(i);//1
		System.out.println(j);//3
		i=j=0;
		j=test3(++i)+i;//i=1,j=2
		System.out.println(i);//1
		System.out.println(j);//2
		i=j=0;
		j=test3(++i)+i+test1(i++)+i+test2(i++)+i+test2(++i)+i;//1+1+1+2+3+3+5+4
		System.out.println(i);//4
		System.out.println(j);//20
	}

}
