package javaapplication5;

public class Prediction {
int total;
void gross(int gross,int sales,int cost){
    gross=sales-(cost);
    System.out.println("Your gross income:"+gross);
    total=sales+cost;
    gross=(sales*100)/total;
    System.out.println("Your gross profit is: "+gross+"%");
}
void operating(int oper,int gross,int rent,int bills){
    oper=gross-(rent+bills);
    System.out.println("Your operating profit:"+oper);
    total=oper+rent+bills;
    oper=(oper*100)/total;
    System.out.println("Your operating profit is: "+oper+"%");
    
}
void netinc(int netinc,int oper,int salaries){
    netinc=oper-salaries;
    System.out.println("Your net income accounts to:"+netinc);
    total=netinc+oper+salaries;
    netinc=(netinc*100)/total;
    System.out.println("Your profit is: "+netinc+"%");
    
}    
}
