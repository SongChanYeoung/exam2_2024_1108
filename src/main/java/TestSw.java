import javax.swing.*;
import java.awt.*;

public class TestSw extends JFrame{
    public TestSw() {
        setTitle("스윙 프로젝트 연습"); // 프레임 제목 설정


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 클로즈 버튼
        setSize(500,300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기
        // Layout
        cp.setLayout(null);
 //       cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬
        //JLabel
        JLabel jLabel = new JLabel("Label Test");
        jLabel.setBounds(100, 100, 100, 10);
        cp.add(jLabel);

        //JButton
        JButton jButton = new JButton("Button Test");
        jButton.setBounds(200, 200, 100 ,20);
        cp.add(jButton);

        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        TestSw se = new TestSw();
    }
}
