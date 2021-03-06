package com.projeto.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import com.projeto.entidade.Contato;

@Repository("contatoDao")
public class ContatoDaoJpa extends PersistenciaJpa<Contato> implements ContatoDao{

   private static final long serialVersionUID = 1L;

}
