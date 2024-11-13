import javax.swing.*;
import java.awt.*;
import java.io.File;

public class TestSw5 extends JFrame{
    public TestSw5() {
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

        // 버튼을 눌러 JFileChooser 표시
        JButton showFileChooserButton = new JButton("Open File Chooser");
        showFileChooserButton.addActionListener(e -> showFileChooser(this)); // 버튼 클릭 시 파일 선택기 표시

        cp.add(showFileChooserButton);

        setVisible(true); // 화면에 프레임 출력

    }

    private void showFileChooser(JFrame frame) {
        //JDialog
        JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(this); // 파일 열기 대화상자 표시

        if ( result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Selected file :" + selectedFile.getAbsolutePath());
        }

    }

    public static void main(String[] args) {
        TestSw5 se = new TestSw5();
    }
}
