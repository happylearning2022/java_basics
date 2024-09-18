class FunWithManyParms{

public static void Method1(int i,int j){
System.out.println("my method1 value i is= "+i+" and j is= "+j);
}
public static void main(String[] args){
java.util.Scanner scn = new java.util.Scanner(System.in);
System.out.println("Start");
System.out.println("enter value");
int a = scn.nextInt();
System.out.println("enter value");
int b =scn.nextInt();
Method1(b,a);
String s = scn.next();
double d = scn.nextDouble();
Method2(d,s);
System.out.println("End");
}

public static void Method2(double d,String s)
{
System.out.println(d+" is a double value "+" and my name is "+s);
}
}