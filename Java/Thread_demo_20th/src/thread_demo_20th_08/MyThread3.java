package thread_demo_20th_08;

public class MyThread3 extends Thread{
public void run()
{
	super.run();
}
public static void main(String[] args)
{
	MyThread3 th=new MyThread3();
	th.start();
	System.out.println(th.isAlive());
}
}
