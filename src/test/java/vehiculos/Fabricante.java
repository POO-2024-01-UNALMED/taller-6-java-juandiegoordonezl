package vehiculos;
import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int ventas;
	static ArrayList<Fabricante> fabricantes=new ArrayList<Fabricante>();
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre= nombre;
		this.pais=pais;
	}
	
	public void masVentas() {
		ventas++;
		this.pais.masVentas();
	}
	
	public static Fabricante fabricaMayorVentas() {
		Pais y= new Pais("y");
		Fabricante fabrica= new Fabricante("x",y);
		for (Fabricante i:fabricantes) {
			if (i.ventas>fabrica.ventas) {
				fabrica=i;
			}
		}
		return fabrica;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
