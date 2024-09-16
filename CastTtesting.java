class CastTtesting{

public static void main(String[]args)
{

byte b1 = 112; //smallest of all types
//we can assign to any other type withoutcasting -- this is called widening casting
short s1 = b1;
char c1 = (char)b1;
int i1 = b1;
long l1 = b1;
float f1 = b1;
double d1 = b1;

System.out.println("Converting byte to other types" + b1 + " --> Short:" + s1+ ", Char:"+c1+", int: "+i1+ ", long: "+l1+ ", float: "+f1+ ", double: "+d1);

double d2 = 12334455.7 ;
float f2 = (float)d2;
long l2 = (long)d2;
int i2 = (int)d2;
char c2 = (char)d2;
short s2 = (short)d2;
byte b2 = (byte)d2;
System.out.println("double: "+d2+", float: "+f2+" ,long: "+l2+" int: "+i2+" char: "+c2+", short: "+s2+", byte: "+b2);

}

}