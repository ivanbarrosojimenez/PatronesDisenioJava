package pruebas;

import facade.Cpu;

public class PruebaClienteSinFachada {
	
	private Cpu miCpu;
	
	
	public PruebaClienteSinFachada() {
		this.miCpu = new Cpu();
	}
	
	public void encederCpu() {
		miCpu.enviarVoltaje(110);
		miCpu.enviarEnergiaADispositivos();
		miCpu.resetearContadores();
		miCpu.revisarBios();
		miCpu.revisarHardwareConectado();
		miCpu.asignarCanales();
		miCpu.revisarMemoria();
		miCpu.revisarEntradas();
		miCpu.buscaSectorArranque();
		miCpu.cargarBoot();
		miCpu.cargarSistemaOperativo();
		if(miCpu.cpuLista()) {
			System.out.println("CPU encendida y lista para trabaajar");
		}
	}
	
	public void trabajar() {
		System.out.println("Comienzo a trabajar");
		
	}
	public static void main(String[] args) {
		PruebaClienteSinFachada csf = new PruebaClienteSinFachada();
		csf.encederCpu();
		csf.trabajar();

	}

}
