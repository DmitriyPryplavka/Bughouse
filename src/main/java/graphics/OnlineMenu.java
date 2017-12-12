package main.java.graphics;

import main.java.Constants;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnlineMenu extends JFrame {

    public static JTextField nameTextField;

    /**
     * Creating main menu window
     */
    public OnlineMenu() {
        setTitle("Bughouse chess");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);
        setLocationRelativeTo(null);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUName = new JLabel("Username:");
        lblUName.setBounds(121, 45, 52, 14);
        nameTextField = new JTextField();
        nameTextField.setBounds(104, 67, 86, 20);
        contentPane.add(nameTextField);
        nameTextField.setColumns(10);

        JButton btnStartServer = new JButton("Start server.");
        btnStartServer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (nameTextField.getText().length() < 1) {
                    JOptionPane.showMessageDialog(getParent(), "Enter name");
                } else {
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            try {
                                Constants.name = nameTextField.getText();
                                ServerGUI frame = new ServerGUI();
                                frame.setVisible(true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    setVisible(false);
                }
            }
        });
        btnStartServer.setBounds(47, 364, 200, 25);
        contentPane.add(btnStartServer);

        JButton btnStartClient = new JButton("Start client.");
        btnStartClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (nameTextField.getText().length() < 1) {
                    JOptionPane.showMessageDialog(getParent(), "Enter name");
                } else {
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            try {
                                Constants.name = nameTextField.getText();
                                ClientGUI frame = new ClientGUI();
                                frame.setVisible(true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    setVisible(false);
                }
            }
        });
        btnStartClient.setBounds(47, 400, 200, 25);
        contentPane.add(btnStartClient);

        JButton btnOptions = new JButton("Options");
        btnOptions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(getParent(), "No options :)");
                setVisible(false);
            }
        });
        btnOptions.setBounds(37, 436, 100, 25);
        contentPane.add(btnOptions);

        JButton btnQuitGame = new JButton("Quit Game");
        btnQuitGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        btnQuitGame.setBounds(157, 436, 100, 25);
        contentPane.add(btnQuitGame);

        setVisible(true);
    }
}

