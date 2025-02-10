	class A 
		int a,b,c;
		void add()
		{
			a = 435;
			b = 67;
			c = a + b;
			System.out.println("The addition is"+c);
		}
	}
	
	class B extends A 
	{
		void sub()
		{
			a = 45;
			b = 67;
			c = a -b;
			System.out.println("This subtraction is"+ c);
		}
	}
	
	class C extends B 
	{
		void mul()
		{
			a = 45;
			b = 67;
			c = a * b;
			System.out.prinln("The multiplication is"+c);
		}
	}
	
	class D extends C 
	{
		void div()
		{
			a = 45;
			b = 67;
			c = a/b;
			System.out.prinln("The division is"+c);
		}
	}
	
	class ass7 
	{
		public static void main(String[] args)
		{
			D obj1 = new D();
			obj1.add();
			obj1.sub();
			obj1.mul();
			obj1.div();
		}
	}
	