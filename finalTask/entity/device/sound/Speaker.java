package by.md5620.Task05.finalTask.entity.device.sound;

import by.md5620.Task05.finalTask.entity.device.Device;

public class Speaker extends Device {

    private int numberOfSpeakers;
    private Range frequencyRange;
    private int cordLength;

    public Speaker(String manufacturer, int price, int powerConsumption, int numberOfSpeakers, Range frequencyRange, int cordLength) {
        super(manufacturer, price, powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public void switchOn() {
        
    }

    @Override
    public void switchOff() {
        
    }

    public void playSound() {
        
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public Range getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(Range frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cordLength;
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		result = prime * result + numberOfSpeakers;
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
		Speaker other = (Speaker) obj;
		if (cordLength != other.cordLength)
			return false;
		if (frequencyRange == null) {
			if (other.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(other.frequencyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "MANUFACTURER=" + getManufacturer() + ", PRICE=" + getPrice() + ", POWER_CONSUMPTION=" + getPowerConsumption()
                + ", NUMBER_OF_SPEAKERS=" + getNumberOfSpeakers() + ", FREQUENCY_RANGE=" + getFrequencyRange()
                + ", CORD_LENGTH=" + getCordLength();
    }
}
