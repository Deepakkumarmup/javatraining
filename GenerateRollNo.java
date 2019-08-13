import java.util.Scanner;
class GenerateRollNo{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the details :");
String Name = scan.nextLine();
String DOB = scan.nextLine();
String Dept = scan.nextLine();
String College = scan.nextLine();

String RollNo = College.substring(0,1) + Dept.substring(0,2) + DOB.substring(0,2) + Name.substring(0,4) + DOB.substring(3,5) + DOB.substring(8);

System.out.println(RollNo);
}
}
