import java.util.Scanner;
class ExceptionExample0{
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter the value of a");
		a=sc.nextInt();
        try{
		System.out.println("\nEnter the value of b");
		b=sc.nextInt();
		c=a/b;
		System.out.println("\na ="+a +" b=" +b+ "a/b=" +c);
	} catch(ArithmeticException e){
		System.out.println("Exception");
		

	}
	finally{
		System.out.println("In finally");
	}

	} 
	    c=a/b;
	    System.out.println("\na="+a +"b=" +b+ "a/b=" +c);
}