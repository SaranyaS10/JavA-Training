package CoreJava;

class ThreadSample extends Thread
{
	synchronized public void run() {
		System.out.println("even number");
		for (int i=0;i<10;i++)
		{
//			synchronized(this) {
			if(i%2==0)
			{
			
//				try {
//					Thread.sleep(600);
//				}catch(InterruptedException e)
//				{
//					e.printStackTrace();
//				}
				System.out.println(i);
			}
		}
	}
	
}
//}
public class ThreadDemo  extends Thread {
	
	public static void main(String[] args)
	{
		//Thread t=Thread.currentThread(); // To know main thread name
		//System.out.println(t.getName());
		
		//for (int i=0;i<=2;i++)
		//{
//			Thread t=new Thread(new ThreadSample());
//			t.start();
//			System.out.println(t.getName());
			Thread t1=new ThreadSample();
			Thread t2=new ThreadSample();
			Thread t3=new ThreadSample();
			t1.start();
			t2.start();
			t3.start();
			
		}
	}
//}
