package br.org.catolica.interfaces;

import java.util.List;

import br.org.catolica.entity.Grupo;
import br.org.catolica.entity.Grupo;

public interface GrupoDAO {

	void salva(Grupo a);

	List<Grupo> lista();
	
	void remove(Grupo a);
	
	void atualiza(Grupo a);
	
	Grupo buscaId(Long id);
}
