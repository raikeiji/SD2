package tree;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class SimpleJTreeExample extends JFrame {

    public static void main(String[] argv) {
        SimpleJTreeExample myExample = new SimpleJTreeExample("Simple JTree Example");
    }

    public SimpleJTreeExample(String title) {
        super(title);
        setSize(150, 150);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
        init();
        pack();
        setVisible(true);
    }

    private void init() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Calendar");
        DefaultMutableTreeNode months = new DefaultMutableTreeNode("Months");
        root.add(months);
        String monthLabels[] = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < monthLabels.length; i++) {
            months.add(new DefaultMutableTreeNode(monthLabels[i]));
        }
        DefaultMutableTreeNode weeks = new DefaultMutableTreeNode("Weeks");
        root.add(weeks);
        String weekLabels[] = {"Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < weekLabels.length; i++) {
            weeks.add(new DefaultMutableTreeNode(weekLabels[i]));
        }
        JScrollPane js = new JScrollPane(new JTree(root));
        getContentPane().add(js);
    }
}
