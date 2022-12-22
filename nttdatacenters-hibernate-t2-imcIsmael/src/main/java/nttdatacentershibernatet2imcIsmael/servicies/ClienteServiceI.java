package nttdatacentershibernatet2imcIsmael.servicies;

import java.util.List;

import nttdatacentershibernatet2imcIsmael.persistence.Cliente;

/**
 * 
 * Interface del servicio de clientes.
 * 
 * @author Ismael Mercado Calero
 *
 */
public interface ClienteServiceI {
	/**
	 * Inserta un nuevo cliente.
	 * 
	 * @param newCliente
	 */
	public void insertNewCliente(final Cliente newCliente);

	/**
	 * Actualiza un cliente existente.
	 * 
	 * @param updatedCliente
	 */
	public void updateCliente(final Cliente updatedCliente);

	/**
	 * Elimina un cliente existente.
	 * 
	 * @param deletedCliente
	 */
	public void deleteCliente(final Cliente deletedCliente);

	/**
	 * Obtiene un cliente mediante su ID.
	 * 
	 * @param Id
	 */
	public Cliente searchById(final Long Id);

	/**
	 * Obtiene todos los clientes existentes.
	 * 
	 * @return List<Contract>
	 */
	public List<Cliente> searchAll();

	/**
	 * Obtiene clientes que coincidan con el nombre y apellidos.
	 * 
	 * @param name
	 * @param first_surname
	 * @param second_surname
	 */
	public Cliente searchByNameSurname(final String name, final String first_surname, final String second_surname);
}
