import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_img = new JLabel();
    JLabel label_img_2 = new JLabel();
    JLabel label_back = new JLabel();
    JLabel label_score = new JLabel();
    int CELL=68;
    int row,column;
    int score;

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
                if (label_img.getY()==CELL*2 && label_img.getX()==CELL*2){
                    score++;
                    label_score.setText("得分："+String.valueOf(score));
                }
            }
        });
    }

    void go(){
        java.net.URL imgURL = App.class.getResource("img/ball.gif");
        label_img.setIcon(new ImageIcon(imgURL));
        label_img.setBounds(CELL,CELL,CELL,CELL);

        java.net.URL imgURL3 = App.class.getResource("img/background.png");
        label_img_2.setIcon(new ImageIcon(imgURL3));
        label_img_2.setBounds(CELL*2,CELL*2,CELL,CELL);

        java.net.URL imgURL2 = App.class.getResource("img/768.png");
        label_back.setIcon(new ImageIcon(imgURL2));
        label_back.setBounds(0,0,1024,768);

        label_score.setText("得分：0");//设置分数值
        label_score.setBounds(0,0,200,50);//设置分数的坐标值
        myPanel.setLayout(null);
        JFrame frame = new JFrame("篮球移动");
        myPanel.add(label_score);
        myPanel.add(label_img);
        myPanel.add(label_img_2);
        myPanel.add(label_back);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1024,768);
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
