import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class Test  extends Thread {
	static ConcurrentHashMap m = new ConcurrentHashMap();
	public void run()
	{
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("child thread is updating");
		m.put(103, "ray");
	}
public static void main(String[] args) throws InterruptedException {
	m.put(101, "mukesh");
	m.put(102, "kumar");
	Test t1 = new Test();
	t1.start();
	 Set s1 = m.keySet();
	 Iterator itr = s1.iterator();
	 while (itr.hasNext()) {
		 Integer i1 = (Integer)itr.next();
		 System.out.println("main thread is iterating the hasmap : " + i1
				 +" - "+m.get(i1) );
		Thread.sleep(3000);
	}
	 System.out.println(m);
}
}
