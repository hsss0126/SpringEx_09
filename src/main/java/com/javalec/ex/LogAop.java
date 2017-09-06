package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {

		String str = joinPoint.getSignature().toShortString();
		System.out.println(str +" 실행");
		long st = System.currentTimeMillis();

		try {
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(str + " 종료");
			System.out.println("실행시간: " + (et - st));
		}
	}
}
