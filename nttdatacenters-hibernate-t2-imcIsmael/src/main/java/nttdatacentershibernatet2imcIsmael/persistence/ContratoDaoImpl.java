package nttdatacentershibernatet2imcIsmael.persistence;

import org.hibernate.Session;

public class ContratoDaoImpl extends CommonDaoImpl<Contrato> implements ContratoDaol {
	/** Sesión de conexión a BD */
	private Session session;

	/**
	 * Método constructor
	 */
	public ContratoDaoImpl(Session session) {
		super(session);
		this.session = session;
	}

	@Override
	public Contrato searchByNameSurname(String nameSurname) {
		// TODO Auto-generated method stub
		return null;
	}
}
