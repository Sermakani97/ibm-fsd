package comm.exam.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import comm.example.Card;

public class Test {
	private static String nhand;
	private static String nrank;
	static Scanner sc=new Scanner(System.in);
	Collection<String> list=new ArrayList();
private static List<Cards>protoDeck=new ArrayList<Cards>();
static {
	for(Hand h:Hand.values())
	{
		for(Rank r:Rank.values())
		{
			protoDeck.add(new Cards(h,r));
		}
	}
}
public static void main(String[] args)
{
	Hand hand;
	Rank rank;
	System.out.println("enter the number of hands");
	nhand=sc.next();
	System.out.println("enter the number of cards");
	nrank=sc.next();
	//for(int i=0;i<hand.length;i++)
		//for(int j=0;j<rank.length;j++)
	System.out.println(protoDeck);
}
}
