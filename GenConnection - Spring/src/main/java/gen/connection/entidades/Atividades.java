package gen.connection.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atividades {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_atividades;
	
	@Column(nullable = false, length = 80)
    private String materias;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "usuario_id_fk", nullable = false)
	    private Usuario usuario;

	public Long getId_atividades() {
		return id_atividades;
	}

	public void setId_atividades(Long id_atividades) {
		this.id_atividades = id_atividades;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	 
	 
}
