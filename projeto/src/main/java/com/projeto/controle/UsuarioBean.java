package com.projeto.controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.security.Authentication;
import org.springframework.security.context.SecurityContext;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.security.userdetails.User;
import org.springframework.stereotype.Controller;

import com.projeto.entidade.Usuario;

@Controller("UsuarioBean")
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario;
 
    public String getUsuario() {
    	try {
    		usuario = new Usuario();
            SecurityContext context = SecurityContextHolder.getContext();
           if (context instanceof SecurityContext){
                Authentication authentication = context.getAuthentication();
                if (authentication instanceof Authentication){
                    usuario.setNome(((User)authentication.getPrincipal()).getUsername());
                    
                }
                
            }
           
		} catch (Exception e) {
			
		}
    	return  usuario.getNome();
    }
 
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}