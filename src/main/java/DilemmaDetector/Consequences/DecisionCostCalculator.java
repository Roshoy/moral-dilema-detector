package DilemmaDetector.Consequences;

import DilemmaDetector.ParameterizedPhilosophy;
import project.*;

import java.util.List;

public class DecisionCostCalculator {
    private IConsequenceContainer consequenceContainer;
    private MyFactory factory;

    public DecisionCostCalculator(IConsequenceContainer consequenceContainer, MyFactory factory) {
        this.consequenceContainer = consequenceContainer;
        this.factory = factory;
    }

    public int calculateCostForDecision(Decision decision){
        int res = calculateCostOfHealthConsequence(decision);
        System.out.println("DECISION : " + decision.getOwlIndividual().toStringID() + " " + res);
        return res;
    }

    private int calculateCostOfHealthConsequence(Decision decision){
        int result = 0;
        for(ConsequenceType consequenceType :
                new ConsequenceType[]{
                        ConsequenceType.KILLED,
                        ConsequenceType.SEVERELY_INJURED,
                        ConsequenceType.LIGHTLY_INJURED}) {
            calculateCostOfHealthConsequenceOfType(decision, consequenceType);
        }
        return result;
    }

    private int calculateCostOfHealthConsequenceOfType(Decision decision, ConsequenceType consequenceType) {
        int result = 0;
        List<String> victims = consequenceContainer.getHealthConsequencesOfType(decision, consequenceType);
        for (String victimName : victims) {
            Living_entity livingEntity = factory.getLiving_entity(victimName);
            if (livingEntity instanceof Passenger || livingEntity instanceof Human) {
                result += ParameterizedPhilosophy.healthValue.get(consequenceType) * ParameterizedPhilosophy.humanLifeFactor;
            } else if (livingEntity instanceof Animal) {
                result += ParameterizedPhilosophy.healthValue.get(consequenceType) * ParameterizedPhilosophy.animalLifeFactor;
            }
        }
        return result;
    }

}
