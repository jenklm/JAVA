import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300, 200);
		setLocation(screenSize.width / 2, screenSize.height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img = kit.getImage("file:///Users/klmheewon/Downloads/sources/chap08/myframe(p.373)/2815428.png");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("��ư");
		this.add(button);
		setVisible(true);
	}
}