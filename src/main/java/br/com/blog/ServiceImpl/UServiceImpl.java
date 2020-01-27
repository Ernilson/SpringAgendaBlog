/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blog.ServiceImpl;

import br.com.blog.Model.Usuario;
import br.com.blog.Repository.UsuarioRepository;
import br.com.blog.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Convidado
 */
@Service
public class UServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository rp;
    
    @Override
    public Usuario save(Usuario u) {
        return rp.save(u);
    }
    
}
