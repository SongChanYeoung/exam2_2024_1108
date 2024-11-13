import javax.swing.*;
import java.awt.*;

public class TestSw7 extends JFrame{
    public TestSw7() {
        //Frame
        setTitle("스윙 프로젝트 연습 7"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 클로즈 버튼
        setSize(500,300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        // Layout
//        cp.setLayout(null);
        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬

        // JToolBar
        JToolBar toolbar = new JToolBar();
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        toolbar.add(newButton);
        toolbar.add(openButton);
        toolbar.add(saveButton);

        cp.add(toolbar, BorderLayout.NORTH); // 툴바를 프레임 상단에 추가

        JLabel label = new JLabel("여기는 메인 입니다.", JLabel.CENTER);
        cp.add(label, BorderLayout.CENTER); // 라벨을 프레임 중앙에 추가



        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        TestSw7 se = new TestSw7();
    }
}
