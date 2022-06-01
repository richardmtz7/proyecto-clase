package co.com.itsense.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.itsense.models.Articulo;
import co.com.itsense.repositories.ArticuloRepository;

@Service
public class ArticuloServicesImpl implements ArticuloService {

	@Autowired
	private ArticuloRepository articuloRepository;

	@Transactional
	public void guardar(Articulo articulo) {
		articuloRepository.save(articulo);
	}

	@Transactional
	public void eliminar(Articulo articulo) {
		articuloRepository.delete(articulo);
	}

	@Transactional(readOnly = true)
	public List<Articulo> listarArticulo() {
		return (List<Articulo>) articuloRepository.findAll();
	}

	@Transactional(readOnly = true)
	public Articulo encontrarArticulo(Articulo articulo) {
		return articuloRepository.findById(articulo.getIdArticulo()).orElse(null);
	}

	

}
