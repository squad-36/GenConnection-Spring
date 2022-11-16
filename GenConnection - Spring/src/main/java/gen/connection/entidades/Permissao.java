package gen.connection.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Permissao {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_perm;
	
	@Column(nullable = false, length = 80)
    private String nome_permissao;

	public Long getId_perm() {
		return id_perm;
	}

	public void setId_perm(Long id_perm) {
		this.id_perm = id_perm;
	}

	public String getNome_permissao() {
		return nome_permissao;
	}
	
	public void setNome_permissao(String nome_permissao) {
		this.nome_permissao = nome_permissao;
	}
	
	
}
