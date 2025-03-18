public class I6{
public static void main(String[]args){
sacc s1=new sacc(11,5000);
cacc c1=new cacc(22,1000);
s1.bb();
s1.calci();
c1.bb();
c1.calca();
}
}

class BankAcc{
int accno;
int balance;
BankAcc(int accno,int balance){
this.accno=accno;
this.balance=balance;
}
void bb(){
System.out.println("It is a bank account with account number: "+accno+" and balance is: "+balance);
}
}
class sacc extends BankAcc{
sacc(int accno,int balance){
super(accno,balance);
}
void calci(){
System.out.println("Interest on Your savings account is (per annum): "+balance*0.1);
}
}
class cacc extends BankAcc{
cacc(int accno,int balance){
super(accno,balance);
}
void calca(){
System.out.println("Interest on Your current account is (per annum): "+balance*0.2);
}
}

