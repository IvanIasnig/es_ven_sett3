package DAO;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import Application.Utente;

public class UtenteDAO {
    
    private final EntityManager em;
    
    public UtenteDAO(EntityManager em) {
    	this.em = em;
    }
    
    public void aggiungiUtente(Utente utente) {
    	EntityTransaction t = em.getTransaction();
    	t.begin();
        em.persist(utente);
        t.commit();
        System.out.println("Utente salvato correttamente");
    }

    public Utente trovaPerIsbn(UUID isbn) {
        TypedQuery<Utente> query = em.createQuery("SELECT e FROM Utente e WHERE e.isbn = :isbn", Utente.class);
        query.setParameter("isbn", isbn);
        return query.getSingleResult();
    }
    
    public void rimuoviUtente(UUID isbn) {
        Utente Utente = trovaPerIsbn(isbn); //ho applicato il metodo sopra anzichè riscrivelo
        if (Utente != null) {
            em.remove(Utente);
            System.out.println("Utente rimosso correttamente");
        } else {
        	System.out.println("Utente non trovato");
        }
    }

    public Utente trovaPerNumeroTessera(UUID tessera) {
        TypedQuery<Utente> query = em.createQuery("SELECT u FROM Utente u WHERE u.numeroTessera = :tessera", Utente.class);
        query.setParameter("tessera", tessera);
        return query.getSingleResult();
    }


}


