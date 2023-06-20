
public class App {
	public static void main(String[] args) {
		
		FormSplash formSplash = new FormSplash();
		
		try {
			for (int i=0; i<=100; i++) {
				Thread.sleep(30);
				formSplash.lbPorcentagem.setText(" "+i);
				formSplash.pbProgresso.setValue(i);
				if(i==100) {
					formSplash.setVisible(false);
					new FormRegistro();					
				}
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
