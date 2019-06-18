import java.util.Scanner;

class Bid
{
	int a;
	String b;
	int lotno;
    Bid(){}
	Bid(int a,String b)
	{
		this.a=a;
		this.b=b;
		
	}
	public Bid[] purchase()
	{
		Bid[] b=new Bid[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the Purchaser Number");
			int prNo=sc.nextInt();
			
			System.out.println("Enter the Purchaser Name");
			String prName=sc.next();
			
			b[i]=new Bid(prNo,prName); //here indirectly prNo=a and prName=b
			
		}
		return b;
	}
	
}

	class Lot
	{
		double accBal1=50000;
		double accBal2=60000;
		double accBal3=70000;
		double z;
		
		public void cal(Lot b1[]) 
		{
			//b1[0]=(0.1*b1[0])-accBal1;
		}
		
		public void lot(Bid[] b)
		{
			int[] b1=new int[3];
			Scanner sc=new Scanner(System.in);
			for(int a=0;a<b1.length;a++)
			{
				System.out.println("This is bidding for lotno "+(101+a));
					for(int i=0;i<3;i++)
					{
						
						System.out.println("Enter the bid amount for "+b[i].b);
						int bid=sc.nextInt();
						b1[i]=bid;
						
					}
					
						if(b1[0]>b1[1] && b1[0]>b1[2])
							
						{
							
							System.out.println("Bidding validated");
							System.out.println("Bidder name " +b[0].b+" , "+ "Bid amount rs"+b1[0]);
						}
						else
							if(b1[1]>b1[0] && b1[1]>b1[2])
							{
								System.out.println("Bidding validated");
								System.out.println("Bidder name " +b[1].b+" , "+ "Bid amount rs"+b1[1]);
							}
							else
							{
								System.out.println("Bidding validated");
								System.out.println("Bidder name " +b[2].b+" , "+ "Bid amount rs"+b1[2]);
							}
					
					
			}
			
		}

	}

public class BidArray {

	public static void main(String[] args) {
		Bid v2=new Bid();
		Lot v1=new Lot();
		/*v2.purchase();*/
		v1.lot(v2.purchase());
		
		
		/*Bid[] b=new Bid[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the Purchaser Number");
			int prNo=sc.nextInt();
			
			System.out.println("Enter the Purchaser Name");
			String prName=sc.next();
			
			b[i]=new Bid(prNo,prName);
		}
		int[] b1=new int[3];
		for(int a=0;a<b1.length;a++)
		{
			System.out.println("This is bidding for lotno "+(101+a));
				for(int i=0;i<3;i++)
				{
					
					System.out.println("Enter the bid amount for "+b[i].b);
					int bid=sc.nextInt();
					b1[i]=bid;
				}
				
					if(b1[0]>b1[1] && b1[0]>b1[2])
					{
						System.out.println("Bidding validated");
						System.out.println("Bidder name " +b[0].b+" , "+ "Bid amount rs"+b1[0]);
					}
					else
						if(b1[1]>b1[0] && b1[1]>b1[2])
						{
							System.out.println("Bidding validated");
							System.out.println("Bidder name " +b[1].b+" , "+ "Bid amount rs"+b1[1]);
						}
						else
						{
							System.out.println("Bidding validated");
							System.out.println("Bidder name " +b[2].b+" , "+ "Bid amount rs"+b1[2]);
						}
				
				
		}	
		*/
		/*for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i].a+" : "+b[i].b);
		}*/

	}

}
