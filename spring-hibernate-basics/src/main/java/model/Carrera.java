package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_carrera")
@Entity
public class Carrera implements Serializable {
	
	private static final long serialVersionUID = -831401648183269842L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ca_id")
	private long id;
	@Column(name="ca_nombre")
	private String nombre;
	@Column(name="ca_carga_horaria")
	private int cargaHoraria;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Carrera(String nombre, int cargaHoraria) {
		this.nombre = nombre;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Carrera() {
		
	}

}
