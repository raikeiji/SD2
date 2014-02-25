/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author basisb04
 */
public class RaiTree extends JFrame {

    public RaiTree() throws HeadlessException {
        Gui();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                RaiTree rai = new RaiTree();
                rai.setVisible(true);
            }
        });

    }

    public void Gui() {
        setTitle("Rai");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init();
        pack();
    }

    public void init() {
        JPanel panel = new JPanel();
        JPanel panelbingkai=new JPanel();
        panelbingkai.setLayout(new BorderLayout());
        JTextArea area = new JTextArea();
        area.setForeground(Color.red);
        area.setBackground(Color.DARK_GRAY);
        area.setPreferredSize(new Dimension(300, 300));

        JButton savebutton = new JButton("Save");
        savebutton.setToolTipText("Tombol ini untuk menyimpan data kedalam suatu file");
        JButton openbutton = new JButton("Open");
        openbutton.setToolTipText("Tombol ini untuk membuka file dari suatu directory");
        JButton exitbutton=new JButton("Exit");
        exitbutton.setToolTipText("Tombol ini berfungsi untuk menutup program");
        exitbutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(savebutton);
        panel.add(openbutton);
        panel.add(exitbutton);

        panelbingkai.add(area);
        panel.add(panelbingkai);
        add(panel);

    }
}
