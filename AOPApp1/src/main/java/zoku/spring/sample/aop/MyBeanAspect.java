package zoku.spring.sample.aop;

import org.aspectj.lang.JoinPoint;

public class MyBeanAspect {
	public void addDataBefore(JoinPoint joinpoint) {
		System.out.println("*addData before...*");
		String args = "args: \"";
		for (Object ob : joinpoint.getArgs()) {
			args += ob + "\"";
		}
		System.out.println(args);

	}

}
