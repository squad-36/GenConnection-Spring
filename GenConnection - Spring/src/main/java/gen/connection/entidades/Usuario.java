package gen.connection.entidades;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
	
	@Column(nullable = false, length = 80)
    private String nome;

	@Column(nullable = false, length = 80)
    private String senha;
	
	@Column(nullable = false, length = 80)
    private String email;
	
	@Column(nullable = true, length = 80)
	@Enumerated(EnumType.STRING)
    private Sua_id sua_id;
	
	 @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	    private List<Atividades> atividades;
	 
	 @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	    private List<Jogos> jogos;
	 
	 @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	    private List<Notificacao> notificacao;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "permissao_id_fk", nullable = true)
	    private Permissao permissao;

	

	public Sua_id getSua_id() {
		return sua_id;
	}

	public void setSua_id(Sua_id sua_id) {
		this.sua_id = sua_id;
	}

	
	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Atividades> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividades> atividades) {
		this.atividades = atividades;
	}

	public List<Jogos> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogos> jogos) {
		this.jogos = jogos;
	}

	public List<Notificacao> getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(List<Notificacao> notificacao) {
		this.notificacao = notificacao;
	}



	 
}
