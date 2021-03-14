package by.md5620.Task05.finalTask.entity;

public abstract class Appliance {

    private String manufacturer;
    private int price;

    public Appliance(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public abstract void switchOn();

    public abstract void switchOff();

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Appliances " + "manufacturer: " + manufacturer + ", Price: " + price;
    }
    
}
