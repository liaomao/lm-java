package st;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_txt = new JLabel();
    JTextArea textArea_A = new JTextArea();
    JTextArea textArea_B = new JTextArea();


    public App(){
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
               if(e.getKeyCode() == KeyEvent.VK_ENTER){
                   if(textArea_A.getText().equals("小猫")){
                       textArea_B.append("输入正确");
                   }
                   else{
                       textArea_B.append("输入错误\n");
                   }
               }
            }
        });
    }

    void go(){
        textArea_A.setBounds(100,100,300,150);
        textArea_A.setBackground(Color.cyan);
        textArea_B.setBackground(Color.yellow);
        textArea_B.setBounds(100,300,300,150);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("键盘点击事件");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,720);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
