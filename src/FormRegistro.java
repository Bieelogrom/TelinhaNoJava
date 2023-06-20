
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class FormRegistro extends JFrame{
	
	public static Aluno aluno;
	Color fundoSplash = Color.decode("#fb8500");
	JLabel lbNome,lbDataNasc,lbCpf, lbAnoSerie, lbContato, lbPreferencia;
	JTextField txNome, txEmail;
	JFormattedTextField txDataNasc, txCpf, txTelefone,txWhatsApp;
	JComboBox cbAnoSerie;
	ButtonGroup grupoContato, grupoPreferencia;
	JRadioButton rbTelefone, rbEmail, rbWhatsApp;
	JCheckBox ckMusica, ckFilmes, ckConhecimentosGerais;
	JButton btSalvar;
	
	
	public FormRegistro() throws ParseException {
		this.getContentPane().setBackground(fundoSplash);
		this.setTitle("Cadastro da NBA");
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setLayout(null);
		
		Container c = getContentPane();
		MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		MaskFormatter mascaraData = new MaskFormatter("##/##/####");
		MaskFormatter mascaraFone = new MaskFormatter("(##)#####-####");
		
		lbNome = new JLabel();
		lbNome.setFont(new Font("Arial", Font.BOLD, 14));
		lbNome.setForeground(Color.WHITE);
		lbNome.setText("Nome");
		lbNome.setBounds(50,50,100,30);
		c.add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(100, 50, 200, 30);
		c.add(txNome);
		
		lbDataNasc = new JLabel();
		lbDataNasc.setFont(new Font("Arial", Font.BOLD, 14));
		lbDataNasc.setForeground(Color.WHITE);
		lbDataNasc.setText("Data do Draft");
		lbDataNasc.setBounds(50,90,100,30);
		c.add(lbDataNasc);
				
		txDataNasc = new JFormattedTextField(mascaraData);
		txDataNasc.setBounds(145, 90, 75, 30);
		c.add(txDataNasc);
		
		lbCpf = new JLabel();
		lbCpf.setFont(new Font("Arial", Font.BOLD, 14));
		lbCpf.setForeground(Color.WHITE);
		lbCpf.setText("CPF");
		lbCpf.setBounds(50,130,100,30);
		c.add(lbCpf);
		
		txCpf = new JFormattedTextField(mascaraCpf);
		txCpf.setBounds(100, 130, 100, 30);
		c.add(txCpf);
		
		lbAnoSerie = new JLabel();
		lbAnoSerie.setFont(new Font("Arial", Font.BOLD, 14));
		lbAnoSerie.setForeground(Color.WHITE);
		lbAnoSerie.setText("Time");
		lbAnoSerie.setBounds(50,170,100,30);
		c.add(lbAnoSerie);
		
		cbAnoSerie = new JComboBox();
		cbAnoSerie.setFont(new Font("Arial", Font.BOLD, 14));
		cbAnoSerie.setBounds(100, 170, 100, 30);
		cbAnoSerie.addItem("Armador");
		cbAnoSerie.addItem("Ala-Armador");
		cbAnoSerie.addItem("Ala");
		cbAnoSerie.addItem("Ala-Pivô");
		cbAnoSerie.addItem("Pivô");
		c.add(cbAnoSerie);
		
		lbContato = new JLabel();
		lbContato.setFont(new Font("Arial", Font.BOLD, 14));
		lbContato.setForeground(Color.WHITE);
		lbContato.setText("Contato");
		lbContato.setBounds(50,210,100,30);
		c.add(lbContato);
		
		txEmail = new JTextField();
		txEmail.setBounds(110, 210, 100, 30);
		txEmail.setVisible(true);
		c.add(txEmail);
		
		txTelefone = new JFormattedTextField(mascaraFone);
		txTelefone.setBounds(210, 210, 100, 30);
		txTelefone.setVisible(true);
		c.add(txTelefone);
		
		txWhatsApp = new JFormattedTextField(mascaraFone);
		txWhatsApp.setBounds(310, 210, 100, 30);
		txWhatsApp.setVisible(true);
		c.add(txWhatsApp);
		
		rbEmail = new JRadioButton();
		rbEmail.setText("E-mail");
		rbEmail.setBounds(110, 240, 100, 30);
		c.add(rbEmail);
		
		rbTelefone = new JRadioButton();
		rbTelefone.setText("Telefone");
		rbTelefone.setBounds(210, 240, 100, 30);
		c.add(rbTelefone);
		
		rbWhatsApp = new JRadioButton();
		rbWhatsApp.setText("WhatsApp");
		rbWhatsApp.setBounds(310, 240, 100, 30);
		c.add(rbWhatsApp);
		
		grupoContato = new ButtonGroup();
		grupoContato.add(rbEmail);
		grupoContato.add(rbTelefone);
		grupoContato.add(rbWhatsApp);
		
		lbPreferencia = new JLabel();
		lbPreferencia.setFont(new Font("Arial", Font.BOLD, 14));
		lbPreferencia.setForeground(Color.WHITE);
		lbPreferencia.setText("Quais times são do seu interesse?");
		lbPreferencia.setBounds(50, 275, 300, 30);
		c.add(lbPreferencia);
		
		ckMusica = new JCheckBox();
		ckMusica.setText("San Antonio Spurs");
		ckMusica.setBounds(100, 300, 200, 30);
		c.add(ckMusica);
		
		ckFilmes = new JCheckBox();
		ckFilmes.setText("Charlotte Hornets");
		ckFilmes.setBounds(100, 325, 200, 30);
		c.add(ckFilmes);
		
		ckConhecimentosGerais = new JCheckBox();
		ckConhecimentosGerais.setText("Portland Trail Blazers");
		ckConhecimentosGerais.setBounds(100, 350, 200, 30);
		c.add(ckConhecimentosGerais);
					
		btSalvar = new JButton();
		btSalvar.setText("Salvar");
		btSalvar.setBounds(100, 500, 100, 30);
		c.add(btSalvar);
		btSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = txNome.getText();
				String dataNasc = txDataNasc.getText();
				String serie = cbAnoSerie.getSelectedItem().toString();
				String tipoContato = null;
				String contato = null;
				
				if(rbEmail.isSelected()) {
					tipoContato = "Email";
					contato = txEmail.getText();
				}else if(rbTelefone.isSelected()) {
					tipoContato = "Telefone";
					contato = txTelefone.getText();
				}else if(rbWhatsApp.isSelected()) {
					tipoContato = "WhatsApp";
					contato = txWhatsApp.getText();
				}
							
				ArrayList<String> preferencia = new ArrayList<String>();
				if(ckMusica.isSelected()) {
					preferencia.add(ckMusica.getText());
				}
				
				if(ckFilmes.isSelected()) {
					preferencia.add(ckFilmes.getText());
				}
				
				if(ckConhecimentosGerais.isSelected()) {
					preferencia.add(ckConhecimentosGerais.getText());
				}
				
				aluno = new Aluno(nome,dataNasc,serie,tipoContato,contato,preferencia);
				
				/*
				String resultado = String.format("%s %s %s %s %s %s",
				aluno.getNome(),aluno.getDataNasc(), aluno.getSerie(), aluno.getTipoContato(), aluno.getContato(), msg);
						
				JOptionPane.showMessageDialog(null,resultado);
				*/
				
				try {
					FormResumo resumo = new FormResumo();
					resumo.setVisible(true);
										
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		this.setVisible(true);
	}	
}

