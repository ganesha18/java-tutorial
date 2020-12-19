//Q: Create a class that checks whether number is prime or not (number should be of range 1-100).Take input from user?

import java.util.Scanner;
class test{

public static void main(String args[]){
Scanner s= new Scanner(System.in);
int count=0;
System.out.println("Enter an integer between 1 to 100:");
int num=s.nextInt();
if(num>100|| num<1)
  System.out.println("input out of range:");
else
  {
for(int i=1;i<=num;i++)
{
  if(num==1|| num==0)
   System.out.print("Not a prime number");
 if(num%i==0)
  count++;

}
if(count<3)
 System.out.print("It is prime number:");
else
 System.out.print("It is not a prime number.");

}}
}