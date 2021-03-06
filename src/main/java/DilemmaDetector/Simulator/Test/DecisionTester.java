package DilemmaDetector.Simulator.Test;

import DilemmaDetector.Simulator.ChangeLaneActionApplier;
import DilemmaDetector.Simulator.RigidBody;
import DilemmaDetector.Simulator.Vector2;
import project.Sunny;

public class DecisionTester {
    private RigidBody car = new RigidBody();
    private ChangeLaneActionApplier actionsApplier= new ChangeLaneActionApplier();

    private void everyTickAction(double deltaTime){
        car.update(deltaTime);
        System.out.println(
                "Pos: " + car.getPosition() +
                " | PrevPos: " + car.getPreviousPosition() +
                " | Speed: " + car.getSpeed() +
                " = " + car.getSpeed().getMagnitude() +
                " | Acc: " + car.getAcceleration());
    }

    private void testChangeLane(){
        double currentTime = 0;
        car.setSpeed(new Vector2(20, 0));
        car.setPosition(Vector2.zero());
        car.setAcceleration(Vector2.zero());

        double TIME_PART = 0.01;

        System.out.println("Changing lane from 0 to 100 coord Y");

        while (currentTime < 10) {
            currentTime += TIME_PART;
            actionsApplier.CarChangeLanes(car, Sunny.class, 0, -100, 25);
            everyTickAction(TIME_PART);
        }
    }

    static public void main(String[] args){
        DecisionTester tester = new DecisionTester();
        tester.testChangeLane();
    }
}
