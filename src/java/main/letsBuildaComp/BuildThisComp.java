package letsBuildaComp;

import java.util.Scanner;

public class BuildThisComp {

	public static void main(String[] args) {

		Scanner userScanner = new Scanner(System.in);
		String compType = null;
		String userInput = null;
		boolean compTypeDefined = false;
		boolean userFailed = true;
		int userRAM = 0;
		Storage userStorage = null;
		GPU userGPU = null;
		MoBo userMoBo = null;
		CPU userCPU = null;
		Case userCompCase = null;
		Monitor userMonitor = null;
		Keyboard userKeys = null;
		Mouse userMouse = null;
		Speakers userSpeakers = null;
		int userPSU = 0;
		
		//Asks user for type of computer to build
		do {
			System.out.println("What type of computer would you like to build?");
			System.out.println("gaming laptop, gaming desktop, generic laptop, generic desktop");
			
			compType = userScanner.nextLine();
			switch (compType) {
			case "gaming laptop":
				compTypeDefined = true;
				break;
			case "gaming desktop":
				compTypeDefined = true;
				break;
			case "generic laptop":
				compTypeDefined = true;
				break;
			case "generic desktop":
				compTypeDefined = true;
				break;
			default:
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (!compTypeDefined);

		//Asks user for amount of userRAM in multiples of 4GB
		do {
			System.out.println("How much RAM (in GB) would you like?");
			System.out.println("(Please specify in a multiple of 4GB)");
			
			userInput = userScanner.nextLine();
			userRAM = Integer.parseInt(userInput);
		} while (!(userRAM % 4 == 0));
		
		//Asks user for storage type
		do {
			userFailed = true;
			System.out.println("Would you like a HD or SSD?");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("hd")) {
				userFailed = false;
				userStorage = Storage.HD;
			} else if (userInput.equalsIgnoreCase("ssd")) {
				userFailed = false;
				userStorage = Storage.SSD;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for GPU type
		do {
			userFailed = true;
			System.out.println("Would you like an NVidia or AMD graphics card?");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("nvidia")) {
				userFailed = false;
				userGPU = GPU.NVidia;
			} else if (userInput.equalsIgnoreCase("amd")) {
				userFailed = false;
				userGPU = GPU.AMD;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for MoBo type
		do {
			userFailed = true;
			System.out.println("Would you like a cheap or pricy motherboard?");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("cheap")) {
				userFailed = false;
				userMoBo = MoBo.cheap;
			} else if (userInput.equalsIgnoreCase("pricy")) {
				userFailed = false;
				userMoBo = MoBo.pricy;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for CPU
		do {
			userFailed = true;
			System.out.println("Would you like an Intel or AMD processor?");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("intel")) {
				userFailed = false;
				userCPU = CPU.Intel;
			} else if (userInput.equalsIgnoreCase("amd")) {
				userFailed = false;
				userCPU = CPU.AMD;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for computer case style
		do {
			userFailed = true;
			System.out.println("What type of case would you like?");
			System.out.println("(Midtower, fulltower, or none)");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("midtower")) {
				userFailed = false;
				userCompCase = Case.midtower;
			} else if (userInput.equalsIgnoreCase("fulltower")) {
				userFailed = false;
				userCompCase = Case.fulltower;
			} else if (userInput.equalsIgnoreCase("none")) {
				userFailed = false;
				userCompCase = Case.none;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for monitor type
		do {
			userFailed = true;
			System.out.println("Would you like a curved, ultrawide, standard, or builtin monitor?");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("curved")) {
				userFailed = false;
				userMonitor = Monitor.curved;
			} else if (userInput.equalsIgnoreCase("ultrawide")) {
				userFailed = false;
				userMonitor = Monitor.ultrawide;
			} else if (userInput.equalsIgnoreCase("standard")) {
				userFailed = false;
				userMonitor = Monitor.standard;
			} else if (userInput.equalsIgnoreCase("builtin")) {
				userFailed = false;
				userMonitor = Monitor.builtin;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for keyboard type
		do {
			userFailed = true;
			System.out.println("Would you like a mechanical, standard, or builtin keyboard?");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("mechanical")) {
				userFailed = false;
				userKeys = Keyboard.mechanical;
			} else if (userInput.equalsIgnoreCase("standard")) {
				userFailed = false;
				userKeys = Keyboard.standard;
			} else if (userInput.equalsIgnoreCase("builtin")) {
				userFailed = false;
				userKeys = Keyboard.builtin;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for mouse type
		do {
			userFailed = true;
			System.out.println("Would you like a wireless, wired, or gaming mouse?");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("wireless")) {
				userFailed = false;
				userMouse = Mouse.wireless;
			} else if (userInput.equalsIgnoreCase("wired")) {
				userFailed = false;
				userMouse = Mouse.wired;
			} else if (userInput.equalsIgnoreCase("gaming")) {
				userFailed = false;
				userMouse = Mouse.gaming;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for speaker type
		do {
			userFailed = true;
			System.out.println("What type of speakers would you like?");
			System.out.println("(Please enter subwoofer, nosub, or none)");
			
			userInput = userScanner.nextLine();
			
			if (userInput.equalsIgnoreCase("subwoofer")) {
				userFailed = false;
				userSpeakers = Speakers.subwoofer;
			} else if (userInput.equalsIgnoreCase("nosub")) {
				userFailed = false;
				userSpeakers = Speakers.nosub;
			} else if (userInput.equalsIgnoreCase("none")) {
				userFailed = false;
				userSpeakers = Speakers.none;
			} else {
				System.out.println("That is not a valid choice.  Please try again.");
			}
		} while (userFailed);	
		
		//Asks user for wattage of power supply
		do {
			System.out.println("What size power supply do you want?");
			System.out.println("(Select a wattage between 250W and 1500W)");
			
			userInput = userScanner.nextLine();
			userPSU = Integer.parseInt(userInput);
		} while (!((userPSU >= 250) && (userPSU <= 1500)));
		
		
		//Builds a computer of the correct type, prints the parts included,
		//checks to make sure the correct part types are included,
		//and checks to make sure the computer will power up.
		switch (compType) {
		case "gaming laptop":
			GamingLaptop melted = new GamingLaptop(userRAM, userStorage, userGPU, userMoBo, userCPU, userCompCase, 
					userMonitor, userKeys, userMouse, userSpeakers, userPSU);
			
			melted.printParts();
			melted.checkLaptop();
			melted.powersUp();
			break;
		case "gaming desktop":
			GamingDesktop sweetComp = new GamingDesktop(userRAM, userStorage, userGPU, userMoBo, userCPU, userCompCase, 
					userMonitor, userKeys, userMouse, userSpeakers, userPSU);
			
			sweetComp.printParts();
			sweetComp.checkDesktop();
			sweetComp.powersUp();
			break;
		case "generic laptop":
			GenericLaptop portable = new GenericLaptop(userRAM, userStorage, userGPU, userMoBo, userCPU, userCompCase, 
					userMonitor, userKeys, userMouse, userSpeakers, userPSU);
			
			portable.printParts();
			portable.checkLaptop();
			portable.powersUp();
			break;
		case "generic desktop":
			GenericDesktop wasteOfCash = new GenericDesktop(userRAM, userStorage, userGPU, userMoBo, userCPU, userCompCase, 
					userMonitor, userKeys, userMouse, userSpeakers, userPSU);

			wasteOfCash.printParts();
			wasteOfCash.checkDesktop();
			wasteOfCash.powersUp();
			break;
		default:
			System.out.println("That is not a valid choice.  Please try again.");
		}
			
		userScanner.close();
	}

}
