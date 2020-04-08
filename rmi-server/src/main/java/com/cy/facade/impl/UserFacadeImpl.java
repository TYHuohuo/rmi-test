package com.cy.facade.impl;

import com.cy.entity.User;
import com.cy.facade.UserFacade;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author jackson
 * @date 2020/4/8
 */
@Service
public class UserFacadeImpl implements UserFacade {
    private List<User> userList;
    {
        userList = new ArrayList<>(4);
        userList.add(new User("马云", "男", "对钱没兴趣"));
        userList.add(new User("马化腾", "男", "普通家庭"));
        userList.add(new User("刘强东", "男", "脸盲"));
    }
    @Override
    public User getUserByName(String name) {
        Supplier<NullPointerException> exception = () -> new NullPointerException("找不到" + name + ",这个用户的信息!");
        return userList.stream().filter(t -> t.getName().equals(name)).findFirst().orElseThrow(exception);
    }

    @Override
    public List<User> getUsersBySex(String sex) {
        return userList.stream().filter(t -> t.getSex().equals(sex)).collect(Collectors.toList());
    }
}
