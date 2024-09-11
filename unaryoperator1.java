class unaryoperator1
{
public static void main(String[] args) 
{
int a = 1;
int b = 1;

int c;

a = ++a + a++;
c = ++a + b++;

System.out.println(a);
System.out.println(b);
System.out.println(c);
}
} 