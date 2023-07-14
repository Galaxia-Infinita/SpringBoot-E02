package idat.edu.pe.interfaceServicio;

import java.util.List;
import java.util.Optional;

import idat.edu.pe.modelo.Producto;

public interface IproductoService {
	public List<Producto> listar();
	public Optional<Producto>listarCOD_PRO(int COD_PRO); 
	public int guardarProducto(Producto p);
	public void borrarProducto(int COD_PRO);
}
