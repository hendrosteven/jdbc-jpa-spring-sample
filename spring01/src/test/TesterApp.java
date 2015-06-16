/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import user.Soldier;

/**
 *
 * @author user
 */
public class TesterApp {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("appconfig.xml");
        Soldier rambo = (Soldier) ctx.getBean("rambo");
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.firing();
    }
}
