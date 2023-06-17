package cn.lzy;

import cn.lzy.configbean.Person;
import cn.lzy.configbean.Student;
import cn.lzy.configbean.User;
import cn.lzy.controller.ChapterController;
import cn.lzy.customconfig.CustomProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterTestApplication {
    @Autowired
    ChapterController chapterController;

    @Autowired
    Student student;

    @Autowired
    Person person;

    @Autowired
    User user;

    @Autowired
    CustomProperties customProperties;

    @Test
    public void contextLoads(){
        System.out.println("单元测试返回="+chapterController.sayHello());
        System.out.println("单元测试返回的student数据="+student);
        System.out.println("单元测试返回的user数据=" + user);
        System.out.println("单元测试返回的person数据=" + person);
        System.out.println("单元测试返回的customProperties数据=" + customProperties);
    }
}
