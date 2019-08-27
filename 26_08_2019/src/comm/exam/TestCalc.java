package comm.exam;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestCalc extends TestCase {
public TestCalc(String name)
{
	super(name);
	System.out.println(name);
}
int x;
int y;
	@Test
	public void testAdd() {
		//int x=10;
		//int y=20;
		System.out.println("add");
		Calculator c=new Calculator(x,y);
		int result=c.add();
		assertEquals(12,result);	
	}
	public static TestSuite createTestSuite() {
		TestSuite testSuite=new TestSuite("Calculator");
		//testSuite.addTest(new TestCalc("testAdd"));
		testSuite.addTest(new TestSuite("testAdd"));
		return testSuite;
	}
	protected void setUp()throws Exception{
		super.setUp();
		System.out.println("initialize method");
		x=5;
		y=7;
	}
protected void tearDown()throws Exception{
	super.tearDown();
	System.out.println("clean-up method");
	x=0;
	y=0;
}
	public void testgreat()
	{
		//int x=30;
		//int y=20;
		Calculator c=new Calculator(x,y);
		int r=c.great();
		assertEquals(1,r);
	}
	public static void main(String[] args)
	{
		TestRunner.run(TestCalc.class);
	}
}