package vehiculos;

public class Camioneta extends Vehiculos {
	private boolean volco ;
	private static int camionetaN;
	public Camioneta(String placa,int puertas,int velocidadMaxima ,String nombre, int precio, int peso,String traccion,Fabricante fabricante,boolean volco){
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco= volco;
		camionetaN+=1;
	}
	public static int getCamionetaN() {
		return camionetaN;
	}
	public static void setCamionetaN(int camionetaN) {
		Camioneta.camionetaN = camionetaN;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

}