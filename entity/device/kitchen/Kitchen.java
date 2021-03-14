package by.md5620.Task05.finalTask.entity.device.kitchen;

import by.md5620.Task05.finalTask.entity.device.Device;

public abstract class Kitchen extends Device {

    private int weight;
    private double height;
    private double width;

    public Kitchen(String manufacturer, int price, int powerConsumption, int weight, double height, double width) {
        super(manufacturer, price, powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + weight;
		temp = Double.doubleToLongBits(width);
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
		Kitchen other = (Kitchen) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (weight != other.weight)
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Kitchen Appliance: " + "Weight: " + weight + ", Height: " + height + ", Width: " + width;
    }
}
