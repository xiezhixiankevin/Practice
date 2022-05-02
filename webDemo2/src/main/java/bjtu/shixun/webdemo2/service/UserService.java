package bjtu.shixun.webdemo2.service;

import bjtu.shixun.webdemo2.pojo.User;

/**
 * <Description> UserService
 *
 * @author 26802
 * @version 1.0
 * @ClassName UserService
 * @taskId
 * @see bjtu.shixun.webdemo2.service
 */
public interface UserService {

    //登录
    User login(String username, String password);

}
