package MySpring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessSecondClass implements BeanPostProcessor,Ordered {
	@Override
	public Object postProcessBeforeInitialization(Object arg0,String arg1) throws BeansException
	{
		System.out.println("Before from 2nd Class "+arg1);
		return arg0;
		
	}
	@Override
	public Object postProcessAfterInitialization(Object arg0,String arg1) throws BeansException
	{
		System.out.println("After from 2nd Class "+arg1);
	return arg0;
		
		
	}
	@Override
	public int getOrder() {
		return 0;
	}
}
