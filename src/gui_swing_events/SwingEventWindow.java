package gui_swing_events;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;



public class SwingEventWindow extends JFrame implements ActionListener {
    JFrame f = new JFrame();

    JTextField text = new JTextField();
    JButton b = new JButton("submit");
    JTextArea area = new JTextArea();

    ButtonGroup bg = new ButtonGroup();
    JRadioButton r1 = new JRadioButton("Autosum", true);
    JRadioButton r2 = new JRadioButton("Average");
    JRadioButton r3 = new JRadioButton("Max");
    JRadioButton r4 = new JRadioButton("Min");
    private String choice;


    public SwingEventWindow() {
        f.setSize(800, 500);
        text.setBounds(60, 100, 340, 30);
        b.setBounds(60, 150, 100, 40);
        r1.setBounds(60, 200, 100, 30);
        r2.setBounds(60, 250, 100, 30);
        r3.setBounds(60, 300, 100, 30);
        r4.setBounds(60, 350, 100, 30);
        area.setBounds(60, 400, 340, 30);

        r1.setActionCommand("Autosum");
        r2.setActionCommand("Average");
        r3.setActionCommand("Max");
        r4.setActionCommand("Min");

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        f.add(b);
        f.add(text);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.add(area);

        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);

        Excel excel ;
        String choice = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            System.out.println("submit");
            String[] firstArray = text.getText().trim().split("\\s* \\s*");
            int[] numbers = Arrays.stream(firstArray).mapToInt(Integer::parseInt).toArray();
            System.out.println(Arrays.toString(numbers));
            Excel excel = new Excel(numbers);
            this.choice = bg.getSelection().getActionCommand();
            area.setText(String.valueOf(SelectFun()));
        }
    }
    public int SelectFun(){
        System.out.println(this.choice);
        int result = 0;
        switch(this.choice) {
            case "Autosum" -> result=Excel.Autosum();
            case "Average" -> result=Excel.Average();
            case "Max" -> result=Excel.Max();
            case "Min" -> result=Excel.Min();
        }
        return result;
    }
}
