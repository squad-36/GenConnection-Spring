package gen.connection.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gen.connection.entidades.Permissao;


public interface PermissaoRepositorio extends JpaRepository<Permissao, Long> {
    
}
