package letsBuildaComp;

public class GamingDesktop extends Computer implements Desktop {

		int ram = 16;
		Storage storage = Storage.SSD;
		GPU gpu = GPU.NVidia;
		MoBo mobo = MoBo.pricy;
		CPU cpu = CPU.Intel;
		Case compCase = Case.midtower;
		Monitor monitor = Monitor.ultrawide;
		Keyboard keyboard = Keyboard.mechanical;
		Mouse mouse = Mouse.gaming;
		Speakers speakers = Speakers.subwoofer;
		int psu = 750;

		public GamingDesktop(int ram, Storage storage, GPU gpu, MoBo mobo, CPU cpu, Case compCase, Monitor monitor,
				Keyboard keyboard, Mouse mouse, Speakers speakers, int psu) {
			super();
			this.ram = ram;
			this.storage = storage;
			this.gpu = gpu;
			this.mobo = mobo;
			this.cpu = cpu;
			this.compCase = compCase;
			this.monitor = monitor;
			this.keyboard = keyboard;
			this.mouse = mouse;
			this.speakers = speakers;
			this.psu = psu;
		}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public Storage getStorage() {
			return storage;
		}

		public void setStorage(Storage storage) {
			this.storage = storage;
		}

		public GPU getGpu() {
			return gpu;
		}

		public void setGpu(GPU gpu) {
			this.gpu = gpu;
		}

		public MoBo getMobo() {
			return mobo;
		}

		public void setMobo(MoBo mobo) {
			this.mobo = mobo;
		}

		public CPU getCpu() {
			return cpu;
		}

		public void setCpu(CPU cpu) {
			this.cpu = cpu;
		}

		public Case getCompCase() {
			return compCase;
		}

		public void setCompCase(Case compCase) {
			this.compCase = compCase;
		}

		public Monitor getMonitor() {
			return monitor;
		}

		public void setMonitor(Monitor monitor) {
			this.monitor = monitor;
		}

		public Keyboard getKeyboard() {
			return keyboard;
		}

		public void setKeyboard(Keyboard keyboard) {
			this.keyboard = keyboard;
		}

		public Mouse getMouse() {
			return mouse;
		}

		public void setMouse(Mouse mouse) {
			this.mouse = mouse;
		}

		public Speakers getSpeakers() {
			return speakers;
		}

		public void setSpeakers(Speakers speakers) {
			this.speakers = speakers;
		}

		public int getPsu() {
			return psu;
		}

		public void setPsu(int psu) {
			this.psu = psu;
		}

		@Override
		public void powersUp() {
			if (psu >= 750) {
				System.out.println("Your computer powers up.");
			} else {
				System.out.println("You will need a bigger power supply.  Try something 750W or larger.");
			}
		}

		@Override
		public void checkDesktop() {
			if (speakers.equals(Speakers.none)) {
				System.out.println("This is a desktop, you may want speakers to hear sounds.");
			}
			if (compCase.equals(Case.none)) {
				System.out.println("You need a computer case for a desktop.  I hope you already own one.");
			}
			if (keyboard.equals(Keyboard.builtin)) {
				System.out.println("There is no built in keyboard for a desktop.  Try again.");
			}
			if (monitor.equals(Monitor.builtin)) {
				System.out.println("There is no built in monitor for a desktop.  Try again.");
			}
		}

		@Override
		public void printParts() {
			System.out.println("Your computer has " + ram + "GBs of ram, a " + storage.toString() + ", an " + gpu.toString() + 
					" graphics card, a " + mobo.toString() + " mother board, an " + cpu.toString() + " processor in a " +
					compCase.toString() + " case with a " + psu + "W power supply, a " + monitor.toString() + " monitor, a " +
					keyboard.toString() + " keyboard, a " + mouse.toString() + " mouse, and " + speakers.toString() + " speakers.");
		}
		
}


