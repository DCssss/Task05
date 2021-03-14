package by.md5620.Task05.finalTask.entity.device.kitchen;

public class Oven extends Kitchen {

    private int capacity;
    private int depth;

    public Oven(String manufacturer, int price, int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        super(manufacturer, price, powerConsumption, weight, height, width);
        this.capacity = capacity;
        this.depth = depth;
    }

    @Override
    public void switchOn() {
    	
    }

    @Override
    public void switchOff() {
    	
    }

    public void heat() {
    	
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacity;
		result = prime * result + depth;
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
		Oven other = (Oven) obj;
		if (capacity != other.capacity)
			return false;
		if (depth != other.depth)
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Manufacturer=" + getManufacturer() + ", PRICE=" + getPrice() + ", POWER_CONSUMPTION=" + getPowerConsumption()
                + ", WEIGHT=" + getWeight() + ", CAPACITY=" + getCapacity() + ", DEPTH=" + getDepth()
                + ", HEIGHT=" + getHeight() + ", WIDTH=" + getWidth();
    }
}
