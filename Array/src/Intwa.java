import java.util.Scanner;

class Intwa1
{
	int a;
	String b;
	Intwa1(int a, String b)
	{
		this.a=a;
		this.b=b;
	}
}
public class Intwa {

	public static void main(String[] args) {
		
		Intwa1[] v=new Intwa1[5];
		v[0]=new Intwa1(1,"vivek");
		v[1]=new Intwa1(2,"snehal");
		v[2]=new Intwa1(3,"rahul");
		v[3]=new Intwa1(4,"pihu");
		v[4]=new Intwa1(5,"sachin");
	
		for (int i = 0; i < v.length; i++) 
            System.out.println("Element at " + i + " : " + 
                        v[i].a +" "+ v[i].b);

	}

}
