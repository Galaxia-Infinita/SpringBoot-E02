package idat.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int COD_PRO;
	private int COD_CAT;
	private String NOM_PRO;
	private String DES_PRO;
	private double PRE_PRO;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int cOD_PRO, int cOD_CAT, String nOM_PRO, String dES_PRO, double pRE_PRO) {
		super();
		this.COD_PRO = cOD_PRO;
		this.COD_CAT = cOD_CAT;
		this.NOM_PRO = nOM_PRO;
		this.DES_PRO = dES_PRO;
		this.PRE_PRO = pRE_PRO;
	}

	public int getCOD_PRO() {
		return COD_PRO;
	}

	public void setCOD_PRO(int cOD_PRO) {
		this.COD_PRO = cOD_PRO;
	}

	public int getCOD_CAT() {
		return COD_CAT;
	}

	public void setCOD_CAT(int cOD_CAT) {
		this.COD_CAT = cOD_CAT;
	}

	public String getNOM_PRO() {
		return NOM_PRO;
	}

	public void setNOM_PRO(String nOM_PRO) {
		this.NOM_PRO = nOM_PRO;
	}

	public String getDES_PRO() {
		return DES_PRO;
	}

	public void setDES_PRO(String dES_PRO) {
		DES_PRO = dES_PRO;
	}

	public double getPRE_PRO() {
		return PRE_PRO;
	}

	public void setPRE_PRO(double pRE_PRO) {
		PRE_PRO = pRE_PRO;
	}

}
