package week09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame 
{ 
    private JLabel label; 
    private JButton button1, button2; 
    private JPanel panel1 = new JPanel();  //���� �г� 
    private JPanel panel2 = new JPanel();//��ư �� �κ� 
    static int x = 235, y = 20;  //�ڽ� ��ġ 
    public MyFrame() 
    { 
          this.setSize(500, 270); //���� �г� ũ��  
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          this.setTitle("�ڽ� �����̱�"); //����  
           
           
          label = new JLabel(""); 
          label.setSize(20, 170); 
          label.setLocation(x, y); 
          label.setOpaque(true); //��� ���̰� 
          label.setBackground(Color.RED); 
           
          panel1.setLayout(null); //���̾� �ٲٱ� 
          panel1.setSize(500, 400); //ȭ�� ũ��...
          panel1.setLocation(0, 0); 
          panel1.setBackground(Color.YELLOW); //������ ���������.. 
          panel1.add(label); 
           
          button1 = new JButton("�������� �̵�"); //���� �̵� ��ư ��
          button1.addActionListener(e -> 
          { 
                x -= 20; 
                label.setLocation(x, y); //��ǥ ���� 
         }); 
         button2 = new JButton("���������� �̵�"); //������ �̵� ��ư ���� 
         button2.addActionListener(e -> 
         { 
               x += 20; 
               label.setLocation(x, y); //��ǥ ���� 
        }); 
        
         
        panel2.add(button1); 
        panel2.add(button2); 
         
        this.add(BorderLayout.CENTER, panel1); //���� �κ� 
        this.add(BorderLayout.SOUTH, panel2); //��ư �κ�  
         
        setResizable(false); 
        this.setVisible(true); 
  } 
    
    public static void main(String[] args) 
    { 
          MyFrame f = new MyFrame(); 
    } 
} 