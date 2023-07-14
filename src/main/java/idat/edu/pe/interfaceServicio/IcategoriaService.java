package idat.edu.pe.interfaceServicio;

import java.util.List;
import java.util.Optional;

import idat.edu.pe.modelo.Categoria;

public interface IcategoriaService {
	public List<Categoria> listar();
	public Optional<Categoria>listarCOD_CAT(int COD_CAT); 
	public int guardarCategoria(Categoria c);
	public void borrarCategoria(int COD_CAT);
}
