package Newproject;

import java.util.Scanner;

/*
 Example : If the distance travelled  is 5632 
Product of digits in odd position = 5 * 3 = 15
Product of digits in even  position = 6 * 2 = 12
As 15 > 12, the bonus points the player gets is 15.
 */
public class Bonuspoint1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the kilometers travelled");
        int a=sc.nextInt();
        int b=1,c=1,i=1;
        

        if(a>0) {
            
                while(a>0) {
                    if(i%2!=0)
                    {
                        b=b*(a%10);
                        a=a/10;

                    }
                    else
                    {
                        c=c*(a%10);
                        a=a/10;
                    }i++;
                }
            
            if (b>c) {
                System.out.println("bonus point is: "+ b );
            }
            else if(c==b)
            {
                System.out.println("bonus point is: "+ b*2 );
            }
            else
            {
                System.out.println("bonus point is: "+ c);
            }

        }
        else
        {
            System.out.println("invalid number");
        }


    }
}
		
		
						
			
		
	
