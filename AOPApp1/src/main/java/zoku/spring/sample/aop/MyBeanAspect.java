package zoku.spring.sample.aop;

import org.aspectj.lang.JoinPoint;
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

}
