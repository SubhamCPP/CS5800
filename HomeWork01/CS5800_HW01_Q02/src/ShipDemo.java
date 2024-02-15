public class ShipDemo {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        // Initialized the array elements with Ship, CruiseShip, and CargoShip objects
        ships[0] = new Ship("SS Minnow", "1967");
        ships[1] = new CruiseShip("SS Poseidon", "1972", 4000);
        ships[2] = new CargoShip("HMS Bounty", "1784", 50000);

        // Looped through the array, calling the print function for each element
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
