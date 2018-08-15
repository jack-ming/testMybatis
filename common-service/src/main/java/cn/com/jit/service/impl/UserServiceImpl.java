package cn.com.jit.service.impl;

import cn.com.jit.dao.user.UserDao;
import cn.com.jit.dao.user.model.User;
import cn.com.jit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jack on 2018/8/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUser() {
        User user = userDao.getUsers();
        return user;
    }
}
