package DZ;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;

public class Dop_DZ_2 extends JFrame {
    private Dop_DZ_2() {
        JFrame frame = new JFrame("MainTable");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String[][] ColumnNames = {{"Alex", "69", "0"}, {"Hey", "53", "38000"},
                {"Boss", "42", "15000"}};
        String[] names = {"Name", "Age", "Salary"};

        TableModel model = new DefaultTableModel(ColumnNames, names);
        JTable table = new JTable(model);
        RowSorter<TableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
        JScrollPane pane = new JScrollPane(table);

        frame.getContentPane().add(pane);
        frame.setPreferredSize(new Dimension(750, 600));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Dop_DZ_2();
    }
}
