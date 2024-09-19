class MethodOverload{
public static double Method1(int i){
return i;
}
public static int Method1(int i,int j)
{
int k= i+j;
return k;
}
public static int Method1(int i,int j,int k)
{
int r= i+j+k;
return r;
} 
public static void main(String[] args)
{
System.out.println(Method1(20,40));
System.out.println(Method1(20,40,30));
System.out.println(Method1(20));

}
}