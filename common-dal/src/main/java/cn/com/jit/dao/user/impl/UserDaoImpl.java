package cn.com.jit.dao.user.impl;

import cn.com.jit.dao.user.UserDao;
import cn.com.jit.dao.user.mapper.UserMapper;
import cn.com.jit.dao.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jack on 2018/7/5.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    public User getUsers() {
        User users = userMapper.getUserList();
        System.out.println(users.getName());
        System.out.println("===============");
        User user = new User();
        user.setName("test01");
        user.setAge(11);
        //userMapper.addUser(user);

        List<User> userList = new ArrayList<User>();
        User user01 = new User();
        user01.setName("test02");
        user01.setAge(12);
        User user02 = new User();
        user02.setName("test03");
        user02.setAge(12);
        userList.add(user01);
        userList.add(user02);
        Map<String, Object> userMap = new HashMap<String, Object>();
        userMap.put("userlist", userList);
        //userMapper.addUsers(userMap);

        User updateUser = new User();
        updateUser.setId(13);
        updateUser.setName("test0202");
        updateUser.setAge(16);
        //userMapper.updateUser(updateUser);

        userMapper.deleteUser(9);
        return users;
    }

    public String testTranction(){
        userMapper.getUserList();

        return "";
    }

}
