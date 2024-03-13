class Box {
    double width;
    double height;
    double depth;

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight; 

    public BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

class ShipmentCost extends BoxWeight {
    double cost; 

    public ShipmentCost(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
}

public class java_32 {
    public static void main(String args[]) {
        ShipmentCost shipment = new ShipmentCost(10, 20, 15, 10, 3.14);
        double vol;

        vol = shipment.volume();
        System.out.println("Volume of shipment is " + vol);
        System.out.println("Weight of shipment is " + shipment.weight);
        System.out.println("Shipping cost is " + shipment.cost);
    }
}
