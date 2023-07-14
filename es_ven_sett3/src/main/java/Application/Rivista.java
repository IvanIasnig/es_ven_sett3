package Application;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import Enum.Periodicita;

@Entity
public class Rivista extends Elemento {

    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

	public Rivista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rivista( String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super( titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", isbn=" + isbn + ", titolo=" + titolo + ", annoPubblicazione="
				+ annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}

}
