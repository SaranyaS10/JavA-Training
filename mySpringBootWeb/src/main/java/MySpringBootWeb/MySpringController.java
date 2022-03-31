package MySpringBootWeb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MySpringController {
	
	
	@RequestMapping("home")
	//public String home(HttpServletRequest request,HttpServletResponse response)
	
//		HttpSession session=request.getSession();
//		String productName=request.getParameter("productName");
//		session.setAttribute("productName", productName);
		//System.out.println("hi"+productName);
//	public ModelAndView home(@RequestParam("productName") String productName)
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("productName", productName);
//		mv.setViewName("page1");
//		System.out.println("hi"+productName);
//		return mv;
//	}
		public ModelAndView home(Product product)
		{
			ModelAndView mv=new ModelAndView();
			mv.addObject("product", product);
			mv.setViewName("page1");
			System.out.println("hi"+product);
			return mv;
		}
}



