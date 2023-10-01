package Lab1.Task5;

public class Shipment {
    private ShipmentVariant variantOfShipment;
    private Item item;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Shipment(Item item, int id) {
        this.item = item;
        this.id = id;
    }

    public ShipmentVariant getVariantOfShipment() {
        return variantOfShipment;
    }

    public void setVariantOfShipment(ShipmentVariant variantOfShipment) {
        this.variantOfShipment = variantOfShipment;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "variantOfShipment=" + variantOfShipment +
                ", id=" + id +
                '}';
    }
}
