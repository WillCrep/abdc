package upn.pe.aplica03.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DetalleServicio")
public class DetalleServicio implements Serializable{
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "serv_id",
    referencedColumnName = "serv_id")
    private ServicioMecanico servicioMecanico;
    
    @ManyToOne
    @JoinColumn(name = "srv_id",
    referencedColumnName = "srv_id")
    private Servicio servicio;
    
    @Column(name = "marca")
    private String marca;
    
    @Column(name = "modelo")
    private String modelo;
    
    @Column(name = "placa")
    private String placa;
    
    @Column(name = "contenido")
    private String contenido;
    
    /****** Getter's and Setter's ******/
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public ServicioMecanico getServicioMecanico() {
		return servicioMecanico;
	}
	
	public void setServicioMecanico(ServicioMecanico servicioMecanico) {
		this.servicioMecanico = servicioMecanico;
	}
	
	public Servicio getServicio() {
		return servicio;
	}
	
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
    
}
