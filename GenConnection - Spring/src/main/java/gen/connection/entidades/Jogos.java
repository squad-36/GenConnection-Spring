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
public class Jogos {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_jogos;
	
	@Column(nullable = false, length = 80)
    private String nome_jogos;
	
	@Column(nullable = false, length = 80)
    private String pontos;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "usuario_id_fk", nullable = false)
	    private Usuario usuario;

	public Long getId_jogos() {
		return id_jogos;
	}

	public void setId_jogos(Long id_jogos) {
		this.id_jogos = id_jogos;
	}

	public String getNome_jogos() {
		return nome_jogos;
	}

	public void setNome_jogos(String nome_jogos) {
		this.nome_jogos = nome_jogos;
	}

	public String getPontos() {
		return pontos;
	}

	public void setPontos(String pontos) {
		this.pontos = pontos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	 
	 
}
