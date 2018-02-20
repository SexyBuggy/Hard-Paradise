package urjc.hardParadise.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import urjc.hardParadise.Favorito;
import urjc.hardParadise.Usuario;

public interface FavoritoRepository extends JpaRepository<Favorito, Long> {
	List<Favorito> findByUsuario(Usuario usuario);
}