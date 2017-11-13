package com.pluralsight.command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

	public static void main(String args[]) {
		// Light light = new Light();
		// Switch lightSwitch = new Switch();
		//
		// Command toggleCommand = new ToggleCommand(light);
		// lightSwitch.storeAndExecute(toggleCommand);
		// lightSwitch.storeAndExecute(toggleCommand);
		// lightSwitch.storeAndExecute(toggleCommand);
		
		
		
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch(); 
		
		Command toggleCommand = new ToggleCommand(bedroomLight);
		
		lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		
		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(bedroomLight);
		Command allLightsCommand = new AllLightsCommand(lights);
		
		lightSwitch.storeAndExecute(allLightsCommand);
	}
}
