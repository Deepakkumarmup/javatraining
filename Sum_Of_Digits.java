import java.util.Scanner;
class Sum_Of_Digits
{
    public static void main(String args[])
    {
        int num, rem, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = s.nextInt();
        while(num > 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}
