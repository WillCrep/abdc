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
@Table(name = "ServiciosSolicitados")
public class ServiciosSolicitados implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ssrv_id")
    private Long ssrv_id;
    
    @ManyToOne
    @JoinColumn(name = "srv_id", referencedColumnName = "srv_id")
    private Servicio servicio;
    
    @Column(name = "fecha")
    private String fecha;
    
    @ManyToOne
    @JoinColumn(name = "cli_id", referencedColumnName = "cli_id")
    private Cliente cliente;
    
    /****** Getter's and Setter's ******/
    
	public Long getSsrv_id() {
		return ssrv_id;
	}

	public void setSsrv_id(Long ssrv_id) {
		this.ssrv_id = ssrv_id;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
}