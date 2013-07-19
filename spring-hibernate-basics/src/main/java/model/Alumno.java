package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_alumno")
@Entity
public class Alumno implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="al_id")
	private long id;
	@Column(name="al_nombre")
	private String nombre;
	@Column(name="al_apellido")
	private String apellido;
	@Column(name="al_documento")
	private String documento;
	@Column(name="al_tipo_documento")
	private String tipoDocumento;
	@Column(name="al_edad")
	private int edad;
	
	public Alumno() {		
	}
	
	public Alumno(String nombre, String apellido, String documento,
			String tipoDocumento, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.edad = edad;
	}
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + ", documento=" + documento + ", tipoDocumento="
				+ tipoDocumento + ", edad=" + edad + "]";
	}
	
	
	

}
