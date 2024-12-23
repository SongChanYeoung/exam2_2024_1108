import javax.swing.*;
import java.awt.*;
import java.io.File;

public class TestSw6 extends JFrame{
    public TestSw6() {
        //Frame
        setTitle("스윙 프로젝트 연습 6"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 클로즈 버튼
        setSize(500,300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        // Layout
//        cp.setLayout(null);
        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬

        // JTable
        String[][] data = {
                {"1", "김철수", "25"},
                {"2", "김영희", "30"},
                {"3", "김영수", "27"},
                {"4", "김민수", "15"}
        };
        String[] columnNames = {"ID", "Name", "Age"};

        JTable table = new JTable(data, columnNames); // 데이터와 열 이름을 사용해 테이블 생성
        JScrollPane scrollPane = new JScrollPane(table); // 테이블을 스크롤 가능하게 JScrollPane에 추가
        cp.add(scrollPane, BorderLayout.CENTER); //

        // Menu, JMenuBar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File"); //파일 메뉴 생성
        fileMenu.setToolTipText("File operations"); // 툴팁 설정

        JMenuItem openItem = new JMenuItem("Open"); // Open 메뉴 항복 생성
        openItem.setToolTipText("Open a file"); // Open 툴팁 설정
        JMenuItem exitItem = new JMenuItem("Exit"); // Open 메뉴 항목 생성
        exitItem.setToolTipText("Exit System"); // Open 툴팁 설정

        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        TestSw6 se = new TestSw6();
    }
}
