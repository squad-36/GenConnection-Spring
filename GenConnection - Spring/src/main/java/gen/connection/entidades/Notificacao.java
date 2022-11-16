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
public class Notificacao {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_atividades;
	
	@Column(nullable = false, length = 80)
    private String nome_notificacao;
	
	@Column(nullable = false, length = 150)
    private String mensagens;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "usuario_id_fk", nullable = false)
	 private Usuario usuario;

	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId_atividades() {
		return id_atividades;
	}

	public void setId_atividades(Long id_atividades) {
		this.id_atividades = id_atividades;
	}

	public String getNome_notificacao() {
		return nome_notificacao;
	}

	public void setNome_notificacao(String nome_notificacao) {
		this.nome_notificacao = nome_notificacao;
	}

	public String getMensagens() {
		return mensagens;
	}

	public void setMensagens(String mensagens) {
		this.mensagens = mensagens;
	}
	
	
}
