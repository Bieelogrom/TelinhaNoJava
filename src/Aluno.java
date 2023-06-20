
import java.util.ArrayList;


public class Aluno {
	private String nome;
	private String dataNasc;
	private String serie;
	private String tipoContato;
	private String contato;
	private ArrayList<String> preferencia = new ArrayList<String>();
	
	public Aluno(String nome, String dataNasc, String serie, String tipoContato, String contato,
			ArrayList<String> preferencia) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.serie = serie;
		this.tipoContato = tipoContato;
		this.contato = contato;
		this.preferencia = preferencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public ArrayList<String> getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(ArrayList<String> preferencia) {
		this.preferencia = preferencia;
	}
	
}

