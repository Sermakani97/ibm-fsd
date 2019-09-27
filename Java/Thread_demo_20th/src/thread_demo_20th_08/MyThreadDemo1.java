package thread_demo_20th_08;

public class MyThreadDemo1 implements Runnable {
public static void main(String[] args)
{
	MyThreadDemo1 mythread=new MyThreadDemo1();
	MyThreadDemo2 mythread1=new MyThreadDemo2();
	Thread t1=new Thread(mythread);
	Thread t2=new Thread(mythread1);
	t1.start();
	System.out.println(t1.isAlive());
	t2.start();
	try {
		t1.join();}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println(t2.isAlive());
}

@Override
public void run() {
	// TODO Auto-generated method stub
	try {
	for(int i=0;i<20;i++)
	{
		System.out.println("i==>:"+i);
		if(i==10)
			//Thread.sleep(1000);
		Thread.yield();
	}}
	catch(Exception e)
	{
	
	}
}
}
