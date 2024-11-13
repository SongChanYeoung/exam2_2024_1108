import javax.swing.*;
import java.awt.*;

public class TestSw extends JFrame{
    public TestSw() {
        //Frame
        setTitle("스윙 프로젝트 연습"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 클로즈 버튼
        setSize(500,300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        // Layout
//        cp.setLayout(null);
        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬

        //JLabel
        JLabel jLabel = new JLabel("Label Test");
        jLabel.setBounds(100, 100, 100, 10);
        cp.add(jLabel);

        //JButton
        JButton jButton = new JButton("Button Test");
        jButton.setBounds(130, 130, 100 ,20);
        cp.add(jButton);

        //JTextField
        JTextField jTextField = new JTextField();
        jTextField.setBounds(200, 200, 200, 30);
        cp.add(jTextField);
        jTextField.setColumns(10); // 텍스트 필드 기본 입력문자 개수

        //JCheckBox
        JCheckBox lion = new JCheckBox("사자");
        JCheckBox rabbit = new JCheckBox("토끼", true);
        JCheckBox tiger = new JCheckBox("호랑이");

        cp.add(lion);
        cp.add(rabbit);
        cp.add(tiger);


        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        TestSw se = new TestSw();
    }
}
