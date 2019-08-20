package thread_demo_20th_08;

public class MyThreadDemo2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=0;j<20;j++)
		{
			if(j==10)
			{
				try {
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					
				}
			}
			System.out.println("j==>:"+j);
		}
		
	}

}
