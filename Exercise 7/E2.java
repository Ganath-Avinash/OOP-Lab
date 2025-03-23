public class E2{
public static void main(String[]args){
Bankacc b1=new Bankacc(123,5000);
b1.show();
b1.deposit(-1);
b1.deposit(1000);
b1.withdraw(100);
b1.withdraw(8000);
}
}

class Bankacc{
private int accno;
private long balance;
Bankacc(int accno,long balance){
this.accno=accno;
this.balance=balance;
}
void deposit(int a){
if (a>0){
balance+=a;
System.out.println("Balance is: "+balance);
}
else{
System.out.println("Amount Should be +ve");
}
}

void withdraw(int a){
if (a>0 && balance>=a){
balance-=a;
System.out.println("Balance is: "+balance);
}
else{
System.out.println("Invalid amount");
}
}
void show(){
System.out.println("Balance is: "+balance);
}
}


