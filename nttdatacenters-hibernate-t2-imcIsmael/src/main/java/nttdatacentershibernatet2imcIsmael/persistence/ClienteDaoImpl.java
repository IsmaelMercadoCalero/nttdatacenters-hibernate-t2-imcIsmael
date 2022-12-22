package nttdatacentershibernatet2imcIsmael.persistence;

import org.hibernate.Session;

/**
 * 
 * DAO de tabla Cliente
 * 
 * @author Ismael Mercado Calero
 *
 */
public class ClienteDaoImpl extends CommonDaoImpl<Cliente> implements ClienteDaoI {

	/** Sesión de conexión a BD */
	private Session session;

	/**
	 * Método constructor
	 */
	public ClienteDaoImpl(Session session) {
		super(session);
		this.session = session;
	}

	@Override
	public Cliente searchByNameSurname(String nameSurname) {
		return null;
	}

}