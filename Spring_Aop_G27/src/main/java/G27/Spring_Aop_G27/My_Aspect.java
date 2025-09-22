package G27.Spring_Aop_G27;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class My_Aspect {
	
	@Before("execution(* G27.Spring_Aop_G27.Service.m1(..))")
	public void before_M1() {
		System.out.println("This is method from aspect is running befire m1 from service");
	}
}
