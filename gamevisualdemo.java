import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
public class gamevisualdemo extends JFrame {
private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField txtNextWordle;
private JTextField textField_6;
private JTextField txtShare;
//Launching the application.
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
gamevisualdemo frame = new gamevisualdemo();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
//frame
public gamevisualdemo() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 662, 788);
contentPane = new JPanel();
contentPane.setForeground(Color.BLACK);
contentPane.setBackground(new Color(255, 255, 255));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JLabel lblNewLabel = new JLabel("STATISTICS");
lblNewLabel.setBounds(194, 45, 187, 37);
lblNewLabel.setForeground(Color.BLACK);
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("6");
lblNewLabel_1.setBounds(120, 124, 72, 47);
lblNewLabel_1.setLabelFor(this);
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
contentPane.add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("100");
lblNewLabel_2.setBounds(194, 108, 112, 78);
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
contentPane.add(lblNewLabel_2);
JLabel lblNewLabel_3 = new JLabel("1");
lblNewLabel_3.setBounds(309, 125, 41, 45);
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 48));
contentPane.add(lblNewLabel_3);
JLabel lblNewLabel_4 = new JLabel("2");
lblNewLabel_4.setBounds(389, 125, 63, 45);
lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 48));
contentPane.add(lblNewLabel_4);
JLabel lblNewLabel_5 = new JLabel("Played");
lblNewLabel_5.setBounds(99, 181, 130, 37);
lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
contentPane.add(lblNewLabel_5);
JLabel lblNewLabel_6 = new JLabel("win %");
lblNewLabel_6.setBounds(204, 181, 100, 34);
lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
contentPane.add(lblNewLabel_6);
JLabel lblNewLabel_7 = new JLabel("current");
lblNewLabel_7.setBounds(294, 180, 174, 37);
lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
contentPane.add(lblNewLabel_7);
JLabel lblNewLabel_8 = new JLabel("streak");
lblNewLabel_8.setBounds(294, 214, 63, 13);
lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
contentPane.add(lblNewLabel_8);
JLabel lblNewLabel_9 = new JLabel("max");
lblNewLabel_9.setBounds(389, 191, 45, 13);
lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
contentPane.add(lblNewLabel_9);
JLabel lblNewLabel_10 = new JLabel("streak");
lblNewLabel_10.setBounds(389, 214, 79, 13);
lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
contentPane.add(lblNewLabel_10);
JLabel lblNewLabel_11 = new JLabel("1");
lblNewLabel_11.setBounds(52, 386, 18, 33);
lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
contentPane.add(lblNewLabel_11);
JLabel lblNewLabel_12 = new JLabel("2");
lblNewLabel_12.setBounds(52, 425, 18, 31);
lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
contentPane.add(lblNewLabel_12);
JLabel lblNewLabel_13 = new JLabel("3");
lblNewLabel_13.setBounds(51, 466, 19, 30);
lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 25));
contentPane.add(lblNewLabel_13);
JLabel lblNewLabel_14 = new JLabel("4");
lblNewLabel_14.setBounds(52, 506, 18, 36);
lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 25));
contentPane.add(lblNewLabel_14);
JLabel lblNewLabel_15 = new JLabel("GUESS DISTRIBUTION");
lblNewLabel_15.setBounds(144, 288, 399, 53);
lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 25));
contentPane.add(lblNewLabel_15);
JLabel lblNewLabel_16 = new JLabel("5");
lblNewLabel_16.setBounds(52, 552, 14, 31);
lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
contentPane.add(lblNewLabel_16);
textField = new JTextField();
textField.setBounds(71, 393, 27, 19);
textField.setBackground(Color.GRAY);
textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
textField.setText("0");
contentPane.add(textField);
textField.setColumns(10);
textField_1 = new JTextField();
textField_1.setBounds(72, 437, 129, 19);
textField_1.setBackground(Color.GRAY);
textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
textField_1.setText(" 1");
contentPane.add(textField_1);
textField_1.setColumns(10);
textField_2 = new JTextField();
textField_2.setBounds(71, 477, 130, 19);
textField_2.setBackground(Color.GRAY);
textField_2.setText(" 1");
textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
contentPane.add(textField_2);
textField_2.setColumns(10);
textField_3 = new JTextField();
textField_3.setBounds(71, 515, 363, 19);
textField_3.setBackground(Color.GRAY);
textField_3.setText(" 3");
textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
contentPane.add(textField_3);
textField_3.setColumns(10);
textField_4 = new JTextField();
textField_4.setBounds(67, 558, 125, 19);
textField_4.setBackground(new Color(0, 128, 0));
textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
textField_4.setText(" 1");
contentPane.add(textField_4);
textField_4.setColumns(10);
JLabel lblNewLabel_17 = new JLabel("6");
lblNewLabel_17.setBounds(52, 593, 45, 19);
lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 25));
contentPane.add(lblNewLabel_17);
textField_5 = new JTextField();
textField_5.setBounds(71, 593, 27, 19);
textField_5.setText("0");
textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
textField_5.setBackground(Color.GRAY);
contentPane.add(textField_5);
textField_5.setColumns(10);
JPanel panel = new JPanel();
panel.setBackground(Color.WHITE);
panel.setBounds(25, 634, 244, 87);
contentPane.add(panel);
txtNextWordle = new JTextField();
txtNextWordle.setText("NEXT WORDLE");
txtNextWordle.setFont(new Font("Tahoma", Font.BOLD, 16));
panel.add(txtNextWordle);
txtNextWordle.setColumns(10);
textField_6 = new JTextField();
textField_6.setBackground(new Color(255, 255, 255));
textField_6.setText(" 01:50:21");
textField_6.setFont(new Font("Tahoma", Font.BOLD, 23));
panel.add(textField_6);
textField_6.setColumns(10);
txtShare = new JTextField();
txtShare.setBackground(new Color(0, 128, 0));
txtShare.setForeground(Color.BLACK);
txtShare.setFont(new Font("Tahoma", Font.PLAIN, 30));
txtShare.setText("SHARE");
txtShare.setBounds(309, 653, 204, 47);
contentPane.add(txtShare);
txtShare.setColumns(10);
}
}