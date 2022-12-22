package nttdatacentershibernatet2imcIsmael.servicies;

import java.util.List;

import nttdatacentershibernatet2imcIsmael.persistence.Cliente;
import nttdatacentershibernatet2imcIsmael.persistence.Contrato;

/**
 * 
 * Interface del servicio de contrato.
 * 
 * @author Ismael Mercado Calero
 *
 */
public interface ContratoServiceI {
	/**
	 * Inserta un nuevo contrato.
	 * 
	 * @param newContrato
	 */
	public void insertNewContrato(final Contrato newContrato);

	/**
	 * Actualiza un contrato existente.
	 * 
	 * @param updatedCliente
	 */
	public void updateContrato(final Contrato updatedContrato);

	/**
	 * Elimina un Contrato existente.
	 * 
	 * @param deletedContrato
	 */
	public void deleteContrato(final Contrato deletedContrato);

	/**
	 * Obtiene un Contrato mediante su ID.
	 * 
	 * @param ContratoId
	 */
	public Long searchById(final Long ContratoId);

	/**
	 * Obtiene todos los Contratos existentes.
	 * 
	 * @return List<Contrato>
	 */
	public List<Contrato> searchAll();

	/**
	 * Obtiene Contrato que coincidan con el id de contratos.
	 * 
	 * @param contrato
	 */
	public Contrato searchByContratoId(Cliente cliente);
}
