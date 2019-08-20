package comm.exam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	 static  List<String> l=new ArrayList<String>();
	         
	     public static void main(String[] args) {
	        Scanner in=new Scanner(System.in);
	     boolean y=true;  
	     do{   
	         System.out.println("Enter 1 to add a no.(non zero) in list\n2 to edit no.\n3 to display");
	         System.out.println("4 to delete\n");
	         System.out.println("enter your choice");
	         int choice=in.nextInt();
	         switch(choice)
	         {
	            case 1:
	                add();
	                break;
	         case 2:
	                edit();
	                break;
	            case 3:
	                display();
	                break;
	            case 4:
	                delete();
	                break;
	            default:
	                System.out.println("bad input");
	                break;
	        }
	        System.out.println("want to process more? y/n");
	        String x=in.next();
	        char ch=x.charAt(0); 
	    if( ch=='n')
            y=false;
    }
    while(y!=false);
   
    }
	     static void add(){
	     Scanner in=new Scanner(System.in);
	        
	        boolean y=true ;{
	       do{
	            System.out.println("enter id,name,gpa to add in list");
	            int num=in.nextInt();
	           String name=in.next();
	            double gpa=in.nextDouble();
	                l.add("num");
	                l.add(name);
	                l.add("gpa");
	            System.out.println("want to insert more?y/n");
	            String x=in.next();
	            char ch=x.charAt(0);
	            if( ch=='n')
	                y=false;
	         }
	       while(y!=false); 
	   }	     
}
    static void edit()
    {
    	 Scanner in=new Scanner(System.in);
         int num1,num2;
         String name,name2;
         System.out.println("enter no you want to add");
         num2=in.nextInt();
         name2=in.next();
       
               try{
                  System.out.println("enter position you want to edit");
                  num1=in.nextInt();
                 l.set(num1, "num2");
             
               }catch(IndexOutOfBoundsException e){
                      System.err.println("caught IndexOutOfBoundsException: specified position is empty "+e.getMessage());
                 }
         
            }

    static void delete(){
    	Scanner in=new Scanner(System.in);
        System.out.println("enter position you want to delete");
        int num=in.nextInt();
        String name=in.next();
        double gpa=in.nextDouble();
;        l.remove(num);
        l.remove(name);
        l.remove(gpa);
        System.out.println("deleted");
        
    }
     static void display()
    {

        System.out.println("total no. in list are "+ l.size());
    }
    }
     
    

