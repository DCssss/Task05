package by.md5620.Task05.finalTask.entity.electronic.portable;

import by.md5620.Task05.finalTask.entity.electronic.PortableElectronic;

public class Laptop extends PortableElectronic {

    private String os;
    private int memorySystem;
    private double cpu;

    public Laptop(String manufacturer, int price, int batteryCapacity, String os, int memoryRam, int memorySystem, double cpu, double displayInches) {
        super(manufacturer, price, displayInches, batteryCapacity, memoryRam);
        this.os = os;
        this.memorySystem = memorySystem;
        this.cpu = cpu;
    }

    public void playGames() {}

    public void work() {}

    @Override
    public void switchOn() {}

    @Override
    public void switchOff() {}

    @Override
    public void boostProcessor() {}

    @Override
    public void expandMemory() {}

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemorySystem() {
        return memorySystem;
    }

    public void setMemorySystem(int memorySystem) {
        this.memorySystem = memorySystem;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cpu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + memorySystem;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (memorySystem != other.memorySystem)
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "MANUFACTURER=" + getManufacturer() + ", PRICE=" + getPrice() + ", BATTERY_CAPACITY=" + getBatteryCapacity()
                + ", OS=" + getOs() + ", MEMORY_RAM=" + getMemoryRam() + ", SYSTEM_MEMORY=" + getMemorySystem()
                + ", CPU=" + getCpu() + ", DISPLAY_INCHES=" + getDisplayInches();
    }
}
