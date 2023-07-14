package idat.edu.pe.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.modelo.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer>{

}
