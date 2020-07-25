package DilemmaDetector.Simulator;

import generator.Model;
import project.*;


import java.util.Map;

public class CollisionDetector {

    //3 seconds lasts each period when we check moves of all entities in model
    private double movingTime = 3.0;
    //each timePart we check if there is a collision between main vehicle and some different entity
    private double timePart = 0.1;

    private Model model;
    private Map<RigidBody, Vehicle> vehicles;
    private Map<RigidBody, Animal> animals;
    private Map<RigidBody, Pedestrian> pedestrians;
    private RigidBody mainVehicle;

    public CollisionDetector(Model model,
                             RigidBody mainVehicle,
                             Map<RigidBody, Vehicle> vehicles,
                             Map<RigidBody, Animal> animals,
                             Map<RigidBody, Pedestrian> pedestrians) {
        this.model = model;
        this.mainVehicle = mainVehicle;
        this.vehicles = vehicles;
        this.animals = animals;
        this.pedestrians = pedestrians;
    }

    public void SetMovingTime(double movingTime) {
        this.movingTime = movingTime;
    }

    public void setTimePart(double timePart) {
        this.timePart = timePart;
    }

    public void detectCollisionInTime(Decision decision) {
        double currentTime = 0;
        while (currentTime < movingTime) {
            currentTime += timePart;
            if (detectCollisionInMoment()) {
                System.out.println("Collision in decision " + decision.toString());
                return;
            }
        }
        System.out.println("No collision in decision  " + decision.toString());
    }


    public boolean detectCollisionInMoment() {
        //s = v0*t + at^2/2
        Vector2 mainVehiclePositionChange = mainVehicle.getSpeed().mul(timePart).add((mainVehicle.getAcceleration().mul(timePart * timePart).mul(0.5)));
        Vector2 mainVehicleNewSpeed = mainVehicle.getSpeed().add(mainVehicle.getAcceleration().mul(timePart)); //v = v0 + at

        if (!vehicles.isEmpty()) {
            for (Map.Entry<RigidBody, Vehicle> entry : vehicles.entrySet()) {
                if (detectCollisionWithVehicleInMoment(entry.getKey(), entry.getValue(), mainVehiclePositionChange))
                    return true;
            }
        }
        if (!animals.isEmpty()) {
            for (Map.Entry<RigidBody, Animal> entry : animals.entrySet()) {
                if (detectCollisionWithAnimalInMoment(entry.getKey(), entry.getValue(), mainVehiclePositionChange))
                    return true;
            }
        }

        if (!pedestrians.isEmpty()) {
            for (Map.Entry<RigidBody, Pedestrian> entry : pedestrians.entrySet()) {
                if (detectCollisionWithPedestrianInMoment(entry.getKey(), entry.getValue(), mainVehiclePositionChange))
                    return true;
            }
        }
        return false;
    }

    public boolean detectCollisionWithVehicleInMoment(RigidBody rigidBody, Vehicle vehicle, Vector2 mainVehiclePositionChange) {
        Vector2 positionChange = rigidBody.getSpeed().mul(timePart).add(rigidBody.getAcceleration().mul(timePart * timePart).mul(0.5));
        Vector2 newSpeed = rigidBody.getSpeed().add(rigidBody.getAcceleration().mul(timePart));
        Vector2 newPosition = positionChange.sub(mainVehiclePositionChange);
        boolean isCollision = false;
        Double vehicleWidth = RigidBodyMapper.getProperty(vehicle, "width");
        if (rigidBody.getPosition().y > 0 && newPosition.y < 0 &&
                rigidBody.getPosition().x + newPosition.x < (vehicleWidth + mainVehicle.getWidth()) / 2) {
            isCollision = true;
        } else {
            rigidBody.setSpeed(newSpeed);
            rigidBody.setPosition(newPosition);
        }
        return isCollision;
    }

    public boolean detectCollisionWithAnimalInMoment(RigidBody rigidBody, Animal animal, Vector2 mainVehiclePositionChange) {
        Vector2 positionChange = rigidBody.getSpeed().mul(timePart).add(rigidBody.getAcceleration().mul(timePart * timePart).mul(0.5));
        Vector2 newSpeed = rigidBody.getSpeed().add(rigidBody.getAcceleration().mul(timePart));
        Vector2 newPosition = positionChange.sub(mainVehiclePositionChange);
        boolean isCollision = false;
        Double animalWidth = RigidBodyMapper.getProperty(animal, "width");
        if (rigidBody.getPosition().y > 0 && newPosition.y < 0 &&
                rigidBody.getPosition().x + newPosition.x < (animalWidth + mainVehicle.getWidth()) / 2) {
            isCollision = true;
        } else {
            rigidBody.setSpeed(newSpeed);
            rigidBody.setPosition(newPosition);
        }
        return isCollision;
    }

    public boolean detectCollisionWithPedestrianInMoment(RigidBody rigidBody, Pedestrian pedestrian, Vector2 mainVehiclePositionChange) {
        Vector2 positionChange = rigidBody.getSpeed().mul(timePart).add(rigidBody.getAcceleration().mul(timePart * timePart).mul(0.5));
        Vector2 newSpeed = rigidBody.getSpeed().add(rigidBody.getAcceleration().mul(timePart));
        Vector2 newPosition = positionChange.sub(mainVehiclePositionChange);
        boolean isCollision = false;
        Double pedestrianWidth = RigidBodyMapper.getProperty(pedestrian, "width");
        if (rigidBody.getPosition().y > 0 && newPosition.y < 0 &&
                rigidBody.getPosition().x + newPosition.x < (pedestrianWidth + mainVehicle.getWidth()) / 2) {
            isCollision = true;
        } else {
            rigidBody.setSpeed(newSpeed);
            rigidBody.setPosition(newPosition);
        }
        return isCollision;
    }

}



