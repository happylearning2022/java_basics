class ReturnValueMethod2{
public static String Method1(String fname)
{
return fname;
}
public static void main(String[] args){
java.util.Scanner scn = new java.util.Scanner(System.in);
System.out.println("enter name");
String fname =scn.next();
String n = Method1(fname);
System.out.println("my Father name is "+n);
}

}