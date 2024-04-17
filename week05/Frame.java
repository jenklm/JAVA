package week05;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	public Frame() {
		setSize(500, 250); // JFrame ũ��
		setTitle("�׽�Ʈ ������");// JFrame ����
		setVisible(true);
		// BorderLayout���� ����
		setLayout(new BorderLayout()); // JFrame ��ġ�����ڸ� FlowLayout���� ����
		setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		JLabel label = new JLabel("�ڹ�ȣ�ڿ� ���� ���� ȯ���մϴ�. �����ϼ��� �Է��ϼ���."); // JFrame ���̺� ����
		panel1.add(label); // ���̺��� panel1�� �߰��Ѵ�.

		panel2.add(new JButton("1��")); // button1�� panel2�� �߰�
		panel2.add(new JButton("2��")); // button2�� panel2�� �߰�
		panel2.add(new JButton("3��")); // button3�� panel2�� �߰�
		panel2.add(new JButton("4��")); // button4�� panel2�� �߰�
		panel2.add(new JButton("5��")); // button5�� panel2�� �߰�

		// JLabel�� ����ִ� JPanel�� ����
		panel3.add("North", panel1);
		// ��ư���� �����Ȱ� �߾�����
		panel3.add("Center", panel2);
		add(panel3);
	}

	public static void main(String[] args) {
		Frame f = new Frame(); // JFrame�� ����
	}
}