package by.md5620.Task05.finalTask.entity.electronic.portable;

import by.md5620.Task05.finalTask.entity.electronic.PortableElectronic;

public class TabletPC extends PortableElectronic {

    private int flashMemoryCapacity;
    private String colour;

    public TabletPC(String manufacturer, int price, int batteryCapacity, double displayInches, int memoryRam, int flashMemoryCapacity, String colour) {
        super(manufacturer, price, displayInches, batteryCapacity, memoryRam);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.colour = colour;
    }

    @Override
    public void boostProcessor() {
    	
    }

    @Override
    public void expandMemory() {
    	
    }

    @Override
    public void switchOn() {
    	
    }

    @Override
    public void switchOff() {
    	
    }

    public void draw() {
    	
    }

    public void browse() {
    	
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + flashMemoryCapacity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "MANUFACTURER=" + getManufacturer() + ", PRICE=" + getPrice() + ", BATTERY_CAPACITY=" + getBatteryCapacity()
                + ", DISPLAY_INCHES=" + getDisplayInches() + ", MEMORY_RAM=" + getMemoryRam()
                + ", FLASH_MEMORY_CAPACITY=" + getFlashMemoryCapacity() + ", COLOR=" + getColour();
    }
}
