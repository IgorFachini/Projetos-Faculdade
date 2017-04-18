package br.org.catolica.interfaces;

import java.util.List;

import br.org.catolica.entity.Automovel;

public interface AutomovelDAO {

	void salva(Automovel a);

	List<Automovel> lista();
	
	void remove(Automovel a);
	
	void atualiza(Automovel a);
	
	Automovel buscaId(Long id);
}
