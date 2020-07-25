package DilemmaDetector.Simulator;

import generator.Model;
import project.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class RigidBodyMapper {

    //TODO get lane width from ontology? is it in centimeters
    public static final int LANE_WIDTH = 300;


    public static void createRigidBodies(Model model, Map<RigidBody, Vehicle> vehicles, Map<RigidBody, Animal> animals, Map<RigidBody, Pedestrian> pedestrians) {
        Map<Lane, ArrayList<Vehicle>> vehicleMap = model.getVehicles();
        Map<Lane, ArrayList<Animal>> animalMap = model.getAnimals();
        Map<Lane, ArrayList<Pedestrian>> pedestrianMap = model.getPedestrians();

        Iterator<Map.Entry<Model.Side, Map<Integer, Lane>>> iterator = model.getLanes().entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Model.Side, Map<Integer, Lane>> parentPair = iterator.next();
            Model.Side side = parentPair.getKey();
            Iterator<Map.Entry<Integer, Lane>> child = (parentPair.getValue()).entrySet().iterator();
            while (child.hasNext()) {
                Map.Entry childPair = child.next();
                Integer number = (Integer) childPair.getKey();
                Lane lane = (Lane) childPair.getValue();
                for (Vehicle vehicle : vehicleMap.get(lane)) {
                    RigidBody rigidBody = RigidBodyMapper.rigidBodyForVehicle(vehicle, side, lane, number);
                    vehicles.put(rigidBody, vehicle);
                }
                for (Animal animal : animalMap.get(lane)) {
                    RigidBody rigidBody = RigidBodyMapper.rigidBodyForAnimal(animal, side, lane, number);
                    animals.put(rigidBody, animal);
                }
                for (Pedestrian pedestrian : pedestrianMap.get(lane)) {
                    RigidBody rigidBody = RigidBodyMapper.rigidBodyForPedestrian(pedestrian, side, lane, number);
                    pedestrians.put(rigidBody, pedestrian);
                }
            }
        }
    }

    public static RigidBody rigidBodyForMainVehicle(Vehicle mainVehicle) {
        RigidBody rigidBody = new RigidBody();
        rigidBody.setPosition(new Vector2(0, 0));

        double accelX, accelY, speedX, speedY, width, length;

        accelX = getProperty(mainVehicle, "accelX");
        accelY = getProperty(mainVehicle, "accelY");
        speedX = getProperty(mainVehicle, "speedX");
        speedY = getProperty(mainVehicle, "speedY");
        width = getProperty(mainVehicle, "width");
        length = getProperty(mainVehicle, "length");

        rigidBody.setSpeed(new Vector2(speedX, speedY));
        rigidBody.setAcceleration(new Vector2(accelX, accelY));
        rigidBody.setLength(length);
        rigidBody.setWidth(width);

        return rigidBody;
    }

    public static RigidBody rigidBodyForVehicle(Vehicle vehicle, Model.Side side, Lane lane, Integer integer) {
        RigidBody rigidBody = new RigidBody();

        double positionX;
        double positionY;
        double accelX, accelY, speedX, speedY, width, length;

        Object[] pos = vehicle.getDistance().toArray();
        positionY = (double) pos[0];

        //Vehicles on left side have negative position X
        if (side == Model.Side.LEFT) {
            positionX = integer * LANE_WIDTH * (-1);
        } else if (side == Model.Side.RIGHT) {
            positionX = integer * LANE_WIDTH;
        } else {
            positionX = 0;
        }

        accelX = getProperty(vehicle, "accelX");
        accelY = getProperty(vehicle, "accelY");
        speedX = getProperty(vehicle, "speedX");
        speedY = getProperty(vehicle, "speedY");
        width = getProperty(vehicle, "width");
        length = getProperty(vehicle, "length");

        rigidBody.setPosition(new Vector2(positionX, positionY));
        rigidBody.setSpeed(new Vector2(speedX, speedY));
        rigidBody.setAcceleration(new Vector2(accelX, accelY));
        rigidBody.setLength(length);
        rigidBody.setWidth(width);

        return rigidBody;
    }


    public static RigidBody rigidBodyForPedestrian(Pedestrian pedestrian, Model.Side side, Lane lane, Integer integer) {
        RigidBody rigidBody = new RigidBody();

        double positionX;
        double positionY;
        double accelX, accelY, speedX, speedY, width, length;

        Object[] pos = pedestrian.getDistance().toArray();
        positionY = (double) pos[0];

        //Entities on left side have negative position X
        if (side == Model.Side.LEFT) {
            positionX = integer * LANE_WIDTH * (-1);
        } else if (side == Model.Side.RIGHT) {
            positionX = integer * LANE_WIDTH;
        } else {
            positionX = 0;
        }

        accelX = getProperty(pedestrian, "accelX");
        accelY = getProperty(pedestrian, "accelY");
        speedX = getProperty(pedestrian, "speedX");
        speedY = getProperty(pedestrian, "speedY");
        width = getProperty(pedestrian, "width");
        length = getProperty(pedestrian, "length");

        rigidBody.setPosition(new Vector2(positionX, positionY));
        rigidBody.setSpeed(new Vector2(speedX, speedY));
        rigidBody.setAcceleration(new Vector2(accelX, accelY));
        rigidBody.setLength(length);
        rigidBody.setWidth(width);

        return rigidBody;
    }

    public static RigidBody rigidBodyForAnimal(Animal animal, Model.Side side, Lane lane, Integer integer) {
        RigidBody rigidBody = new RigidBody();

        double positionX;
        double positionY;
        double accelX, accelY, speedX, speedY, width, length;

        Object[] pos = animal.getDistance().toArray();
        positionY = (double) pos[0];

        if (side == Model.Side.LEFT) {
            positionX = integer * LANE_WIDTH * (-1);
        } else if (side == Model.Side.RIGHT) {
            positionX = integer * LANE_WIDTH;
        } else {
            positionX = 0;
        }

        accelX = getProperty(animal, "accelX");
        accelY = getProperty(animal, "accelY");
        speedX = getProperty(animal, "speedX");
        speedY = getProperty(animal, "speedY");
        width = getProperty(animal, "width");
        length = getProperty(animal, "length");

        rigidBody.setPosition(new Vector2(positionX, positionY));
        rigidBody.setSpeed(new Vector2(speedX, speedY));
        rigidBody.setAcceleration(new Vector2(accelX, accelY));
        rigidBody.setLength(length);
        rigidBody.setWidth(width);

        return rigidBody;
    }

    public static double getProperty(Entity entity, String propertyName) {

        Double returnValue = 0.0;
        switch (propertyName) {
            case "accelX":
                if (entity.hasAccelerationX()) {
                    Iterator<? extends Float> iterator = entity.getAccelerationX().iterator();
                    while (iterator.hasNext()) {
                        returnValue = (double) iterator.next();
                    }
                    return returnValue;
                }
            case "accelY":
                if (entity.hasAccelerationY()) {
                    Iterator<? extends Float> iterator = entity.getAccelerationY().iterator();
                    while (iterator.hasNext()) {
                        returnValue = (double) iterator.next();
                    }
                    return returnValue;
                }
            case "speedX":
                if (entity.hasSpeedX()) {
                    Iterator<? extends Float> iterator = entity.getSpeedX().iterator();
                    while (iterator.hasNext()) {
                        returnValue = (double) iterator.next();
                    }
                    return returnValue;
                }
            case "speedY":
                if (entity.hasSpeedY()) {
                    Iterator<? extends Float> iterator = entity.getSpeedY().iterator();
                    while (iterator.hasNext()) {
                        returnValue = (double) iterator.next();
                    }
                    return returnValue;
                }
            case "width":
                if (entity.hasWidth()) {
                    Iterator<? extends Float> iterator = entity.getWidth().iterator();
                    while (iterator.hasNext()) {
                        returnValue = (double) iterator.next();
                    }
                    return returnValue;
                }
            case "length":
                if (entity.hasWidth()) {
                    Iterator<? extends Float> iterator = entity.getWidth().iterator();
                    while (iterator.hasNext()) {
                        returnValue = (double) iterator.next();
                    }
                    return returnValue;
                }
            default:
                return 0.0;
        }
    }

}