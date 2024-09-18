class ReturnValueMethod{
public static int Method1(int i,int j)
{
int Sum = i+j;
return Sum;

}
public static void main (String[] args){
java.util.Scanner scn = new java.util.Scanner(System.in);
System.out.println("enter  i value");
int a=scn.nextInt();
System.out.println("enter j value");
int b=scn.nextInt();
int s = Method1(a,b);
System.out.println("sum = "+s);
int s1 = Method2(a,b);
System.out.println("sub = "+s1);
}
public static int Method2(int i,int j){
	int sub = i-j;
	return sub;
}
}