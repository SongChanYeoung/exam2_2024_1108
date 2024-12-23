import javax.swing.*;
import java.awt.*;

public class TestSw4 extends JFrame{
    public TestSw4() {
        //Frame
        setTitle("스윙 프로젝트 연습 4"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 클로즈 버튼
        setSize(500,300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        // Layout
//        cp.setLayout(null);
        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬

        // 버튼을 눌러 JDialog 표시
        JButton showDialogButton = new JButton("Show Dialog");
        showDialogButton.addActionListener(e -> showDialog(this)); // 버튼 클릭 시 다이알로그 표시

        cp.add(showDialogButton);

        setVisible(true); // 화면에 프레임 출력

    }

    private void showDialog(JFrame frame) {
        //JDialog
        JDialog dialog = new JDialog(frame, "Dialog", true);
        dialog.setSize(200, 100);
        dialog.setLocationRelativeTo(frame);

        //dialog 내용 추가
        JLabel messageLabel = new JLabel("Hello", JLabel.CENTER); //중앙에 메세지 추가
        dialog.add(messageLabel);
    }

    public static void main(String[] args) {
        TestSw4 se = new TestSw4();
    }
}
