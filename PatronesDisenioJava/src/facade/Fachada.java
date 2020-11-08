package facade;

public class Fachada {
	private Cpu miCpu;

	public Fachada() {
		miCpu = new Cpu();
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
		if (miCpu.cpuLista()) {
			System.out.println("CPU encendida y lista para trabaajar");
		}
	}
}
