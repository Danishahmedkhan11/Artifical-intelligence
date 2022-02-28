import java.util.*;

public class q11
{
    int a,i,sum=0;// variable
    Scanner sw=new Scanner(System.in);
    System.out.print("Enter any number:");
    a=sw.nextInt();//input value

    System.out.print(a);//output a of values

    void display()//function display
    {
        for(i=1;i<100;i++)//for loop
        {
            b=a%2;
            if(b==0)
            {
                sum=sum+b;
                System.out.print(sum);
            }
            else 
            {
                System.out.print(sum);
            }
            
        }
    }

}
class Q1{//class 


public void main(String []args)
{
q11 sn=new q11();
sn.display();

}
}