package cn.com.jit.controller.user;

import cn.com.jit.dao.user.UserDao;
import cn.com.jit.dao.user.model.User;
import cn.com.jit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jack on 2018/7/5.
 */
@RequestMapping("/")
@Controller
//@ResponseBody
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @RequestMapping("user/getusers")
    private String getUsers(){
        //userDao.getUsers();
        User user = userService.getUser();
        System.out.println("get users");
        return "test";
    }

    @RequestMapping("/")
    private String index(){
        System.out.println("this is index action");
        return "login";
    }

    @RequestMapping("login.html")
    private String login(@RequestParam String username, @RequestParam String password){
        System.out.println("this is login action");
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return "success";
    }

}
