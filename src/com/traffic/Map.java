package com.traffic;

import java.util.ArrayList;

public class Map {
    static ArrayList<Road> roads = new ArrayList<>();
    static ArrayList<Car> cars = new ArrayList<>();
    static ArrayList<TrafficLight> trafficLights = new ArrayList<>();
    public Map(){
    }

    public void addRoad(Road road){
        roads.add(road);
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public void addTrafficLight(TrafficLight light) {
        trafficLights.add(light);
    }

}
