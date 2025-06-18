import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a,b;
	    Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    b=sc.nextInt();
	    char c=sc.next().charAt(0);
	    switch(c){
	        case '+':
	            System.out.println(a+b);
	            break;
	       case '-':
	            System.out.println(a-b);
	            break;
	       case '*':
	            System.out.println(a*b);
	            break;
	       case '/':
	            System.out.println(a/b);
	            break;
	       default:
	           System.out.println("Not Found");
	           break;
	    }
	}
}
