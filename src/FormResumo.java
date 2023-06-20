

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class FormResumo  extends JFrame{
	
	JLabel lbNome,lbDataNasc,lbCpf, lbAnoSerie, lbContato, lbPreferencia;
	JTextField txNome, txEmail, txAnoSerie, txContato, txTipoContato, txPreferencia;
	JFormattedTextField txDataNasc, txCpf, txTelefone,txWhatsApp;
	JComboBox cbAnoSerie;
	ButtonGroup grupoContato, grupoPreferencia;
	
	JButton btFechar;
	
	ImageIcon icon = new ImageIcon("Sp.png");
	
	JLabel label = new JLabel(icon);
	
	public FormResumo() throws ParseException {
		
		this.setTitle("Aluno");
	 	this.getContentPane().add(label);
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setLayout(null);
		
		Container c = getContentPane();
		MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		MaskFormatter mascaraData = new MaskFormatter("##/##/####");
		MaskFormatter mascaraFone = new MaskFormatter("(##)#####-####");
		
		lbNome = new JLabel();
		lbNome.setText("Nome");
		lbNome.setBounds(50,50,100,30);
		c.add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(100, 50, 200, 30);
		txNome.setText(FormRegistro.aluno.getNome());
		txNome.setEditable(true);
		c.add(txNome);
		
		lbDataNasc = new JLabel();
		lbDataNasc.setText("Data");
		lbDataNasc.setBounds(50,90,100,30);
		c.add(lbDataNasc);
				
		txDataNasc = new JFormattedTextField(mascaraData);
		txDataNasc.setBounds(100, 90, 200, 30);
		txDataNasc.setText(FormRegistro.aluno.getDataNasc());
		txDataNasc.setEditable(false); 
		c.add(txDataNasc);
					
		lbAnoSerie = new JLabel();
		lbAnoSerie.setText("Série");
		lbAnoSerie.setBounds(50,130,100,30);
		c.add(lbAnoSerie);
		
		txAnoSerie = new JTextField();
		txAnoSerie.setBounds(100, 130, 200, 30);
		txAnoSerie.setText(FormRegistro.aluno.getSerie());
		txAnoSerie.setEditable(false);
		c.add(txAnoSerie);
		
		lbContato = new JLabel();
		lbContato.setText("Contato");
		lbContato.setBounds(50,170,100,30);
		c.add(lbContato); 
		
		txTipoContato = new JTextField();
		txTipoContato.setBounds(100, 170, 100, 30);
		txTipoContato.setText(FormRegistro.aluno.getTipoContato());
		txTipoContato.setEditable(false);
		c.add(txTipoContato);
		
		txContato = new JTextField();
		txContato.setBounds(200, 170, 100, 30);
		txContato.setText(FormRegistro.aluno.getContato());
		txContato.setEditable(false);
		c.add(txContato);
		
		lbPreferencia = new JLabel();
		lbPreferencia.setText("Quais temas são de sua preferência?");
		lbPreferencia.setBounds(50, 200, 300, 30);
		c.add(lbPreferencia);
		
		txPreferencia = new JTextField();
		txPreferencia.setBounds(100, 230, 300, 30);
		txPreferencia.setText(FormRegistro.aluno.getPreferencia().toString());
		txPreferencia.setEditable(false);
		c.add(txPreferencia);
		
		btFechar = new JButton();
		btFechar.setText("Fechar");
		btFechar.setBounds(100, 500, 100, 30);
		c.add(btFechar);
		btFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
				
			}
		});
		
		
		this.setVisible(true);
	}
}
