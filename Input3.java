class Input3
{
public static void main(String[] args)
{
java.util.Scanner scn = new java.util.Scanner(System.in);

System.out.println("Enter sting name");
String s =scn.next();

System.out.println("Enter age");
int a = scn.nextInt();

System.out.println("Enter salary");
double b = scn.nextDouble();

System.out.println("Enter gender");
char c = scn.next().charAt(0);

System.out.println("Enter mobile no");
long l = scn.nextLong();


System.out.println(s+" is a software developer");
System.out.println("age is " + a);
System.out.println("Salary is " + b);
System.out.println("gender is "+c);
System.out.println("mobile no is "+l);

}
}