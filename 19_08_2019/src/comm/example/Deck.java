package comm.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Deck {
	static Scanner sc=new Scanner(System.in);
	private static String suit;
	private static String rank;
	Collection<String> list=new ArrayList();
private static List<Card> protoDeck=new ArrayList<Card>();
static {
	for(Suit s:Suit.values())
	{
	for(Rank r:Rank.values())	
	
	{
	protoDeck.add(new Card(s,r));	
	}
}
}
public static void main(String[] args) {
	System.out.println("enter the number of hands");
	suit=sc.next();
	System.out.println("enter the number of cards");
	rank=sc.next();
System.out.println(protoDeck);
}}
