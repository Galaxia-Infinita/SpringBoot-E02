package idat.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.interfaceServicio.IcategoriaService;
import idat.edu.pe.interfaces.ICategoria;
import idat.edu.pe.modelo.Categoria;

@Service
public class CategoriaService implements IcategoriaService{

	@Autowired
	private ICategoria data;
	
	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return (List<Categoria>)data.findAll();
	}

	@Override
	public Optional<Categoria> listarCOD_CAT(int COD_CAT) {
		// TODO Auto-generated method stub
		return data.findById(COD_CAT);
	}

	@Override
	public int guardarCategoria(Categoria c) {
		int res=0;
		Categoria categoria=data.save(c);
		if(!categoria.equals(null)) 
		{
			res=1;
		}
		return res;
	}

	@Override
	public void borrarCategoria(int COD_CAD) {
		// TODO Auto-generated method stub
		data.deleteById(COD_CAD);
	}

}
