import java.util.Scanner;
class Fibbonacci
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = s.nextInt();
        int n1=0, n2= 1, n3;
        while(num >= n1)
        {
            n3 = n2 + n1;
            if(n1 == num)
            {
                System.out.println("It is Fibbo");
                break;
            }
            else{
            n1 =n2;
            n2 = n3;
            }  
            
        }
        if(num!=n1)
            {
                System.out.println("It is not a Fibbo");
            }
    }
}