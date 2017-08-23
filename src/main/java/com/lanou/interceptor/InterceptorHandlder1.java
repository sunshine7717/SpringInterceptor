package com.lanou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorHandlder1 extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//在请求发来的时候还未开始处理，就已经执行这个方法了
		//true：请求通过
		//false：不通过
		System.out.println("interceoptor1-------preHandle");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
		//处理请求之后执行这个方法
		System.out.println("interceoptor2-------postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
		//请求处理完成
		System.out.println("interceoptor3-------afterCompletion");
	}

	
	//适配器模式：为了防止接口冲突
	//适配器类主动实现了相关接口的方法
	//在使用中，继承适配器类创建子类使用
	//子类可以自己决定重写哪些方法，而不是全都实现所有的接口方法
	
	
}
