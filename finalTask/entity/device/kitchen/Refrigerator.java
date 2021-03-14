package by.md5620.Task05.finalTask.entity.device.kitchen;

public class Refrigerator extends Kitchen {

    private int freezerCapacity;
    private double overallCapacity;

    public Refrigerator(String manufacturer, int price, int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width) {
        super(manufacturer, price, powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    @Override
    public void switchOn() {}

    @Override
    public void switchOff() {}

    public void refrigerate() {}

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + freezerCapacity;
		long temp;
		temp = Double.doubleToLongBits(overallCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity != other.freezerCapacity)
			return false;
		if (Double.doubleToLongBits(overallCapacity) != Double.doubleToLongBits(other.overallCapacity))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "MANUFACTURER=" + getManufacturer() + ", PRICE=" + getPrice() + ", POWER_CONSUMPTION=" + getPowerConsumption()
                + ", WEIGHT=" + getWeight() + ", FREEZER_CAPACITY=" + getFreezerCapacity() + ", OVERALL_CAPACITY=" + getOverallCapacity()
                + " HEIGHT=" + getHeight() + " WIDTH=" + getWidth();
    }
}
