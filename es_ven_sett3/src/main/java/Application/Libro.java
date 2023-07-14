package Application;


import javax.persistence.Entity;

@Entity
public class Libro extends Elemento {

    private String autore;
    private String genere;
    
	public Libro() {
		super();
	}
	public Libro( String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
		super( titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + ", isbn=" + isbn + ", titolo=" + titolo
				+ ", annoPubblicazione=" + annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}


}