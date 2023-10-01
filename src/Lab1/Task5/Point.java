package Lab1.Task5;

public class Point extends Rules {
    protected static final String[] addresses = {"Drogobich, zaviznya", "Lviv, Kulparkivska"};
    protected Shipment[] shipments;
    protected String address;

    public Point(Shipment[] shipments, String address) {
        this.shipments = shipments;
        this.address = address;
    }

    public Shipment[] getShipments() {
        return shipments;
    }

    public void setShipments(Shipment[] shipments) {
        this.shipments = shipments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void sendShipment(String address, int id) {
        int numberInArray = 0;
        if ((numberInArray = containsShipment(id)) == -1) {
            return;
        }

        if (!containsAddress(address)) {
            shipments[numberInArray].setVariantOfShipment(ShipmentVariant.BICYCLE);
        } else {
            if (shipments[numberInArray].getItem().getWeight() < Rules.MAX_WEIGHT_BICYCLE &&
                    shipments[numberInArray].getItem().getSize() < Rules.MAX_SIZE_BICYCLE) {
                shipments[numberInArray].setVariantOfShipment(ShipmentVariant.BICYCLE);
            } else if (shipments[numberInArray].getItem().getWeight() < Rules.MAX_WEIGHT_MICRO_BUS &&
                    shipments[numberInArray].getItem().getSize() < Rules.MAX_SIZE_MICRO_BUS) {
                shipments[numberInArray].setVariantOfShipment(ShipmentVariant.MICRO_BUS);
            } else if (shipments[numberInArray].getItem().getWeight() < Rules.MAX_WEIGHT_TRAIN &&
                    shipments[numberInArray].getItem().getSize() < Rules.MAX_SIZE_TRAIN) {
                shipments[numberInArray].setVariantOfShipment(ShipmentVariant.TRAIN);
            } else if (shipments[numberInArray].getItem().getWeight() < Rules.MAX_WEIGHT_TRUCK &&
                    shipments[numberInArray].getItem().getSize() < Rules.MAX_SIZE_TRUCK) {
                shipments[numberInArray].setVariantOfShipment(ShipmentVariant.TRUCK);
            } else {
                System.out.println("Your package is too big or too heavy.");
            }
        }
    }

    private int containsShipment(int id) {
        for (int i = 0; i < shipments.length; i++) {
            if (shipments[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private boolean containsAddress(String address) {
        for (String s : addresses) {
            if (s.equals(address)) {
                return true;
            }
        }
        return false;
    }

    public void deleteShipment(int id) {
        Shipment[] tempShipments = new Shipment[shipments.length - 1];
        int i = 0;
        for (Shipment s : shipments) {
            if (s.getId() != id) {
                tempShipments[i++] = s;
            }
        }

        shipments = tempShipments;
    }
}