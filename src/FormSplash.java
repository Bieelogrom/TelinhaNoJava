
import java.awt.Color;
import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class FormSplash extends JFrame{

     
	JLabel lbNome,lbPorcentagem;
	JProgressBar pbProgresso;
	
	public FormSplash() {
			this.getContentPane().setBackground(Color.BLUE);
			this.setTitle("Cadastro de Aluno");
			this.setSize(500,250);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
			this.setLayout(null);
			
			Container c = getContentPane();
			
			lbNome = new JLabel();
			lbNome.setText("CADASTRO DE ALUNO");
			lbNome.setBounds(50,50,200,30);
			c.add(lbNome);
			
			lbPorcentagem = new JLabel();
			lbPorcentagem.setText("");
			lbPorcentagem.setBounds(50,90,100,30);
			c.add(lbPorcentagem);
			
			pbProgresso = new JProgressBar();
			pbProgresso.setBounds(20,150,450,30);
			c.add(pbProgresso);
							
			this.setVisible(true);
	}
}
