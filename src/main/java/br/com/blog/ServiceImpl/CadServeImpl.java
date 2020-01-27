package br.com.blog.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.blog.Model.Post;
import br.com.blog.Repository.CadRepository;
import br.com.blog.Service.CadService;
import java.util.ArrayList;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CadServeImpl implements CadService{

	@Autowired
	private CadRepository cr;
	
	@Override
	public List<Post> findAll() {
	List<Post> cm = new ArrayList<>();	//sortByIdAsc()
		return cr.findAll();
	}

	@Override
	public Post findById(long id) {
		return cr.findById(id).get();
	}

	@Override
	public Post save(Post p) {
		return cr.save(p);
	}
        
//        private Sort sortByIdAsc(){            
//            return new Sort(Sort.Direction.DESC, id);
//        }

    @Override
    public void delete(Long id) {
        cr.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

}
