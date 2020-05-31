import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Dialog extends JFrame{
    public static void Info() {
        JFrame frame = new JFrame("О программе");
        frame.setBounds(200, 200, 200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static JPanel Panel1() {
        JPanel Panel1 = new JPanel();
        Panel1.setVisible(true);
        JTextArea area1 = new JTextArea();
        JTextArea area2 = new JTextArea();
        JTextArea area3 = new JTextArea();
        JTextArea area4 = new JTextArea();
        JTextArea area5 = new JTextArea();
        JButton button4 = new JButton("Подтвердить");
        Panel1.setLayout(null);
        Panel1.add(area1);
        Panel1.add(area2);
        Panel1.add(area3);
        Panel1.add(area4);
        Panel1.add(area5);
        Panel1.add(button4);
        area1.setText("Введите имя");
        area2.setText("Введите фамилию");
        area3.setText("Введите Email");
        area4.setText("Введите Пароль");
        area5.setText("Введите номер телефона");
        area1.setBounds(40,25,150,20);
        area2.setBounds(40,75,150,20);
        area3.setBounds(40,125,150,20);
        area4.setBounds(40,175,150,20);
        area5.setBounds(40,225,150,20);
        button4.setBounds(150, 275, 120, 20);


        return Panel1;
    }

    public static JPanel Panel3() {
        JPanel Panel1 = new JPanel();
        Panel1.setVisible(true);
        JLabel label = new JLabel("Введите ваши предпочтения и получите код путевки, который вам подходит");
        JTextArea area1 = new JTextArea();
        JTextArea area2 = new JTextArea();
        JTextArea area3 = new JTextArea();
        JTextArea area4 = new JTextArea();
        JTextArea area5 = new JTextArea();
        JButton button4 = new JButton("Получить код");
        Panel1.setLayout(null);
        Panel1.add(area1);
        Panel1.add(area2);
        Panel1.add(area3);
        Panel1.add(area4);
        Panel1.add(area5);
        Panel1.add(button4);
        Panel1.add(label);
        label.setBounds(5,5,500,15);
        area1.setText("Желаемый регион");
        area2.setText("Желаемый климат");
        area3.setText("Класс отеля");
        area4.setText("Желаемая стоимость");
        area5.setText("Желаемое время");
        area1.setBounds(40,25,150,20);
        area2.setBounds(40,75,150,20);
        area3.setBounds(40,125,150,20);
        area4.setBounds(40,175,150,20);
        area5.setBounds(40,225,150,20);
        button4.setBounds(150, 275, 120, 20);


        return Panel1;
    }

    public static JPanel Panel2() {
        JLabel label1 = new JLabel("Введите ваш код путевки и индекс, для того, чтобы мы выслали вам путевку.");
        JLabel label2 = new JLabel("Код путевки может отсутствовать.");
        JPanel Panel1 = new JPanel();
        Panel1.setVisible(true);
        JTextArea area1 = new JTextArea();
        JTextArea area2 = new JTextArea();
        JTextArea area3 = new JTextArea();
        JButton button = new JButton("Оформить заказ");
        Panel1.setLayout(null);
        Panel1.add(area1);
        Panel1.add(area2);
        Panel1.add(area3);
        Panel1.add(button);
        Panel1.add(label1);
        Panel1.add(label2);
        label1.setBounds(5,5,500,30);
        label2.setBounds(5,20,500,30);
        area1.setText("Введите код путёвки");
        area2.setText("Введите индекс");
        area3.setText("Введите код скидки");
        area1.setBounds(40,50,150,20);
        area2.setBounds(40,100,150,20);
        area3.setBounds(40,150,150,20);
        button.setBounds(150,200,150,20);
        return Panel1;
    }



    public static void TestFrame() {
        JFrame frame = new JFrame("Туристическое агенство");

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(100, 200, 600, 500);
        frame.setLocationRelativeTo(null);


        JMenuBar menuBar = new JMenuBar();
        JMenu Menu = new JMenu("Меню");
        JMenuItem Vihod = new JMenuItem("Выход");
        JMenuItem Info = new JMenuItem("О программе");


        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(100,100,100,100);

        frame.add(menuBar);
        menuBar.add(Menu);
        Menu.add(menuBar);
        Menu.add(Info);
        Menu.add(Vihod);
        frame.setJMenuBar(menuBar);
        frame.add(tabbedPane);


        Vihod.addActionListener(e -> System.exit(0));
        Info.addActionListener(e -> Info());


        tabbedPane.addTab("Регистрация", Panel1());
        tabbedPane.addTab("Предложения", Panel3());
        tabbedPane.addTab("Покупка", Panel2());

    }
    public static void main (String [] args) {
        TestFrame();
    JFrame.isDefaultLookAndFeelDecorated();
        }
    }
