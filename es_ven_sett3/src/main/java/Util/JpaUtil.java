package Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("es_ven_sett3");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
