package com.manish.javadev.aspect;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.manish.javadev.model.CustomerBean;

@SuppressWarnings("unchecked")
@Aspect
public class LoggingAspect {
	@Pointcut("execution(* com.manish.javadev.servie.impl.CustomerServiceImpl.getAllCustomer(..))")
	void pc1() {
	}

	@Pointcut("execution(* com.manish.javadev.servie.impl.CustomerServiceImpl.getCustomerById(..))")
	void pc2() {
	}

	@Around("pc1()")
	public List<CustomerBean> logAroundgetAllCustomer(ProceedingJoinPoint joinPoint) throws Throwable {
		List<CustomerBean> customerBeanList = null;
		System.out.println("logAroundgetAllCustomer Start");
		try {
			customerBeanList = (List<CustomerBean>) joinPoint.proceed();
		} finally {
			// TODO Some Cleanup for your code
		}
		System.out.println("logAroundgetAllCustomer End");
		return customerBeanList;
	}

	@Around("pc2()")
	public CustomerBean logAroundGetCustomerById(ProceedingJoinPoint joinPoint) throws Throwable {

		CustomerBean customerBean = null;
		System.out.println("logAroundGetCustomerById Start");
		try {
			customerBean = (CustomerBean) joinPoint.proceed();
			System.out.println();
		} finally {
			// TODO Some Cleanup for your code
		}
		System.out.println("logAroundGetCustomerById End");
		return customerBean;
	}

}