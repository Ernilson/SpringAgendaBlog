package br.com.blog.Repository;

import br.com.blog.Model.*;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CadRepository extends JpaRepository<Post, Long> {

    
}
