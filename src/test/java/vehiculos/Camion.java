package vehiculos;

public class Camion extends Vehiculo{
	private int ejes ;
	private static int camionN;
	public Camion(String placa,String nombre, int precio, int peso,Fabricante fabricante,int ejes){
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes= ejes;
		camionN+=1;
	}
	public static int getCamionN() {
		return camionN;
	}
	public static void setCamionN(int camionN) {
		Camion.camionN = camionN;
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}