
public class Program10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		System.out.println(x++);	//0
		System.out.println(++y);	//1
		//int y= x-- + x-- + x-- + x;	//	-6
		//int y= x++ + x + x-- + x;	//2
		//int y= x++ + x-- + x++ + x--;	//2
		//y= x++ + x + x-- + x;	//2
		//y= ++x + x;	//4
		y= --x + x + --x + x;
		System.out.println(x);
		System.out.println(y);
	}

}
