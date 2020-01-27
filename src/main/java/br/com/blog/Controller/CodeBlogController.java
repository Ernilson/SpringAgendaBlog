/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blog.Controller;

import br.com.blog.Model.Post;
import br.com.blog.ServiceImpl.CadServeImpl;
import java.time.LocalDate;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Convidado
 */
@Controller
public class CodeBlogController {
    
    @Autowired
    private CadServeImpl service;
    
    @GetMapping({"/","/index"})
    public String inicio() {
        return "index";
    }
    
     @RequestMapping(value="/posts", method=RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("post.html");
        List<Post> posts = service.findAll();
        mv.addObject("posts", posts);
        return mv;
    }
     @RequestMapping(value="/posts/{id}", method=RequestMethod.GET)
    public ModelAndView getPostDetails(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("postDetails.html");
        Post post = service.findById(id);
        mv.addObject("post", post);
        return mv;
    }

     @RequestMapping(value="/newpost", method=RequestMethod.GET)
    public String getPostForm(){
        return "postForm";
    }
    
    @RequestMapping(value="/newpost", method=RequestMethod.POST)
    public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
            return "redirect:/newpost";
        }
        
        post.setData(LocalDate.now());
        service.save(post);
        return "redirect:/posts";
    }
    
//    Metodo para excluir dados do cadastro
    @GetMapping("/deletar/{id}")
    public String remover(@PathVariable long id) {
        service.delete(id);
        return "redirect:/posts";
    }
}
