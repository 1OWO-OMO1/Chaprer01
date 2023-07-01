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
 /*       Comment comment = commentMapper.findById(1);
        System.out.println(""+comment);*/

        Comment comment4 = commentMapper.czauther("张三");
        System.out.println(""+comment4);

        Comment comment2=new Comment();
        comment2.setAuthor("卡片");
        comment2.setContent("小航");
        commentMapper.gxauthor(comment2);
        System.out.println("更新成功--"+comment2);//更新

     /*   Comment comment5 = new Comment();
        comment5.setAuthor("卡片");
        comment5.setContent("小明");
        commentMapper.gxauthor(comment5);
        System.out.println("通过author 字段去更新成功--"+comment5);*/

        //Comment comment1=new Comment();
        //comment1.setContent("小明");
        //comment1.setAuthor("卡片");
        //comment1.setA_id(1);
        //commentMapper.insertComment(comment1);
        //System.out.println("插入成功--"+comment1);//插入

   /*     Comment comment2=new Comment();
        comment2.setId(7);
        comment2.setContent("小刚");
        commentMapper.updateComment(comment2);
        System.out.println("更新成功--"+comment2);//更新

        Comment comment3=new Comment();
        commentMapper.deleteComment(8);
        System.out.println("删除成功");*/


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
