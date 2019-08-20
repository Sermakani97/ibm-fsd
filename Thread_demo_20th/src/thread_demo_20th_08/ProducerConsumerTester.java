package thread_demo_20th_08;

public class ProducerConsumerTester {
	public final static  MyStack myStack=new MyStack();

public static void main(String[] args)
{	
	Thread t1=new Thread(new StackProducer(myStack));
	Thread t2=new Thread(new StackConsumer(myStack));
	t1.start();
	t2.start();
}
}
