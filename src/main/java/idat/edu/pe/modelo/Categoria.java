package idat.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int COD_CAT;
	private String NOM_CAT;
	private String EST_CAT;
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(int cOD_CAT, String nOM_CAT, String eST_CAT) {
		super();
		this.COD_CAT = cOD_CAT;
		this.NOM_CAT = nOM_CAT;
		this.EST_CAT = eST_CAT;
	}

	public int getCOD_CAT() {
		return COD_CAT;
	}

	public void setCOD_CAT(int cOD_CAT) {
		this.COD_CAT = cOD_CAT;
	}

	public String getNOM_CAT() {
		return NOM_CAT;
	}

	public void setNOM_CAT(String nOM_CAT) {
		this.NOM_CAT = nOM_CAT;
	}

	public String getEST_CAT() {
		return EST_CAT;
	}

	public void setEST_CAT(String eST_CAT) {
		this.EST_CAT = eST_CAT;
	}

}
