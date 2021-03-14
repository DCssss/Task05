package by.md5620.Task05.finalTask.entity.electronic;

import by.md5620.Task05.finalTask.entity.Appliance;

public abstract class PortableElectronic extends Appliance {

    private double displayInches;
    private int batteryCapacity;
    private int memoryRam;

    public PortableElectronic(String manufacturer, int price, double displayInches, int batteryCapacity, int memoryRam) {
        super(manufacturer, price);
        this.displayInches = displayInches;
        this.batteryCapacity = batteryCapacity;
        this.memoryRam = memoryRam;
    }

    public abstract void boostProcessor();

    public abstract void expandMemory();

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		long temp;
		temp = Double.doubleToLongBits(displayInches);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + memoryRam;
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
		PortableElectronic other = (PortableElectronic) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (Double.doubleToLongBits(displayInches) != Double.doubleToLongBits(other.displayInches))
			return false;
		if (memoryRam != other.memoryRam)
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "PortableComputer " + "Display Inches: " + displayInches + ", Battery Capacity: " + batteryCapacity
                + ", Memory Ram: " + memoryRam;
    }
    
    
}
