package st;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_txt = new JLabel();
    JLabel label_Background = new JLabel();
    JLabel label_img = new JLabel();
    JTextArea textArea_A = new JTextArea();
    int x=300;
    int y=300;


    public App(){
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    y+=30;
                    label_img.setBounds(x,y,128,128);
                }
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    y-=30;
                    label_img.setBounds(x,y,128,128);
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    x-=30;
                    label_img.setBounds(x,y,128,128);
                }
               if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                   x+=30;
                   label_img.setBounds(x,y,128,128);
               }
            }
        });
    }

    void go(){


        textArea_A.setBounds(100,100,300,150);
        myPanel.add(textArea_A);

        java.net.URL imgURL2 = App.class.getResource("plane0.png");
        label_img.setIcon(new ImageIcon(imgURL2));
        label_img.setBounds(x,y,128,128);
        myPanel.add(label_img);


        java.net.URL imgURL1 = App.class.getResource("background.png");
        label_Background.setIcon(new ImageIcon(imgURL1));
        label_Background.setBounds(0,0,500,720);
        myPanel.add(label_Background);




        myPanel.setLayout(null);
        myPanel.add(label_txt);
        JFrame frame = new JFrame("飞机");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,720);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
