package javaapplication5;
import Inventory.*;
import java.util.Scanner;
public class JavaApplication5 {

    public static void main(String[] args) {
        int op,gr,t,s,c;
        int rent=55000,salar,b;
        char a;
        Scanner sc=new Scanner(System.in);
        feedback obj=new feedback();
        Randomcode obj1=new Randomcode();
        do{
        System.out.println("Welcome to virtual warehouse. How may I help you?");
        System.out.println("01. Add inventory to the ware house.");
        System.out.println("02. Calculate my gross profit.");
        System.out.println("03. Calculate my operating cost for a month.");
        System.out.println("04. Calculate my netincome.");
        System.out.println("05. Product's performance calculator.");
        int ch=sc.nextInt();
        if(ch==1){
                obj1.Data();
                obj1.reciet();
        }
        else if(ch==2){
            System.out.println("Enter your total sales digits:");
            s=sc.nextInt();
            System.out.println("Enter your total cost digits:");
            c=sc.nextInt();
            obj.gross(0, s, c);
            }
        else if(ch==3){
            System.out.println("Enter your gross income digits:");
            gr=sc.nextInt();
            System.out.println("Enter your bills digits: ");
            b=sc.nextInt();
            obj.operating(0, gr, rent, b);
            System.out.println();
        }
        else if(ch==4){
            System.out.println("Enter your operating cost:");
            op=sc.nextInt();
            System.out.println("Enter your employees salary digits:");
            salar=sc.nextInt();
            obj.netinc(0, op, salar);
            System.out.println();
        }
        else if(ch==5){
            System.out.println("Enter your total sales digits:");
            s=sc.nextInt();
            System.out.println("Enter your total cost digits:");
            c=sc.nextInt();
            obj.feedback(c, s, 0);
            System.out.println();
            
                }
            System.out.println();
            System.out.println("Do you want to continue more? (y/n)");
            a=sc.next().charAt(0);
        }
        while(a=='Y'||a=='y');
        {
        System.out.println();
        System.out.println("Thank you come again.");
    }
    }
}
    
