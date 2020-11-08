package facade;

public class Cpu {
	private int contadores = -1;
	private int memoriaRam = 0;
	private int[] canales = new int[4];
	private boolean voltajeOk;
	private boolean energiaDispositivosOk;
	private boolean contadoresOk;
	private boolean biosOk;
	private boolean hardwareOk;
	private boolean entradasOk;
	private boolean sectorArranqueOk;
	private boolean bootOk;
	private boolean soOk;
	private boolean listoOk;

	public Cpu() {

	}

	public boolean enviarVoltaje(int voltaje) {
		if (voltaje >= 100 && voltaje <= 120) {
			voltajeOk = true;
		}
		return voltajeOk;
	}

	public boolean enviarEnergiaADispositivos() {
		if (voltajeOk) {
			energiaDispositivosOk = true;
		}
		return energiaDispositivosOk;
	}

	public boolean resetearContadores() {
		if (energiaDispositivosOk) {
			contadores = 0;
			contadoresOk = true;
		}
		return contadoresOk;
	}

	public boolean revisarBios() {
		if (voltajeOk && energiaDispositivosOk && contadoresOk) {
			biosOk = true;
		}
		return biosOk;
	}

	public boolean revisarHardwareConectado() {
		if (biosOk) {
			hardwareOk = true;
		}
		return hardwareOk;
	}

	public void asignarCanales() {
		if (hardwareOk) {
			for (int i = 0; i < canales.length; i++) {
				canales[i] = (i + 1) * 4;

			}
		}
	}

	public void revisarMemoria() {
		if (canales[0] == 4) {
			memoriaRam = 2048;
		}
	}

	public boolean revisarEntradas() {
		if (memoriaRam > 0) {
			entradasOk = true;
		}
		return entradasOk;
	}

	public boolean buscaSectorArranque() {
		if (entradasOk) {
			bootOk = true;
		}
		return bootOk;
	}

	public boolean cargarBoot() {
		if (sectorArranqueOk) {
			bootOk = true;
		}
		return bootOk;
	}

	public boolean cargarSistemaOperativo() {
		if (bootOk) {
			soOk = true;
		}
		return soOk;
	}

	public boolean cpuLista() {
		if (soOk) {
			listoOk = true;
		}
		return listoOk;
	}
}
