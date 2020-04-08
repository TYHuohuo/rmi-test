package com.cy;

import com.cy.entity.User;
import com.cy.facade.UserFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.rmi.RemoteException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jackson
 * @date 2020/4/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RmiClientApplication.class)
public class RmiClientTest {
    @Autowired
    private UserFacade userFacade;

    @Test
    public void userByNameTest() {
        try {
            User user = userFacade.getUserByName("马云");
            System.out.println(user);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void userBySexTest() {
        try {
            List<User> userList = userFacade.getUsersBySex("男");
            userList.forEach(System.out::println);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}