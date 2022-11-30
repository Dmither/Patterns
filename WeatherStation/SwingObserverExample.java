package WeatherStation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    // don't work!!
    JFrame frame;

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        // set props
    }
    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }
    class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
}
