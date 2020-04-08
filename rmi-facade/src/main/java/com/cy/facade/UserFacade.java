package com.cy.facade;

import com.cy.entity.User;
import org.springframework.stereotype.Component;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author jackson
 * @date 2020/4/8
 */
@Component
public interface UserFacade extends Remote {
    /**
     * 通过用户名获取用户信息
     * @param name 用户名字
     * @return 用户信息
     * @throws RemoteException 远程调用异常
     */
    User getUserByName(String name) throws RemoteException;

    /**
     * 通过性别获取用户信息
     * @param sex 性别
     * @return 用户信息
     * @throws RemoteException 远程调用异常
     */
    List<User> getUsersBySex(String sex) throws RemoteException;

}
