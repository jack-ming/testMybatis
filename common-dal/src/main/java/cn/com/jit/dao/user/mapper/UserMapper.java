package cn.com.jit.dao.user.mapper;

import cn.com.jit.dao.user.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by jack on 2018/7/5.
 */
@Mapper
public interface UserMapper {

    User getUserList();

    void addUser(User user);

    void addUsers(Map map);

    int deleteUser(int id);

    int updateUser(User user);

}
