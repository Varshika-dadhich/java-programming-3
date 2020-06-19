package com.company;

import java.util.Scanner;
class palindrome {
    int temp;
int rev=0;
    int toCheck(int num){

        if(num<=0)
        {
            return rev;
        }
        else {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            return toCheck(num / 10);
        }
    }


    public static void main(String[] args){
        palindrome p1=new palindrome();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. you want to check");
        int n=sc.nextInt();
int temp=n;

        p1.toCheck(n);
      //  p1.display();
        if (p1.rev==temp) {
            System.out.println(n+" is palindrome");
        } else {
            System.out.println(n+"is not palindrome");
        }
    }
}
