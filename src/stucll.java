//import bean.Student;
//import com.sun.net.httpserver.HttpServer;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.HttpSessionRequiredException;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping(stucll.BASE_CONTROLLER)
//public class stucll {
//    public static final String BASE_CONTROLLER = "/stucll";
//    public static final String INDEX_PAGE = "../index.jsp";
//
//
//    @RequestMapping(value = "/getSTUid", method = {RequestMethod.GET})
//    public String getSTUid(Integer id, @RequestParam(value = "name") String stu) {
//        System.out.println("666660" + id + "23232" + stu);
//        return "INDEX_PAGE";
//    }
//
//    //新增
//    @RequestMapping("/addstu")
//    public String addstu(Integer id, Student stu1) {
//        System.out.println("id为" + id);
//        System.out.println("学生信息为" + stu1.getId() + "" + stu1.getName() + "" + stu1.getAge());
//
//        return INDEX_PAGE;
//    }
//
//    @RequestMapping("/getStuById")
//    public String getStuById(Integer[] ids, Student stu1) {
//        if (ids != null) {
//            for (Integer i : ids) {
//                System.out.println(i);
//            }
//        } else {
//            System.out.println("null"+ids);
//
//        }
//
//
//    }
//    @RequestMapping("/getServilet")
//public  String getServilet(HttpServletRequest request, HttpServletResponse response, HttpSession session){
//        System.out.println("请求对象"+request);
//        System.out.println("SEESSION"+request.getSession());
//        System.out.println(""+response);
//        System.out.println("其他对象"+session);
//    return INDEX_PAGE;
//}
//    }
