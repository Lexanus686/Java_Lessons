package DZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dop_DZ_1 {
    public static void main(String[] args) {
        new NewWindow();
    }
}

class NewWindow extends  JFrame {
    private JPanel Panel = new JPanel();
    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane(jta);
    public NewWindow()
    {
        setTitle("MainTable");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);

        JButton but0 = new JButton("CreateNewTable");
        setLayout(new BorderLayout());
        add(but0, BorderLayout.SOUTH);

        Panel.setPreferredSize(new Dimension(300, 50));
        add(Panel, BorderLayout.NORTH);

        jta.setPreferredSize(new Dimension(300, 50));
        jta.setEditable(false);
        Panel.add(jsp);

        but0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SecondWindow();
            }
        });
        setVisible(true);
    }

    class SecondWindow extends JFrame {
        SecondWindow(){
            setTitle("FillInTable");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(800, 100, 400, 400);

            JButton but1 = new JButton("but1");

            setLayout(null);

            JPanel[] Panels = new JPanel[3];
            JTextArea[] areas = new JTextArea[3];
            JTextField[] fields = new JTextField[3];
            int x = 0;
            for (int i = 0; i < 3; i++)
            {
                Panels[i] = new JPanel();
                add(Panels[i]);
                Panels[i].setPreferredSize(new Dimension(300, 40));
                Panels[i].setBounds(50, 20+x, 300, 40);
                x += 50;

                areas[i] = new JTextArea();
                areas[i].setPreferredSize(new Dimension(300, 40));
                Panels[i].add(areas[i]);

                fields[i] = new JTextField();
                Panels[i].add(fields[i]);
            }

            JPanel bottomPanel = new JPanel();
            add(bottomPanel);
            bottomPanel.setBounds(150, 300, 100, 50);
            bottomPanel.setPreferredSize(new Dimension(40,40));
            bottomPanel.add(but1);

            but1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jta.setText("");
                    jta.append(areas[0].getText() + " " + areas[1].getText() + " " + areas[2].getText());
                    dispose();
                }
            });
            setVisible(true);
        }
    }
}