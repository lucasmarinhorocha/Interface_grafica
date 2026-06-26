package Exemplo_swing_01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

import java.awt.Color;
import java.awt.GridLayout;

public class UsaJLabel_ImagemIcon extends JFrame{
    
    private JLabel label1,label2;
    private ImageIcon icon = new ImageIcon("C:\\Users\\lucas.rocha\\Documents\\JAVA\\Interface_grafica\\Exemplo_swing_01\\cao.jpg");

    public UsaJLabel_ImagemIcon(){

        setTitle("HELLOU WORLD");
        setSize(350,250);
        setLocation(500,250);
        getContentPane().setBackground(Color.DARK_GRAY);

        label1 = new JLabel("Esquerda",icon,JLabel.LEFT);
        label2 = new JLabel("Direita",icon,JLabel.RIGHT);
      

        getContentPane().setLayout(new GridLayout(2,1));
        getContentPane().add(label1);
        getContentPane().add(label2);
    }

    public static void main(String[] args) {
        UsaJLabel_ImagemIcon janela = new UsaJLabel_ImagemIcon();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}

