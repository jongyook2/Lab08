package overload;

public class Overload {
	
	
	    public static void main (String [] args)
	    {
	        double sum = getSum (40.0, 50.0);
	        double product = getProduct (1.0, 2.0, 3.0);
	        double average = getAverage (10.0, 11.0);
	        System.out.println ("sum = " + sum);
	        System.out.println ("product = " + product);
	        System.out.println ("aveage = " + average);
	    }


	    public static double getSum (double first, double second)
	    {
	        return (first + second);
	    }
	    
	    public static double getProduct (double first, double second,  double third)
	    {
	        return (first * second * third) ;
	    }


	    public static double getAverage (double first, double second)
	    {
	        return (first+second)/2 ;
	}

}
