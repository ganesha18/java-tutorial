// Q: write a program which generate factorial of a number given by user.
import java.util.*;
class Factorial{
   public static void main(String[] args){
 Scanner Input=new Scanner(System.in); //declare input variable and make a input method
 System.out.print("Enter any number to find its factorial :"); 
 int number=Input.nextInt();  //take input and store those input in number variable
 int temp=1;              //declare temp variable and intialize by 1
 if (number>=0){                 //used if statement if number is greater and equal to 0
for(int i=number; i>0;i--){           //used for loop in decended order
temp*=i;                                  //store factorial value  in temp
}
System.out.println(number +"!= "+ temp); //print factorial
}
else
System.out.println("Factorial of negative numbers does not exist");    //if factorial is not exist then print this statement
}

}