package nttdatacentershibernatet2imcIsmael.persistence;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * Entidad de tabla Contrato
 * 
 * @author Ismael Mercado Calero
 *
 */
@Entity
@Table(name = "Contrato")
public class Contrato extends AbstractEntity implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) */
	private Long contratoId;

	/** Fecha de Vigencia */
	private String fechaVigencia;

	/** Fecha de caducidad */
	private String fechaCaducidad;

	/** Precio final */
	private double precio;

	/** Relacion con cliente */
	private Cliente cliente;

	/**
	 * @return the matchId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contratoId")
	public Long getContratoId() {
		return contratoId;
	}

	/**
	 * @param contratoId
	 */
	public void setContratoId(Long contratoId) {
		this.contratoId = contratoId;
	}

	/**
	 * @return fechaCaducidad
	 */
	@Column(name = "fechaCaducidad")
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * @param fechaCaducidad
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * @return fechaVigencia
	 */
	@Column(name = "fechaVigencia")
	public String getFechaVigencian() {
		return fechaVigencia;
	}

	/**
	 * @param fechaVigencia
	 */
	public void setFechavigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	/**
	 * @return precio
	 */
	@Column(name = "precio")
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return cliente
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinTable(name = "Cliente", joinColumns = { @JoinColumn(name = "contrato_id") }, inverseJoinColumns = {
			@JoinColumn(name = "id") })
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Contrato [contratoId=" + contratoId + ", fechaVigencia=" + fechaVigencia + ", fechaCaducidad="
				+ fechaCaducidad + ", precio=" + precio + ", cliente=" + cliente + "]";
	}

	@Transient
	public Class<?> getClase() {
		return Contrato.class;
	}

}
