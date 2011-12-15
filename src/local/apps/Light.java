package local.apps;

public class Light {
	private boolean lightOn;
	private boolean lightOff;
	
	
	public Light(){
		lightOff = false;
		lightOn = false;
	}
	
	public void turnOn(){
		lightOff = false;
		lightOn = true;
	}
	
	public void turnOff(){
		lightOff = true;
		lightOn = false;
	}
}
