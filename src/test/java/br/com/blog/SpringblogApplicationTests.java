//package br.com.blog;
//
//import br.com.blog.Model.Post;
//import br.com.blog.Model.Usuario;
//import br.com.blog.ServiceImpl.CadServeImpl;
//import br.com.blog.ServiceImpl.UServiceImpl;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class SpringblogApplicationTests {
//    
//   @Autowired
//   private CadServeImpl cs;

//	@Test
//	public void contextLoads() {
//            Post p = new Post();
//            
//            p.setAutor("Davi");
//            p.setTitul("Louvor");
//            p.setText("Louvar-te-ei Senhor de todo o meu coração");
//            p.setData(LocalDate.now());
//            
//            cs.save(p);
//            
//	}
//        
        // -----------------------LISTAR-TODOS--------------------------
    
//    @Test
//    public void listar(){
////        List<Post> cad = cs.findAll();
//        System.out.println("Total de Registra" + cad.size());
//        for (Post cadastroModel : cad) {
//            System.out.println(cadastroModel.getText()+"-"+cadastroModel.getAutor()
//            +"-"+ cadastroModel.getTitul()
//                    +"-"+ cadastroModel.getData());
//            
//        }        
//    }
   
//    UServiceImpl up = new UServiceImpl();
//        
//        Usuario u = new Usuario();
//        u.setLogin("admin");
//        u.setNomeCompleto("Ernilson");
//        u.setSenha("admin");
//      
//        up.save(u);
//    }
//}
