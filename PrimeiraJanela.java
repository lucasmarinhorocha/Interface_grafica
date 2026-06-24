import javax.swing.JFrame;
import java.awt.Color;




public class PrimeiraJanela extends JFrame{
    
    public PrimeiraJanela(){

        this.setTitle("HELLOU WORLD");
        this.setSize(1000,500);
        this.setLocation(500,250);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.CYAN);
      
    }


    public static void main(String[] args) {
        PrimeiraJanela janela = new PrimeiraJanela();
        janela.setVisible(true);
    }
}
