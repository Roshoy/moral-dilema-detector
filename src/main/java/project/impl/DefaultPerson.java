package project.impl;

import project.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultPerson <br>
 * @version generated on Thu May 28 13:55:50 CEST 2020 by kamsz
 */
public class DefaultPerson extends WrappedIndividualImpl implements Person {

    public DefaultPerson(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/age
     */
     
    public Collection<? extends WrappedIndividual> getAge() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_AGE,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasAge() {
	   return !getAge().isEmpty();
    }

    public void addAge(WrappedIndividual newAge) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_AGE,
                                       newAge);
    }

    public void removeAge(WrappedIndividual oldAge) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_AGE,
                                          oldAge);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/criminal_record
     */
     
    public Collection<? extends Criminal_record> getCriminal_record() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_CRIMINAL_RECORD,
                                               DefaultCriminal_record.class);
    }

    public boolean hasCriminal_record() {
	   return !getCriminal_record().isEmpty();
    }

    public void addCriminal_record(Criminal_record newCriminal_record) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_CRIMINAL_RECORD,
                                       newCriminal_record);
    }

    public void removeCriminal_record(Criminal_record oldCriminal_record) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_CRIMINAL_RECORD,
                                          oldCriminal_record);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/gender
     */
     
    public Collection<? extends WrappedIndividual> getGender() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_GENDER,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasGender() {
	   return !getGender().isEmpty();
    }

    public void addGender(WrappedIndividual newGender) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_GENDER,
                                       newGender);
    }

    public void removeGender(WrappedIndividual oldGender) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_GENDER,
                                          oldGender);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_at_the_back
     */
     
    public Collection<? extends Entity> getHas_at_the_back() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                               DefaultEntity.class);
    }

    public boolean hasHas_at_the_back() {
	   return !getHas_at_the_back().isEmpty();
    }

    public void addHas_at_the_back(Entity newHas_at_the_back) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                       newHas_at_the_back);
    }

    public void removeHas_at_the_back(Entity oldHas_at_the_back) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                          oldHas_at_the_back);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_in_the_front
     */
     
    public Collection<? extends Entity> getHas_in_the_front() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                               DefaultEntity.class);
    }

    public boolean hasHas_in_the_front() {
	   return !getHas_in_the_front().isEmpty();
    }

    public void addHas_in_the_front(Entity newHas_in_the_front) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                       newHas_in_the_front);
    }

    public void removeHas_in_the_front(Entity oldHas_in_the_front) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                          oldHas_in_the_front);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_on_the_left
     */
     
    public Collection<? extends Entity> getHas_on_the_left() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                               DefaultEntity.class);
    }

    public boolean hasHas_on_the_left() {
	   return !getHas_on_the_left().isEmpty();
    }

    public void addHas_on_the_left(Entity newHas_on_the_left) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                       newHas_on_the_left);
    }

    public void removeHas_on_the_left(Entity oldHas_on_the_left) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                          oldHas_on_the_left);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_on_the_right
     */
     
    public Collection<? extends Entity> getHas_on_the_right() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                               DefaultEntity.class);
    }

    public boolean hasHas_on_the_right() {
	   return !getHas_on_the_right().isEmpty();
    }

    public void addHas_on_the_right(Entity newHas_on_the_right) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                       newHas_on_the_right);
    }

    public void removeHas_on_the_right(Entity oldHas_on_the_right) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                          oldHas_on_the_right);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_close_distance
     */
     
    public Collection<? extends Entity> getHas_within_close_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                               DefaultEntity.class);
    }

    public boolean hasHas_within_close_distance() {
	   return !getHas_within_close_distance().isEmpty();
    }

    public void addHas_within_close_distance(Entity newHas_within_close_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                       newHas_within_close_distance);
    }

    public void removeHas_within_close_distance(Entity oldHas_within_close_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                          oldHas_within_close_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_far_distance
     */
     
    public Collection<? extends Entity> getHas_within_far_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                               DefaultEntity.class);
    }

    public boolean hasHas_within_far_distance() {
	   return !getHas_within_far_distance().isEmpty();
    }

    public void addHas_within_far_distance(Entity newHas_within_far_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                       newHas_within_far_distance);
    }

    public void removeHas_within_far_distance(Entity oldHas_within_far_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                          oldHas_within_far_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_very_close_distance
     */
     
    public Collection<? extends Entity> getHas_within_very_close_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                               DefaultEntity.class);
    }

    public boolean hasHas_within_very_close_distance() {
	   return !getHas_within_very_close_distance().isEmpty();
    }

    public void addHas_within_very_close_distance(Entity newHas_within_very_close_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                       newHas_within_very_close_distance);
    }

    public void removeHas_within_very_close_distance(Entity oldHas_within_very_close_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                          oldHas_within_very_close_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/human_makes_decision
     */
     
    public Collection<? extends Decision> getHuman_makes_decision() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HUMAN_MAKES_DECISION,
                                               DefaultDecision.class);
    }

    public boolean hasHuman_makes_decision() {
	   return !getHuman_makes_decision().isEmpty();
    }

    public void addHuman_makes_decision(Decision newHuman_makes_decision) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HUMAN_MAKES_DECISION,
                                       newHuman_makes_decision);
    }

    public void removeHuman_makes_decision(Decision oldHuman_makes_decision) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HUMAN_MAKES_DECISION,
                                          oldHuman_makes_decision);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/human_profession
     */
     
    public Collection<? extends Human_profession> getHuman_profession() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HUMAN_PROFESSION,
                                               DefaultHuman_profession.class);
    }

    public boolean hasHuman_profession() {
	   return !getHuman_profession().isEmpty();
    }

    public void addHuman_profession(Human_profession newHuman_profession) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HUMAN_PROFESSION,
                                       newHuman_profession);
    }

    public void removeHuman_profession(Human_profession oldHuman_profession) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HUMAN_PROFESSION,
                                          oldHuman_profession);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/human_properties
     */
     
    public Collection<? extends WrappedIndividual> getHuman_properties() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HUMAN_PROPERTIES,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHuman_properties() {
	   return !getHuman_properties().isEmpty();
    }

    public void addHuman_properties(WrappedIndividual newHuman_properties) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HUMAN_PROPERTIES,
                                       newHuman_properties);
    }

    public void removeHuman_properties(WrappedIndividual oldHuman_properties) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HUMAN_PROPERTIES,
                                          oldHuman_properties);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/is_in_vehicle
     */
     
    public Collection<? extends Vehicle> getIs_in_vehicle() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_IS_IN_VEHICLE,
                                               DefaultVehicle.class);
    }

    public boolean hasIs_in_vehicle() {
	   return !getIs_in_vehicle().isEmpty();
    }

    public void addIs_in_vehicle(Vehicle newIs_in_vehicle) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_IS_IN_VEHICLE,
                                       newIs_in_vehicle);
    }

    public void removeIs_in_vehicle(Vehicle oldIs_in_vehicle) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_IS_IN_VEHICLE,
                                          oldIs_in_vehicle);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/move_forward
     */
     
    public Collection<? extends WrappedIndividual> getMove_forward() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_MOVE_FORWARD,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasMove_forward() {
	   return !getMove_forward().isEmpty();
    }

    public void addMove_forward(WrappedIndividual newMove_forward) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_MOVE_FORWARD,
                                       newMove_forward);
    }

    public void removeMove_forward(WrappedIndividual oldMove_forward) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_MOVE_FORWARD,
                                          oldMove_forward);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/pedestrian_has_location
     */
     
    public Collection<? extends Road_segment> getPedestrian_has_location() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_HAS_LOCATION,
                                               DefaultRoad_segment.class);
    }

    public boolean hasPedestrian_has_location() {
	   return !getPedestrian_has_location().isEmpty();
    }

    public void addPedestrian_has_location(Road_segment newPedestrian_has_location) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_HAS_LOCATION,
                                       newPedestrian_has_location);
    }

    public void removePedestrian_has_location(Road_segment oldPedestrian_has_location) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_HAS_LOCATION,
                                          oldPedestrian_has_location);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/pedestrian_makes_action
     */
     
    public Collection<? extends Pedestrian_action> getPedestrian_makes_action() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_MAKES_ACTION,
                                               DefaultPedestrian_action.class);
    }

    public boolean hasPedestrian_makes_action() {
	   return !getPedestrian_makes_action().isEmpty();
    }

    public void addPedestrian_makes_action(Pedestrian_action newPedestrian_makes_action) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_MAKES_ACTION,
                                       newPedestrian_makes_action);
    }

    public void removePedestrian_makes_action(Pedestrian_action oldPedestrian_makes_action) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_MAKES_ACTION,
                                          oldPedestrian_makes_action);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/profession
     */
     
    public Collection<? extends WrappedIndividual> getProfession() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PROFESSION,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasProfession() {
	   return !getProfession().isEmpty();
    }

    public void addProfession(WrappedIndividual newProfession) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PROFESSION,
                                       newProfession);
    }

    public void removeProfession(WrappedIndividual oldProfession) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PROFESSION,
                                          oldProfession);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/stop
     */
     
    public Collection<? extends WrappedIndividual> getStop() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_STOP,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasStop() {
	   return !getStop().isEmpty();
    }

    public void addStop(WrappedIndividual newStop) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_STOP,
                                       newStop);
    }

    public void removeStop(WrappedIndividual oldStop) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_STOP,
                                          oldStop);
    }


}