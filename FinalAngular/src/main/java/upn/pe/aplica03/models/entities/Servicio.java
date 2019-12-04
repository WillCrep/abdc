package upn.pe.aplica03.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio implements Serializable{
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "srv_id")
    private Long srv_id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "monto")
    private Float monto;
    
    /****** Getter's and Setter's ******/
    
	public Long getSrv_id() {
		return srv_id;
	}

	public void setSrv_id(Long srv_id) {
		this.srv_id = srv_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getMonto() {
		return monto;
	}

	public void setMonto(Float monto) {
		this.monto = monto;
	}
    
}