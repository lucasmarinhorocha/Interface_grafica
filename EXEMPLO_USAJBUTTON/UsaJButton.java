package EXEMPLO_USAJBUTTON;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UsaJButton extends JFrame implements ActionListener {

    private JButton B1;

    public UsaJButton() {
       B1 = new JButton("Mensagem");
       B1.setHorizontalAlignment(AbstractButton.RIGHT);
       B1.setBackground(Color.RED);
       B1.setForeground(Color.BLACK);
       B1.setFont(new Font("Scripta", Font.BOLD, 20));
       B1.setEnabled(true);
       B1.setToolTipText("Clique para ver a mensagem");
       B1.setMnemonic(KeyEvent.VK_B);
       B1.addActionListener(this);

       this.setTitle("Inserindo botões na janela");
       this.setSize(350,100);
       this.setLocation(50,50);
       this.getContentPane().setBackground(Color.orange);
       this.getContentPane().setLayout(new FlowLayout());
       this.getContentPane().add(this.B1);


    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == B1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Mensagem de teste",
                    "Mensagem",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }


    public static void main(String[] args) {
        JFrame janela = new UsaJButton();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setAlwaysOnTop(isDefaultLookAndFeelDecorated());
        janela.setVisible(true);
    }

    
}
