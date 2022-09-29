package Java;

class Main{
    public static void main(String[] args) {
        UberX uberX = new UberX("ASG324", new Account("Andres herrera", "INE"),"Toyota","Yaris");
        uberX.setPassenger(4);
        uberX.printDataCar();
    }
}
