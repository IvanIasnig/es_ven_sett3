package Application;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prestito {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "elemento_id")
    private Elemento elemento;

    @Column(name = "data_inizio_prestito")
    private LocalDate dataInizioPrestito;

    @Column(name = "data_restituzione_prevista")
    private LocalDate dataRestituzionePrevista;

    @Column(name = "data_restituzione_effettiva")
    private LocalDate dataRestituzioneEffettiva;

	public Prestito() {
	}
    
	public Prestito( Utente utente, Elemento elemento, LocalDate dataInizioPrestito,
			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
		this.utente = utente;
		this.elemento = elemento;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista;
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [id=" + id + ", utente=" + utente + ", elemento=" + elemento + ", dataInizioPrestito="
				+ dataInizioPrestito + ", dataRestituzionePrevista=" + dataRestituzionePrevista
				+ ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva + "]";
	}

}
