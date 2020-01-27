package br.com.blog.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.blog.Model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}
