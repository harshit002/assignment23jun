package threading;

public class Threadex implements Runnable {
	

	

	@Override
	public void run()
	{
		synchronized (this) 
		{
			int i=9;
		
			while(i < 15) 
			{
					try 
					{
						Thread.sleep(1000);
						
					} 
					catch (InterruptedException e) 
					{
						
						e.printStackTrace();
					}
					System.out.println( Thread.currentThread().getName()  +"bsjdbsj"  +i);
					i++;
			}
		
		}
	}
public static void main(String[] args) 
   {
		

	}
}
