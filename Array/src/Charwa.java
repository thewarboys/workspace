import java.util.Scanner;

public class Charwa {

	public static void main(String[] args) {
		char[] a=new char[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the value");
			char b=sc.next().charAt(0);
			a[i]=b;
			
		}
		System.out.println("Length of Array :"+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element of "+i+" : "+a[i]);
		}

	}

}
 