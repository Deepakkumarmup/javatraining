import java.util.Scanner;
class Sum_of_array_elements{
    public static void main(String args[]){
       int n,sum=0;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter no of elements in an array: "); 
       n = scan.nextInt();
       int a[] = new int[n];
       System.out.println("Enter the array elements: ");
       for(int i=0;i<n;i++){

            a[i]=scan.nextInt();
            sum = sum + a[i];

       }
       System.out.println("Sum: "+sum);
    }
}
