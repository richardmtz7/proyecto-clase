package co.com.itsense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.itsense.models.Articulo;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, Long> {
	

	
}
