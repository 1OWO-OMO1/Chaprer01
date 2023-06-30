package cn.lzy;

import cn.lzy.configbean.Person;
import cn.lzy.configbean.Student;
import cn.lzy.configbean.User;
import cn.lzy.controller.ChapterController;
import cn.lzy.customconfig.CustomProperties;
import cn.lzy.customconfig.DBConnector;
import cn.lzy.customconfig.MyProperties;
import cn.lzy.mybatiscatalog.Comment;
import cn.lzy.mybatiscatalog.CommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
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

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    DBConnector dbConnector;

    @Autowired
    private CommentMapper commentMapper;



    @Test
    public void contextLoads(){
        Comment comment = commentMapper.findById(1);
        System.out.println(""+comment);
        //System.out.println("单元测试返回="+chapterController.sayHello());
        //System.out.println("单元测试返回的student数据="+student);
        //System.out.println("单元测试返回的user数据=" + user);
        //System.out.println("单元测试返回的person数据=" + person);
        //System.out.println("单元测试返回的customProperties数据=" + customProperties);
        //MyProperties myProperties = (MyProperties) applicationContext.getBean("myProperties");
        //if (myProperties==null){
        //    System.out.println("myProperties类注入不成功");
        //}else {
          //  myProperties.getResult();
        //}
        //System.out.println(dbConnector.config());
    }
}
