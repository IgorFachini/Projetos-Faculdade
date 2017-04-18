package br.org.catolica.interfaces;

import java.util.List;

import br.org.catolica.entity.Contato;

public interface ContatoDAO {

	void salva(Contato a);

	List<Contato> lista();
	
	void remove(Contato a);
	
	void atualiza(Contato a);
	
	Contato buscaId(Long id);
}
