package upn.pe.aplica03.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ServicioMecanico")
public class ServicioMecanico implements Serializable{
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serv_id")
    private Long serv_id;

    @Temporal(TemporalType.DATE)
    @Column(name = "serv_fecha")
    private Date serv_fecha;

    @ManyToOne
    @JoinColumn(name = "per_id", referencedColumnName = "per_id")
    private Personal personal;

    @ManyToOne
    @JoinColumn(name = "cli_id", referencedColumnName = "cli_id")
    private Cliente cliente;
    
    /****** Getter's and Setter's ******/
    
	public Long getServ_id() {
		return serv_id;
	}
	
	public void setServ_id(Long serv_id) {
		this.serv_id = serv_id;
	}
	
	public Date getServ_fecha() {
		return serv_fecha;
	}
	
	public void setServ_fecha(Date serv_fecha) {
		this.serv_fecha = serv_fecha;
	}
	
	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
}