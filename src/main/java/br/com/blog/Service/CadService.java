package br.com.blog.Service;

import java.util.List;

import br.com.blog.Model.*;

public interface CadService {

	List<Post> findAll();
	Post findById (long id);
	Post save(Post p);
        void delete(Long id);
}
