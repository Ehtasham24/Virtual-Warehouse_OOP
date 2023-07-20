package javaapplication5;
import java.util.Scanner;
public class feedback extends Prediction{
    double fp,ratio;
    int ot;
    Scanner sc=new Scanner(System.in);
    void feedback(int cost,int sales,int units){
        fp=cost*0.30;
        ratio=sales-cost;
        for(int i=0;i<=0;i++){
        if(ratio==fp){
            System.out.println("The product's feedback was good.");
            System.out.println("you made a profit of "+ratio);
            System.out.println("do you want to calculate optimal value of product?");
            char ch=sc.next().charAt(0);
            if(ch=='y'|| ch=='y'){
            System.out.println("Enter total number of products: ");
            int tp=sc.nextInt();
            System.out.println("Enter the product retail price: ");
            int rp=sc.nextInt();
            double bp=tp*0.25;
                        double sp=tp-bp;
                        double productcost= rp*tp;
                        double profitcost=productcost*0.3;
                        double totalcost=profitcost+productcost;
                        double price=totalcost/bp;
                        System.out.println("Products suitable price is: "+price);
                        System.out.println();}
        else
                break;
        }
        else if(ratio>fp){
            System.out.println("The product's feedback was excellent.");
            System.out.println("you made a profit of: "+(ratio-fp));
            System.out.println();
            System.out.println("do you want to calculate optimal value of product?");
            char ch=sc.next().charAt(0);
            if(ch=='y'|| ch=='y'){
            System.out.println("Enter total number of products: ");
            int tp=sc.nextInt();
            System.out.println("Enter the product retail price: ");
            int rp=sc.nextInt();
            double bp=tp*0.10;
                        double sp=tp-bp;
                        double productcost= rp*tp;
                        double profitcost=productcost*0.3;
                        double totalcost=profitcost+productcost;
                        double price=totalcost/bp;
                        System.out.println("Products suitable price is: "+price);
            }
            else
                break;
            }
        else if(ratio<fp){
            System.out.println("The product's feedback was poor");
            System.out.println("The product is not suitable for long term.");
            System.out.println("You made a profit of: "+(ratio));
            System.out.println("do you want to calculate optimal value of product?");
            char ch=sc.next().charAt(0);
            if(ch=='y'|| ch=='y'){
            System.out.println("Enter total number of products: ");
            int tp=sc.nextInt();
            System.out.println("Enter the product retail price: ");
            int rp=sc.nextInt();
            double bp=tp*0.35;
                        double sp=tp-bp;
                        double productcost= rp*tp;
                        double profitcost=productcost*0.3;
                        double totalcost=profitcost+productcost;
                        double price=totalcost/bp;
                        System.out.println("Products suitable price is: "+price);
           
            }
       
            else 
                break;
        }
          
            }
          }
           
        }
        

    
    
    


