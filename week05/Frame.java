package week05;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	public Frame() {
		setSize(500, 250); // JFrame 크기
		setTitle("테스트 프레임");// JFrame 제묙
		setVisible(true);
		// BorderLayout으로 변경
		setLayout(new BorderLayout()); // JFrame 배치관리자를 FlowLayout으로 설정
		setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		JLabel label = new JLabel("자바호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요."); // JFrame 레이블 생성
		panel1.add(label); // 레이블을 panel1에 추가한다.

		panel2.add(new JButton("1명")); // button1을 panel2에 추가
		panel2.add(new JButton("2명")); // button2을 panel2에 추가
		panel2.add(new JButton("3명")); // button3을 panel2에 추가
		panel2.add(new JButton("4명")); // button4을 panel2에 추가
		panel2.add(new JButton("5명")); // button5을 panel2에 추가

		// JLabel이 들어있는 JPanel은 북쪽
		panel3.add("North", panel1);
		// 버튼들이 나열된건 중앙으로
		panel3.add("Center", panel2);
		add(panel3);
	}

	public static void main(String[] args) {
		Frame f = new Frame(); // JFrame을 생성
	}
}