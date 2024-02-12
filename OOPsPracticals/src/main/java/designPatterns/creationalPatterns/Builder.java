package designPatterns.creationalPatterns;

public class Builder {
    /*

     */

    public static void main(String[] args) {

    }
}

class Vehicle{
    private String name;
    private String noOfWheel;
    private Vehicle(){

    }
    public static VehicleBuilder vehicleBuilder(String name){
        return new VehicleBuilder(name);
    }
}
class VehicleBuilder{
    private String name;
    private String noOfWheel;
    private Vehicle vehicle;
    VehicleBuilder(String name){
        this.name = name;
    }
    public Vehicle build(){
        return this.vehicle;
    }
}