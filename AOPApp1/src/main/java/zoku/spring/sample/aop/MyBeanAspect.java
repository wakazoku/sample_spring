package zoku.spring.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBeanAspect {

	@Before("execution(* zoku.spring.sample.aop.IMyBean.addData(..))")
	public void addDataBefore(JoinPoint joinpoint) {
		System.out.println("*addData before...*");
		String args = "args: \"";
		for (Object ob : joinpoint.getArgs()) {
			args += ob + "\"";
		}
		System.out.println(args);

	}

	@AfterReturning(value = "execution(* zoku.spring.sample.aop.IMyBean.toString())", returning = "str")
	public void toStringAfterReturning(String str) {
		System.out.println("*toString returning...*");
		System.out.println("return:" + str);
		System.out.println("*...end toString returning");
	}

	@AfterThrowing(value = "execution(* zoku.spring.sample.aop.MyBean2.addData(..))", throwing = "e")
	public void addDataAfterThrowing(Exception e) {
		System.out.println("*Except in addData...*");
		System.out.println(e.getLocalizedMessage());
		System.out.println("*...end Except in addData");
	}

	@Around("execution(* zoku.spring.sample.aop.MyBean1.addData(..))")
	public void toStringAroundProceedingJoinPoint(ProceedingJoinPoint pJoinPoint) {
		System.out.println("*around addData...*");
		System.out.println("before:" + pJoinPoint.getTarget());

		try {
			pJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("After:" + pJoinPoint.getTarget());
		System.out.println("*...end around addData");
	}

}
