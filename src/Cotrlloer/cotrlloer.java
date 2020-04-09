package Cotrlloer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(cotrlloer.Base_Controller)
public class cotrlloer {
public  static  final  String Base_Controller="logincontroller";
public  static  final  String INDEX_PAGE="../index.jsp";
    @RequestMapping(value = {"/login"},method = {RequestMethod.POST})
    public String login(){
        System.out.println("导入");
        return "INDEX_PAGE";
    }
}
