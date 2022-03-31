package JFS.BookShopApp;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggerInfoClass {
	
  @Before(value = "execution(public void displaybook())")
	public void beforedisplaybook(JoinPoint joinPoint) {
		System.out.println("Logger info getClass() :"+joinPoint.getClass());
		System.out.println("Logger info getSignature():"+joinPoint.getSignature());
		System.out.println("Logger info getKind(): "+joinPoint.getKind());
		System.out.println("Logger info getArgs(): "+joinPoint.getArgs());
		System.out.println("Logger info hashCode(): "+joinPoint.hashCode());
		System.out.println("Logger info getSourceLocation(): "+joinPoint.getSourceLocation());
		
		
		
	}
  @After("execution(public void displaybook())")
  public void afterdisplaybook(JoinPoint joinPoint) {
		System.out.println("Logger info: Method Name : afterdisplaybook");
		System.out.println("Logger info getStaticPart(): "+joinPoint.getStaticPart());
		System.out.println("Logger info getTarget(): "+joinPoint.getTarget());
		
	}
  
  @AfterReturning(value = "execution(public Integer horrorbookcount())",returning="horrorbookcount")
  
  public void afterReturningHorrorBookCount() {
	  System.out.println("Logger info:Method Name :afterReturningHorrorBookCount");
	  System.out.println("Logger info:After returning horrorbookcount method");
  }
  
  @Around("execution(public Integer horrorbookcount())")
  public void aroundhorrorbookcount() {
	  System.out.println("Logger info:aroundhorrorbookcount"); 
  }
  
  @Pointcut("execution(* HorrorBook.*(..))")
  public void selectone() {
	  
  }
  @Around("selectone()")
  public void aroundSelectOnePC(JoinPoint joinPoint) {
	  System.out.println("Logger info:aroundSelectOnePC"); 
	  System.out.println("Logger info getThis(): "+joinPoint.getThis());
	  System.out.println("Logger info toString(): "+joinPoint.toString());
	  System.out.println("Logger info toLongString: "+joinPoint.toLongString());
	  System.out.println("Logger info toShortString: "+joinPoint.toShortString());
  }
  
//  @Pointcut("within(JFS.BookShopApp.BookStock.*)")
//  public void modelViewAP() {
//	  System.out.println("Logger info:From another package"); 
//  }
//  @Around("modelViewAP())")
//  public void aroundmodelViewAP() {
//	  System.out.println("Logger info:aroundmodelViewAP"); 
//  }
}
