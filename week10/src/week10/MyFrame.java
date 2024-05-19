package week10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener, KeyListener, MouseMotionListener

{

   private JLabel label;
   
   private JButton button1, button2;
   
   //private JPanel panel = new JPanel();
   
   private JPanel panel1 = new JPanel();
   
   private JPanel panel2 = new JPanel();
   
   static int x = 235, y = 20;
   
   public MyFrame()
   
   {
   
      this.setSize(500, 270);
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      this.setTitle("�ڽ� �����̱�");
      
      label = new JLabel("");
      
      label.setSize(20, 170);
      
      label.setLocation(x, y);
      
      label.setOpaque(true);
      
      label.setBackground(Color.red);
      
      
      
      panel1.setLayout(null);
      
      panel1.setSize(500, 400);
      
      panel1.setLocation(0, 0);
      
      panel1.setBackground(Color.YELLOW);
      
      panel1.add(label);
      
      panel1.addMouseMotionListener(this);
      
      button1 = new JButton("�������� �̵�");
      button2 = new JButton("���������� �̵�");
      
      button1.addActionListener(this);
      button2.addActionListener(this);
      
      this.addKeyListener(this);
      
      panel2.add(button1);
      
      panel2.add(button2);
      
      this.add(BorderLayout.CENTER, panel1);
      
      this.add(BorderLayout.SOUTH, panel2);
      
      Dimension frameSize = this.getSize();
      
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      
      this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
      
      setResizable(false);
      
      this.setVisible(true);
      
      this.requestFocus();
      setFocusable(true);
      
      //��ư�� ��� ��Ŀ���� �������� ���콺�� ��ư Ŭ�� �� Ű���� Ŭ�� ��, �۵��� �ȵ��� but ��ư�� ��Ŀ���� ���ִ� �������� �ذ���!
      button1.setFocusable(false);
      button2.setFocusable(false);
   
   }
   
   public void actionPerformed(ActionEvent e) 
   {
      String command = e.getActionCommand();
      if (command.equals("�������� �̵�")) {
         x -= 20;
         label.setLocation(x, y);
      }
      else {
	      x += 20;
	      label.setLocation(x, y);
      }	
   
   }
   
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		switch (keycode) {
		case KeyEvent.VK_LEFT:	x -= 20;	break;
		case KeyEvent.VK_RIGHT:	x += 20;	break;
		}  
		label.setLocation(x,y);
		
		
	}
	
	
	public void keyReleased(KeyEvent arg0) { }
	public void keyTyped(KeyEvent arg0) { } 


   public void mouseDragged(MouseEvent e) {
	   x = e.getX();
	   label.setLocation(x, y);
   }	
   public void mouseMoved(MouseEvent e) {
   }	
   
   public static void main(String[] args){
	   MyFrame t = new MyFrame();
   }
}
   
