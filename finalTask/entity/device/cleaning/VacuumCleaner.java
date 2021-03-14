package by.md5620.Task05.finalTask.entity.device.cleaning;

import by.md5620.Task05.finalTask.entity.device.Device;

public class VacuumCleaner extends Device {

    private char filerType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(String manufacturer, int price, int powerConsumption, char filerType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super(manufacturer, price, powerConsumption);
        this.filerType = filerType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public void switchOn() {
        
    }

    @Override
    public void switchOff() {
        
    }

    public void clean() {
        
    }

    public char getFilerType() {
        return filerType;
    }

    public void setFilerType(char filerType) {
        this.filerType = filerType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + filerType;
		result = prime * result + motorSpeedRegulation;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filerType != other.filerType)
			return false;
		if (motorSpeedRegulation != other.motorSpeedRegulation)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "MANUFACTURER=" + getManufacturer() + " PRICE=" + getPrice() + ", POWER_CONSUMPTION=" + getPowerConsumption()
                + ", FILTER_TYPE=" + getFilerType() + ", BAG_TYPE=" + getBagType() + ", WAND_TYPE=" + getWandType()
                + ", MOTOR_SPEED_REGULATION=" + getMotorSpeedRegulation() + ", CLEANING_WIDTH=" + getCleaningWidth();
    }
}
