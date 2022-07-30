public class typecastingexample{
	
	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char f='F';
		System.out.println("Value of f: "+f);
		
		int g=f;
		System.out.println("Value of g: "+g);
		
		float h=f;
		System.out.println("Value of h: "+h);
		
		long i=f;
		System.out.println("Value of i: "+i);
		
		double j=f;
		System.out.println("Value of j: "+j);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=55.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}

