package idat.edu.pe.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.modelo.Categoria;

@Repository
public interface ICategoria extends CrudRepository<Categoria, Integer>{

}
