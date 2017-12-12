package main.java.graphics;


import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class MenuMain extends JFrame{

    public static PicBG panel1 = new PicBG();



    private JButton newGameButton;

    private JButton loadGameButton;

    private JButton exitButton;

    private JButton onlineGameButton;

    private JLabel versionLabel;





    public class ExitActionListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            System.exit(0);
        
}
    
}

    

public void Draw() {

        setTitle("Bughouse");

        setContentPane(new MenuMain().panel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 500, 450);

        setVisible(true);


        Container cont = getContentPane();


        GridBagLayout gbl = new GridBagLayout();

        cont.setLayout(gbl);


        GridBagConstraints c = new GridBagConstraints();


        c.anchor = GridBagConstraints.NORTH;

        c.fill   = GridBagConstraints.BOTH;

        c.gridheight = 1;

        c.gridwidth  = GridBagConstraints.REMAINDER;

        c.gridx = GridBagConstraints.RELATIVE;

        c.gridy = GridBagConstraints.RELATIVE;

        c.insets = new Insets(40, 0, 0, 0);

        c.ipadx = 0;

        c.ipady = 0;

        c.weightx = 0.0;

        c.weighty = 0.0;



        newGameButton = new JButton("Local Game");

        loadGameButton = new JButton("Load Game");

        onlineGameButton = new JButton("Online game");

        exitButton = new JButton("Exit");



        gbl.setConstraints(newGameButton,c);

        gbl.setConstraints(onlineGameButton,c);

        gbl.setConstraints(loadGameButton,c);

        gbl.setConstraints(exitButton,c);



        //newGameButton.setContentAreaFilled(false);



        cont.add(newGameButton);

        cont.add(onlineGameButton);

        cont.add(loadGameButton);

        cont.add(exitButton);



        ActionListener exitEV = new ExitActionListener();


        newGameButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //Open new frame and starting new game

                EventQueue.invokeLater(new Runnable() {

                    public void run() {

                        try {

                            GUI window = new GUI();


                        } catch (Exception e) {

                            e.printStackTrace();

                        }

                    }

                });


                setVisible(false);

            }

        });



        onlineGameButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                EventQueue.invokeLater(new Runnable() {

                    public void run() {

                        try {

                            OnlineMenu windowOnl = new OnlineMenu();


                        } catch (Exception e) {

                            e.printStackTrace();

                        }

                    }

                });

                setVisible(false);
            }

        });



        exitButton.addActionListener(exitEV);




        versionLabel = new JLabel("version : 0.5.5");

        versionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        versionLabel.setBounds(550,700,100,20);

        panel1.add(versionLabel);


        
}

    }



