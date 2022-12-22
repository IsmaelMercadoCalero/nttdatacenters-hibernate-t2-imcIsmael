package nttdatacentershibernatet2imcIsmael.servicies;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import nttdatacentershibernatet2imcIsmael.persistence.Cliente;
import nttdatacentershibernatet2imcIsmael.persistence.Contrato;
import nttdatacentershibernatet2imcIsmael.persistence.ContratoDaoImpl;
import nttdatacentershibernatet2imcIsmael.persistence.ContratoDaol;

/**
 * 
 * Implementación del servicio de Contrato.
 * 
 * @author Ismael Mercado Calero
 *
 */
public class ContratoServiceImpl implements ContratoServiceI {

	/** DAO: Contrato */
	private ContratoDaol contratoDao;

	/**
	 * Método constructor.
	 */
	public ContratoServiceImpl(final Session session) {
		this.contratoDao = new ContratoDaoImpl(session);
	}

	@Override
	public void insertNewContrato(Contrato newContrato) {
		// Verificación de nulidad e inexistencia.
		if (newContrato != null && newContrato.getContratoId() == null) {

			// Insercción del nuevo partido.
			contratoDao.insert(newContrato);
		}

	}

	@Override
	public void updateContrato(Contrato updatedContrato) {
		// Verificación de nulidad y existencia.
		if (updatedContrato != null && updatedContrato.getContratoId() != null) {

			// Actualización del partido.
			contratoDao.update(updatedContrato);
		}

	}

	@Override
	public void deleteContrato(Contrato deletedContrato) {
		// Verificación de nulidad y existencia.
		if (deletedContrato != null && deletedContrato.getContratoId() != null) {

			// Eliminación del partido.
			contratoDao.delete(deletedContrato);
		}

	}

	@Override
	public Long searchById(Long ContratoId) {
		// Resultado.
		Cliente cliente = null;

		// Verificación de nulidad.
		if (ContratoId != cliente.getClienteId()) {

			return ContratoId;
		}

		return null;
	}

	@Override
	public List<Contrato> searchAll() {
		// Resultado.
		List<Contrato> contratoList = new ArrayList<>();

		// Obtención de partido.
		contratoList = contratoDao.searchAll();

		return contratoList;
	}

	@Override
	public Contrato searchByContratoId(Cliente cliente) {
		// Resultado.
		Contrato contrato = null;

		// Verificación de nulidad.
		if (cliente != null) {

			// Obtención del partido por ID.
			contrato = contratoDao.searchById(cliente.getClienteId());
		}

		return contrato;
	}
}
