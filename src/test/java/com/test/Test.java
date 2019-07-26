package com.test;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-25 11:19
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext-dubbo.xml");
        ac.start();
        System.out.println("启动成功");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Main.main(args);
    }
}
