package week09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame 
{ 
    private JLabel label; 
    private JButton button1, button2; 
    private JPanel panel1 = new JPanel();  //바탕 패널 
    private JPanel panel2 = new JPanel();//버튼 들어간 부분 
    static int x = 235, y = 20;  //박스 위치 
    public MyFrame() 
    { 
          this.setSize(500, 270); //바탕 패널 크기  
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          this.setTitle("박스 움직이기"); //제목  
           
           
          label = new JLabel(""); 
          label.setSize(20, 170); 
          label.setLocation(x, y); 
          label.setOpaque(true); //배경 보이게 
          label.setBackground(Color.RED); 
           
          panel1.setLayout(null); //레이어 바꾸기 
          panel1.setSize(500, 400); //화면 크기...
          panel1.setLocation(0, 0); 
          panel1.setBackground(Color.YELLOW); //바탕은 노란색으로.. 
          panel1.add(label); 
           
          button1 = new JButton("왼쪽으로 이동"); //왼쪽 이동 버튼 생
          button1.addActionListener(e -> 
          { 
                x -= 20; 
                label.setLocation(x, y); //좌표 갱신 
         }); 
         button2 = new JButton("오른쪽으로 이동"); //오른쪽 이동 버튼 생성 
         button2.addActionListener(e -> 
         { 
               x += 20; 
               label.setLocation(x, y); //좌표 갱신 
        }); 
        
         
        panel2.add(button1); 
        panel2.add(button2); 
         
        this.add(BorderLayout.CENTER, panel1); //바탕 부분 
        this.add(BorderLayout.SOUTH, panel2); //버튼 부분  
         
        setResizable(false); 
        this.setVisible(true); 
  } 
    
    public static void main(String[] args) 
    { 
          MyFrame f = new MyFrame(); 
    } 
} 