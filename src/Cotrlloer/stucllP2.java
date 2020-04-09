package Cotrlloer;

import bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(stucllP2.BASE_CONTROLLER)
public class stucllP2 {
    public static final String BASE_CONTROLLER = "/stucllP2";
    public static final String INDEX_PAGE = "../index.jsp";

    @RequestMapping("/Data")
    public String getData(HttpServletRequest request, HttpServletResponse response, ModelMap m, ModelMap mm,
                          @ModelAttribute("stu1") Student stu1,
                          @ModelAttribute("sex") Integer sex) {
//       Object attribute = request.getAttribute("name1", "xiaoming");
//       request.getSession().setAttribute("name2","xiaoming2");
//       return INDEX_PAGE;

//        ModelAndView mv = new ModelAndView();
//        mv.addObject("s1", new Student(1,"1a","18"));
//        mv.setViewName(INDEX_PAGE);
//        return mv;

        m.addAttribute("name", "笑话");
        mm.addAttribute("name", "笑话");
        mm.put("s", "1");
        stu1.getId(2);
        stu1.getName("姓名");
        sex = 18;
        return INDEX_PAGE;
    }

    @RequestMapping("getData2")
    @ResponseBody
    public List getData2() {
        //1.直接相应字符串
        //   return "java是最坏的语音";


        //2.响应引用对象
//Student stu1=new Student(2,"小明","18");
//return stu1;


        //3.响应集合
        Student stu1 = new Student(2, "小明", "18");
        Student stu2 = new Student(2, "小明1", "19");
        Student stu3 = new Student(2, "小明2", "20");
        List list=new ArrayList();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        return list;


    }

}


