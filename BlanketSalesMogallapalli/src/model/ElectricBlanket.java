package model;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 26, 2022  
*/
public class ElectricBlanket extends Blanket {
	private int heatSettings;
	private boolean hasAutoShutOff;
	public ElectricBlanket() {
		super();
		this.heatSettings = 1;
		this.hasAutoShutOff = false;
	}
	public ElectricBlanket(String size, String color, String material, int heatSettings, boolean hasAutoShutOff) {
		super(size, color, material);
		this.heatSettings = heatSettings;
		this.hasAutoShutOff = hasAutoShutOff;
	}
	public int getHeatSettings() {
		return heatSettings;
	}
	public void setHeatSettings(int heatSettings) {
		this.heatSettings = heatSettings;
		if (1<=this.heatSettings && this.heatSettings<=5) {
			this.heatSettings = heatSettings;
		}else {
			this.heatSettings = 1;
		}
	}
	public boolean isHasAutoShutOff() {
		return hasAutoShutOff;
	}
	public void setHasAutoShutOff(boolean hasAutoShutOff) {
		this.hasAutoShutOff = hasAutoShutOff;
		if (this.hasAutoShutOff == true) {
			this.price += 5.75; // had to change access type of price to public, see if this is fine
		}
	}
	@Override
	public String featureReport() {
		String autoShutOffMessage = "";
		String settingsMessage = "";
		if (isHasAutoShutOff()) {
			autoShutOffMessage = "with auto shut off";
		}else {
			autoShutOffMessage = "without auto shut off";
		}
		
		if (getHeatSettings() == 1) {
			settingsMessage = "setting";
		}else {
			settingsMessage = "settings";
		}
		return super.featureReport() + " including " + getHeatSettings() + " " + settingsMessage + " " +autoShutOffMessage;
	}
}
