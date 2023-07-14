package idat.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.interfaceServicio.IproductoService;
import idat.edu.pe.interfaces.IProducto;
import idat.edu.pe.modelo.Producto;

@Service
public class ProductoService implements IproductoService{

	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarCOD_PRO(int COD_PRO) {
		// TODO Auto-generated method stub
		return data.findById(COD_PRO);
	}

	@Override
	public int guardarProducto(Producto p) {
		int res=0;
		Producto producto=data.save(p);
		if(!producto.equals(null)) 
		{
			res=1;
		}
		return res;
	}

	@Override
	public void borrarProducto(int COD_PRO) {
		// TODO Auto-generated method stub
		data.deleteById(COD_PRO);
	}

}
