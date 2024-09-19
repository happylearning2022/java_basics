class IfELseIfCond{

public static void main(String[] args)
{
java.util.Scanner scn = new java.util.Scanner(System.in);
System.out.println("enter a value");
int a = scn.nextInt();
System.out.println("enter b value");
int b = scn.nextInt();
if (a>b)
{
System.out.println(a+" is greater than "+b);
}
else if(a<b){
System.out.println(a+" a is less than "+b);
}

else
{
System.out.println(a+" is equals to "+b);
}
}

}
