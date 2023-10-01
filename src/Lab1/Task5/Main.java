package Lab1.Task5;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Loop", 100,15, 12);
        Item item2 = new Item("Hyawei", 10000,30, 11);
        Item item3 = new Item("Yuiki", 4000,13, 19);

        DeparturePoint departurePoint = new DeparturePoint(new Shipment[]{new Shipment(item1, 1),
                new Shipment(item2, 2),
                new Shipment(item3, 3)
        }, "Drogobich, zaviznya");

        departurePoint.sendShipment("Drogobich, zaviznya", 1);
        for (int i = 1; i < departurePoint.shipments.length; i++) {
            departurePoint.sendShipment("Address" + i, i + 1);
        }

        departurePoint.deleteShipment(2);
        for (Shipment s : departurePoint.shipments) {
            System.out.println(s);
        }
    }
}
