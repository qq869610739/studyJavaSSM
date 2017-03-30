package com.cn.hnust.test;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.pojo.AppRelease;
import com.cn.hnust.service.IappReleaseService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kangkang on 2017/3/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
//@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
@ContextConfiguration(locations = { "classpath*:/spring-mybatis.xml" })
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
      private ApplicationContext ac = null;
    @Resource
    private IappReleaseService userService;

  @Before
  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IappReleaseService) ac.getBean("userService");
  }

    @Test
    public void test1() {
        List<AppRelease> user = userService.getUserById("87dd002335d84cfda490d44c2b9fa772");
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
