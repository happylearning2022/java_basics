class MainOverload{

public static void main(String[] args)
{
	main("sjhjdhsj");
	main();
}
public static void main(String args)
{
System.out.println("main with string args "+args);
}
public static void main()
{
System.out.println("main with no params");
}
}