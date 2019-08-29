package observer.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        jFrame = new JFrame();
        JButton button = new JButton("정말 해도 될까?");
        button.addActionListener(event -> System.out.println("ㄴㄴ 하지마셈 너 분명 후회함"));
        button.addActionListener(event -> System.out.println("ㄱㄱㄱㄱ"));
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }
}
