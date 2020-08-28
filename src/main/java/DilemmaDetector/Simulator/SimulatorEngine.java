package DilemmaDetector.Simulator;

import generator.Model;
import project.*;
import project.impl.DefaultDecision;

import java.util.*;

public class SimulatorEngine {

    //3 seconds lasts each period when we check moves of all entities in model
    private static final double MOVING_TIME = 3.0;
    //each TIME_PART we check if there is a collision between main vehicle and some different entity
    private static final double TIME_PART = 0.01;

    private Model model;

    private List<Actor> actors;

    private Actor mainVehicle;
    private CollisionDetector collisionDetector;

    public SimulatorEngine(Model model) {
        this.model = model;
        this.mainVehicle = new Actor(model.getVehicle(), RigidBodyMapper.rigidBodyForMainVehicle(model.getVehicle()));
        this.actors = RigidBodyMapper.createActors(model);
        collisionDetector = new CollisionDetector(mainVehicle, this.actors);
    }

    public Map<Decision, List<Actor>> simulateAll(){
        Map<Decision, List<Actor>> collided = new HashMap<>();
        for(Decision decision : this.model.getActionByDecision().keySet()) {
            collided.put(decision, simulate(decision));
        }
        return collided;
    }

    public List<Actor> simulate(Decision decision) {
        double currentTime = 0;
        while (currentTime < MOVING_TIME) {
            currentTime += TIME_PART;
            if(decision instanceof Turn_left){ //factory.getTurn_left(decision.getOwlIndividual().getIRI().toString()) != null
                BasicActionsApplier.CarTurning(mainVehicle.getRigidBody(), model.getWeather().getClass(), false);
            }else if(decision instanceof Turn_right){ //factory.getTurn_left(decision.getOwlIndividual().getIRI().toString()) != null
                BasicActionsApplier.CarTurning(mainVehicle.getRigidBody(), model.getWeather().getClass(), true);
            }else if(decision instanceof Follow){} //factory.getTurn_left(decision.getOwlIndividual().getIRI().toString()) != null

            mainVehicle.getRigidBody().update(TIME_PART);
            for (Actor actor : actors) {
                actor.getRigidBody().update(TIME_PART);
            }

            List<Actor> collided = collisionDetector.detectCollisionInMoment();

            if (!collided.isEmpty()) {
                System.out.println("Collision in decision " + decision.toString());
                return collided;
            }
        }
        return new ArrayList<>();
    }
}
