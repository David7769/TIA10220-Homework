package hw1;

public class hw05 {
  public static void main(String args[]) {
	  
     double i=0.02;
     int p = 1500000;
     int y = 10;
     int b1 ;
     System.out.println ("年　A銀行(複利)");
     System.out.println ("----------------------------------------");
     for(int m = 1; m <= y ; m++){
    	 
        b1 = (int)(p * Math.pow( (1+i) , m ));
        System.out.printf ( "%d\t%d\t" ,m,b1 );
   System.out.println ();
     }
   }
}