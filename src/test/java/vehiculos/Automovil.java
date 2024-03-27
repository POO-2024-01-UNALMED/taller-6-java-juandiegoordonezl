package vehiculos;

public class Automovil extends Vehiculos {
	private int puestos;
	private static int AutomovilesN;
	public Automovil(String placa,int puertas,int velocidadMaxima ,String nombre, int precio, int peso,String traccion,Fabricante fabricante,int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos= puestos;
		AutomovilesN+=1;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public static int getAutomovilesN() {
		return AutomovilesN;
	}
	public static void setAutomovilesN(int automovilesN) {
		AutomovilesN = automovilesN;
	}
	

}
