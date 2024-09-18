class Unary2
{
public static void main(St ring[] args)
{
int a=1;
int b=2;
int c;

a = a-- + --b;
b = --b + --a;
c=a+b;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
