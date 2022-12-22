package nttdatacentershibernatet2imcIsmael;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * Clase de configuración
 * 
 * @author Ismael Mercado Calero
 *
 */
public class NttdatacentersHibernateT2ImcIsmaelUtil {
	/** Factoría de sesiones */
	private static final SessionFactory SESSION_FACTORY;

	/**
	 * Constructor privado.
	 */
	private NttdatacentersHibernateT2ImcIsmaelUtil() {

	}

	/**
	 * Generación de factoría de sesiones.
	 */
	static {

		try {

			// Generación de configuración.
			SESSION_FACTORY = new Configuration().configure().buildSessionFactory();

		} catch (final Exception ex) {

			// Error de inicialización.
			System.err.println("[ERROR] Configuración de Hibernate - " + ex);
			throw new ExceptionInInitializerError();
		}

	}

	/**
	 * Retorna la factoría de sesiones.
	 * 
	 * @return SessionFactory
	 */
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}