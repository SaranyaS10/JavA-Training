package MySpring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessClass implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object arg0,String arg1) throws BeansException
	{
		System.out.println("Before"+arg1);
		return arg0;
		
	}
	@Override
	public Object postProcessAfterInitialization(Object arg0,String arg1) throws BeansException
	{
		System.out.println("After"+arg1);
		return arg0;
		
	}

}
