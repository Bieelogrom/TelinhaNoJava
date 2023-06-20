
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class FormSplash extends JFrame{

	ImageIcon iconeInterface = new ImageIcon("assets/NBA2.jpg");
	JLabel lbNome,lbPorcentagem;
	JLabel gifJames = new JLabel(new ImageIcon("assets/bronjames.gif"));
	Color fundoSplash = Color.decode("#fb8500");
	JProgressBar pbProgresso;
	
	public FormSplash() {
			//background
			this.getContentPane().setBackground(fundoSplash);
			this.setTitle("Cadastro da NBA");
			this.setIconImage(iconeInterface.getImage());
			//especificações do gif 
			gifJames.setSize(180, 180);
			gifJames.setBounds(275, 10, 180, 180);
			//gif
			this.getContentPane().add(gifJames);
			//tela
			this.setSize(500,300);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
			this.setLayout(null);
			
			Container c = getContentPane();
			
			lbNome = new JLabel();
			lbNome.setFont(new Font("Arial", Font.BOLD, 14));
			lbNome.setForeground(Color.WHITE);
			lbNome.setText("CADASTRO DE JOGADOR");
			lbNome.setBounds(50,50,200,30);
			c.add(lbNome);
			
			lbPorcentagem = new JLabel();
			lbPorcentagem.setFont(new Font("Arial", Font.BOLD, 40));
			lbPorcentagem.setForeground(Color.WHITE);
			lbPorcentagem.setText("");
			lbPorcentagem.setBounds(100,90,100,30);
			c.add(lbPorcentagem);
			
			pbProgresso = new JProgressBar();
			pbProgresso.setBackground(Color.LIGHT_GRAY);
			pbProgresso.setForeground(Color.BLUE);
			pbProgresso.setBounds(20,220,450,30);
			c.add(pbProgresso);
							
			this.setVisible(true);
	}
}
