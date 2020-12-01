import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_img = new JLabel();
    JLabel label_back = new JLabel();
    int CELL=64;
    int row,column;

    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    row--;
                    label_img.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_DOWN){
                    row++;
                    label_img.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_LEFT){
                    column--;
                    label_img.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_RIGHT){
                    column++;
                    label_img.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
            }
        });
    }

    void go(){
        java.net.URL imgURL = App.class.getResource("img/plane1.gif");
        label_img.setIcon(new ImageIcon(imgURL));
        label_img.setBounds(0,0,CELL,CELL);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("飞机移动");
        myPanel.add(label_img);
        myPanel.add(label_back);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1000,1000);
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
