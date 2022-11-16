package gen.connection.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gen.connection.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>  {

	 @EntityGraph(attributePaths = {"permissao"})
	    List<Usuario> findAll();
//
//	    @Query("select f from Usuario f where f.permissao.nome_permissao = :permissaoNome_permissao")
//	    List<Usuario> buscarPorPermissao(String nome_permissao);
//	    
//	    @Query("select f from Usuario f where f.permissao.nome_permissao <> :permissaoNome_permissao")
//	    List<Usuario> buscarPorPermissaoExceto(String permissaoNome_permissao);
//
//	    List<Usuario> findByPermissaoNomeNot(String permissaoNome_permissao);
//
//	    List<Usuario> findByPermissaoNome(String permissaoNome_permissao);

	    Optional<Usuario> findByEmail(String email);
}
