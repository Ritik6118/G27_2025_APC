package Lec_06;

public class Inheritance_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		case 1
//		ref var -> parent and constr ->parent
		
//		Parent p=new Parent();
//		System.out.println(p.a);
//		System.out.println(p.b);
//		p.fun1();
//		p.fun2();
//		
		
		
//		case 2
//		ref var -> child and constr-> child
	
		Child c=new Child() ;
		c.fun5();
		((Parent)(c)).fun5();
//		System.out.println(c.common);
//		System.out.println(((Parent)(c)).common);
//		System.out.println(c.a);
//		System.out.println(c.b);
//		System.out.println(c.c);
//		System.out.println(c.d);
//		
//		c.fun1();
//		c.fun2();
//		c.fun3();
//		c.fun4();
		
//		case 3
//		ref var -> parent and constr-> child
		
		Parent p=new Parent();
//		Child c=(Child) p;
//		System.out.println(c.common);
//		System.out.println(p.common);
//		
		p.fun5();
		
		
	}

}
