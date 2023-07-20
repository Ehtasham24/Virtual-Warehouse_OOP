package Inventory;
import Inventory.Randomcode;
import java.util.Scanner;
public class JavaApplication6 {

    public static void main(String[] args) {
        
        Scanner SBY1=new Scanner(System.in);
        char a;
        Randomcode SBY=new Randomcode();
        do
        {
        SBY.Data();
        SBY.reciet();
        System.out.println("Do you want to Continue(Y/y)OR(N/n)");
        a=SBY1.next().charAt(0);
        }
        while(a=='Y'||a=='y');
        {
            System.out.println("\t\t\t{---Thank You Come Again---}");
        }
    }
    
}

    
    

