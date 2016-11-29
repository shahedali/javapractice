class A
{
	void m1()
	{
		System.out.println("m1-A");
	}
}
class B 
{
	class C extends A
	{
		void m2()
		{
			System.out.println("m2-C");
		}
	}
}
class test73
{
	public static void main(String[] args) 
	{
		A a=new B().new C();
		a.m1();
		//a.m2();--------->Error
		B.C bc=new B().new C();
		bc.m1();
		bc.m2();
		
	}
}
