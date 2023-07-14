package Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utente {
    @Id
    @GeneratedValue
    private UUID numeroDiTessera;

    private String nome;

	private String cognome;

    private LocalDate dataDiNascita;

    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestiti = new ArrayList<>();

	public Utente() {
	}
    
	public Utente( String nome, String cognome, LocalDate dataDiNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	public UUID getNumeroDiTessera() {
		return numeroDiTessera;
	}

	public void setNumeroDiTessera(UUID numeroDiTessera) {
		this.numeroDiTessera = numeroDiTessera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
    public List<Prestito> getPrestiti() {
		return prestiti;
	}

	public void setPrestiti(List<Prestito> prestiti) {
		this.prestiti = prestiti;
	}

	@Override
	public String toString() {
		return "Utente [numeroDiTessera=" + numeroDiTessera + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataDiNascita=" + dataDiNascita + ", prestiti=" + prestiti + "]";
	}

	
}

