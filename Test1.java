import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any name ");
		String n="";
		int i=0;
		n=sc.nextLine();
		System.out.println("Enter any int ");
		i=sc.nextInt();
		
		System.out.println(" name = "+n);
		System.out.println(" i = "+i);
		
		sc.close();

	}

}
