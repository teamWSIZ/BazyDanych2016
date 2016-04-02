package Offline;

import Domain.DishRe;
import Domain.Person;
import Domain.PersonRe;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@Component
public class MainGui implements InitializingBean {
    private JButton button1;
    private JTextArea textArea1;
    private JComboBox personCombo;
    private JComboBox dishCombo;
    private JPanel mp;
    private JPanel mainPanel;

    @Autowired
    PersonRe personRe;
    @Autowired
    DishRe dishRe;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public MainGui() {


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append(personCombo.getSelectedItem().toString());
            }
        });
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        for(Person p : personRe.findAllByOrderByNameAsc()) personCombo.addItem(p);
//        for(Dish d : dishRe.findAllByOrderByNazwaAsc()) dishCombo.addItem(d);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainGui");
        frame.setContentPane(new MainGui().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
