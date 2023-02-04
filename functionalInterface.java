@FunctionalInterface
interface Calculator
{
	int cube(int a);
	default int square(int a)
	{
		return (a*a);
	}
	default int add(int a, int b)
	{
		return (a + b);
	}
	static int sub(int a, int b)
	{
		if(a>b)
			return (a - b);
		else
			return (b - a);
	}
	static int mul(int a, int b)
	{
		return (a*b);
	}
	static int div(int a, int b)
	{
		if(a>b)
			return a/b;
		else
			return b/a;
	}
}

public class functionalInterface implements Calculator{
    public static void main(String[] args) {
		
		functionalInterface a = new functionalInterface();
		System.out.println(a.cube(5));
		System.out.println(a.square(5));
		System.out.println(a.add(4,2));
		System.out.println(Calculator.sub(2,4));
		System.out.println(Calculator.mul(4,2));
		System.out.println(Calculator.div(2,4));
		

	}

	@Override
	public int cube(int a) {
		
		return (a*a*a);
		
	}
}
