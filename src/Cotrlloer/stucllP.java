package Cotrlloer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(stucllP.BASE_CONTROLLER)
public class stucllP {
    public static final String BASE_CONTROLLER = "/stucllP";
    public static final String INDEX_PAGE = "../index.jsp";
     @RequestMapping("/addStu")
         public ModelAndView addStu(HttpServletRequest request, HttpServletResponse response) {
         System.out.println("跳转页面");
         try {
             //request.getRequestDispatcher("../index.jsp").forward(request, response);
         //response.sendRedirect(request.getContextPath()+"/index.jsp");
           //  return"redirect:index.jsp";
             //return  "forword:../index.jsp";
             ModelAndView mv=new ModelAndView();
             mv.setViewName("index.jsp");
             return mv;

         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }



     }
     }


