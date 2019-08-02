import java.util.Scanner;
class Factorial{
public static void main(String args[]){
int i,multi=1,n=0;
Scanner scan = new Scanner(System.in);
n=scan.nextInt();
for(i=1;i<=n;i++)
{
multi=multi*i;
}
System.out.println(multi);
}
}
