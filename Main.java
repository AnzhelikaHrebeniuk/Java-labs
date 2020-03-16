package lika;

public class Main {

    public static void main(String[] args) throws VehicleException {
        PoliceCar policeCar = new PoliceCar(1);
        Policeman policeman = new Policeman();
        Fireman fireman = new Fireman();
        //policeCar.takeASeat(fireman);
        policeCar.takeASeat(policeman);
        FireCar ff = new FireCar(0);
        ff.takeASeat(fireman);
       // ff.takeASeat(policeman);
        Bus bus = new Bus(0);
        bus.takeASeat(fireman);
        bus.takeASeat(policeman);
        policeCar.freeSeat(policeman);

        Road road = new Road();
        road.addCarToRoad(bus);
        System.out.println(road.getCountOfHumans());

        road.addCarToRoad(policeCar);
        System.out.println(road.getCountOfHumans());

        road.addCarToRoad(ff);
        System.out.println(road.getCountOfHumans());
        PoliceCar o = new PoliceCar(3);
        o.takeASeat(policeman);

    }
}
