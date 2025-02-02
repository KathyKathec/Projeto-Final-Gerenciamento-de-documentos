package ProjetoFinal.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoFinal.ApiGerenciadorDoc.model.Processos;
import ProjetoFinal.ApiGerenciadorDoc.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	List<Processos>findByNroProcessos(int nro_processo);
	
	Processos findById(int id);
	
	List<Processos>findByNumeroOAB(Integer NumeroOAB);
}
