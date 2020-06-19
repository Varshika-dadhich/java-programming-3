import java.util.Scanner;

class Complex{
    public int sumr,sumi,diffr,diffi,mulr,muli;
     void add(int r1,int r2,int i1,int i2) {
         sumr = r1 + r2;
         sumi = i1 + i2;
    }
    void displayAdd(){
        System.out.println(sumr+"+"+sumi+"i");
    }
    void diff(int r1,int r2,int i1,int i2){
         diffr=r1-r2;
         diffi=i1-i2;
    }
    void displaydiff(){
        System.out.println(diffr+"+"+diffi+"i");
    }
    void mul(int r1,int r2,int i1,int i2){
         mulr=(r1*r2)-(i1*i2);
         muli=(r1*i2)+(r2*i1);
    }
    void displaymul(){
        System.out.println(mulr+"+"+muli+"i");
    }

    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
        System.out.println("enter first real and img no.");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        System.out.println("enter Second real and img no.");
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        Complex c1=new Complex();
        System.out.println("ADDITION");
        c1.add(r1,r2,i1,i2);
        c1.displayAdd();
        System.out.println("SUBTRACTION");
        c1.diff(r1,r2,i1,i2);
        c1.displaydiff();
        System.out.println("MULTIPLICATION");
        c1.mul(r1,r2,i1,i2);
        c1.displaymul();

    }
}