package comm.exam.test;

import comm.example.Rank;
import comm.example.Suit;

public class Cards {
	private Hand hand;
	private comm.exam.test.Rank rank;

	/*public Cards(Hand hand,Rank rank)
	{
		super();
		this.hand=hand;
		this.rank=rank;
	}*/
	public Cards(Hand h, comm.exam.test.Rank r) {
		this.hand=h;
		this.rank=r;
		// TODO Auto-generated constructor stub
	}
	/*public Suit suit()
	{
		return suit;
	}
	public Rank rank()
	{
		return rank;
	}*/
	public String toString() {
		return "Card[suit="+hand+",rank="+rank+"]";
	}

}
