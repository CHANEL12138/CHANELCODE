package com.chanelcode.controller;

import com.chanelcode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")//在前缀上加上路径的话在类上加注解
public class MyController {

static{
    System.out.println(
            "ahahifajiosjdoasd"
    );
}

public void test()
{
    System.out.println("dsaijdasijo");
}
    /*
     * 处理用户提交的请求，springmvc中是使用方法来处理的。
     * 方法是自定义的，可以有多种返回值，多种参数，方法名称自定义
     * */

    /*
     * 准备使用doSome方法处理some.do请求。
     * @RequestMapping：请求映射，作用是把一个请求地址和一个方法绑定在一起。
     *                  一个请求指定一个方法处理。
     *             属性：1. value是一个String类型，表示请求的uri地址（这里是：some.do）
     *                     value值是唯一的，不能重复
     *             说明：使用@RequestMapping修饰的方法叫做处理器方法或者控制器方法
     *                   可以处理请求，类似servlet中的doGet,doPost
     * */

    /*
     * 返回值 ModelAndView 表示本次请求的处理结果
     *   model:数据，请求处理完后，要显示给用户的数据
     *   view：视图，比如jsp等
     * */
    @RequestMapping( value = "/some.do")
    public ModelAndView doSome(HttpServletRequest request)
    {
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg","这是msg");
        mv.addObject("fun","这是fun"+request.getParameter("name"));

        mv.setViewName("show");
        return mv;
    }



    @RequestMapping("/form.do")
    public ModelAndView form(String name,Integer age)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
//        mv.setViewName("forward:/index.jsp");
// 如果要转发的页面没有在视图解析器里面 就用forward转发 redirect携带请求参数二次转发

        mv.setViewName("show");
        return mv;

    }
    /*
     * 请求参数名和处理器方法的形参名不一样
     * @RequestParam：定义在处理器方法的形参前面
     *   属性：1. value，请求参数名，可省略
     *        2. required，是一个Boolean类型，默认为true，表示必须包含参数
     * */

    @RequestMapping(value = "/other.do")
    public ModelAndView doOther(@RequestParam("iname" ) String name,
                                @RequestParam("iage") Integer age){
        System.out.println("doOther方法的，name="+name+", age="+age);

        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }




    @RequestMapping("/form1.do")
    public ModelAndView doObj(Student student)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("Stuname",student.getName());
        mv.addObject("Stuage",student.getAge());

        mv.setViewName("show");

        return mv;
    }

    /*
     * 处理器方法返回String,表示逻辑视图名称，需要配置视图解析
     * */
    @RequestMapping(value = "/returnString-view.do")
    public String doReturnView(HttpServletRequest request,String name, Integer age) {
        System.out.println("dosome方法的，name=" + name + ", age=" + age);

        //手动添加数据到request作用域
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        /*
         * show：逻辑视图名称
         * 框架对视图执行forward转发操作
         * */

        return "show";
    }


}
