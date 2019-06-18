import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		String[] s=new String[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
		System.out.println("Enter the value");
		String t=sc.next();
		s[i]=t;
	
		}
System.out.println("Length of Array :"+s.length);
for(int i=0;i<s.length;i++)
{
	System.out.println("Element of "+i+" : "+s[i]);
}
	}

}
