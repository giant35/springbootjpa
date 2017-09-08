/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootjpa;

import java.util.List;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author sihai
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class)
public class AdminRepositoryTest {

//    @Autowired
//    AdminRepository repo;
    @Autowired
    Random random;

    public AdminRepositoryTest() {
    }

//    @Before
//    public void initData() {
//        Admin admin = new Admin();
//        admin.setUsername("admin" + random.nextInt());
//        repo.save(admin);
//    }

    @org.junit.Test
    public void testFind() {
//        List<Admin> list = repo.findAll();
//        list.forEach(a -> System.out.println(a.getUsername()));
        System.out.println("fdsafds");
    }

}
