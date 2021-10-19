package microServico.dao;


import microServico.ententies.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

    Usuario findById(String nome);


}
