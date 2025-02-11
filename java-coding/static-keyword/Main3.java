class Main3
{
	static int a = m1();

	static
	{
		System.out.println("Static block run");
	}

	static int m1()
	{
		System.out.println("From m1");
		return 20;
	}

	public static void main(String arg[])
	{
		System.out.println("value of a " + a);
		System.out.println("from main");
	}
}