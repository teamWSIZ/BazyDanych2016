package Offline;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * Created by Administrator on 2016-03-17.
 */
public class GuiStarter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MainGui");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("offline-config.xml");
        MainGui mg = ctx.getBean(MainGui.class);
        frame.setContentPane(mg.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        ctx.close();
    }
}
