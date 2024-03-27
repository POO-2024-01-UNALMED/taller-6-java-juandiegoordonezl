package vehiculos;
import java.util.*;

public class Pais {
	private String nombre;
	public static ArrayList<Pais> paises=new ArrayList<Pais>();
	private int ventas;
	
	public Pais(String nombre) {
		this.nombre= nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais stonks= new Pais("y");
		for (Pais i:paises) {
			if (i.ventas>stonks.ventas) {
				stonks=i;
			}
		}
		return stonks;
	}
	
	public void masVentas() {
		ventas++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
