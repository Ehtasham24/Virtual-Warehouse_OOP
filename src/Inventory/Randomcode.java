package Inventory;
import java.util.Scanner;
import java.util.Random;
public class Randomcode extends Abstract {
    public void reciet(){
        Random SBY=new Random();
        Scanner SBY1=new Scanner(System.in);
        int a=SBY.nextInt(10000);
        System.out.println("=>Enter Item No.:");
        int e=SBY1.nextInt();
        switch(e)
        {
            case 1:
            {
               System.out.println("=>How many LOTT of Shirts do you want:");
               int a1=SBY1.nextByte();
               System.out.println("->"+a1+" Lotts of Shirts & here is the code for the order{Sh-"+a+"}");
               break;
            }
            case 2:
                {
               System.out.println("=>How many LOTT of TShirts do you want:");
               int a2=SBY1.nextByte();
               System.out.println("->"+a2+" Lotts of TShirts & here is the code for the order{TSh-"+a+"}");
               break;
                }
            case 3:
                {
               System.out.println("=>How many LOTT of JeansPants do you want:");
               int a3=SBY1.nextByte();
               System.out.println("->"+a3+" Lotts of JeansPants & here is the code for the order{JPts-"+a+"}");
               break;
               }
            case 4:
                {
               System.out.println("=>How many LOTT of DressPants do you want:");
               int a4=SBY1.nextByte();
               System.out.println("->"+a4+" Lotts of DressPants & here is the code for the order{DPts-"+a+"}");
               break;
                }
            default:
            {
                System.out.println("Select the correct Item No.");
            }
        }
    }
}
