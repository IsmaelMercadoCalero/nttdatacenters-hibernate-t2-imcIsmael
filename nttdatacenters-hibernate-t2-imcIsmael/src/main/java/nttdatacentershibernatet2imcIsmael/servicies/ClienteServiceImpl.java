package nttdatacentershibernatet2imcIsmael.servicies;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import nttdatacentershibernatet2imcIsmael.persistence.Cliente;
import nttdatacentershibernatet2imcIsmael.persistence.ClienteDaoI;
import nttdatacentershibernatet2imcIsmael.persistence.ClienteDaoImpl;

/**
 * 
 * Implementación del servicio de clientes.
 * 
 * @author Ismael Mercado Calero
 *
 */
public class ClienteServiceImpl implements ClienteServiceI {
	/** DAO: Cliente */
	private ClienteDaoI clienteDao;

	/**
	 * Método constructor.
	 */
	public ClienteServiceImpl(final Session session) {
		this.clienteDao = new ClienteDaoImpl(session);
	}

	@Override
	public void insertNewCliente(Cliente newCliente) {
		// Verificación de nulidad e inexistencia.
		if (newCliente != null && newCliente.getClienteId() == null) {

			// Insercción del nuevo cliente.
			clienteDao.insert(newCliente);
		}

	}

	@Override
	public void updateCliente(final Cliente updatedCliente) {

		// Verificación de nulidad y existencia.
		if (updatedCliente != null && updatedCliente.getClienteId() != null) {

			// Actualización del cliente.
			clienteDao.update(updatedCliente);
		}

	}

	@Override
	public void deleteCliente(final Cliente deletedCliente) {

		// Verificación de nulidad y existencia.
		if (deletedCliente != null && deletedCliente.getClienteId() != null) {

			// Eliminación del cliente.
			clienteDao.delete(deletedCliente);
		}

	}

	@Override
	public Cliente searchById(final Long clienteId) {

		// Resultado.
		Cliente cliente = null;

		// Verificación de nulidad.
		if (clienteId != null) {

			// Obtención del cliente por ID.
			cliente = clienteDao.searchById(clienteId);
		}

		return cliente;
	}

	@Override
	public List<Cliente> searchAll() {
		// Resultado.
		List<Cliente> clienteList = new ArrayList<>();

		// Obtención de contratos.
		clienteList = clienteDao.searchAll();

		return clienteList;
	}

	@Override
	public Cliente searchByNameSurname(String name, String first_surname, String second_surname) {
		// Resultado.
		Cliente cliente = null;

		// Verificación de nulidad.
		if (name != null) {
			if (first_surname != null) {
				if (second_surname != null) {
					// Obtención del cliente por nombre y apellidos.
					cliente = clienteDao.searchByNameSurname(name + " " + first_surname + " " + second_surname);
				}
			}

		}

		return cliente;

	}
}
