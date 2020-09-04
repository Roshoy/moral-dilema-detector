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
 * Source Class: DefaultRoad <br>
 * @version generated on Fri Sep 04 19:48:03 CEST 2020 by Michał Barczyk
 */
public class DefaultRoad extends WrappedIndividualImpl implements Road {

    public DefaultRoad(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#ends
     */
     
    public Collection<? extends Road_point> getEnds() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ENDS,
                                               DefaultRoad_point.class);
    }

    public boolean hasEnds() {
	   return !getEnds().isEmpty();
    }

    public void addEnds(Road_point newEnds) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ENDS,
                                       newEnds);
    }

    public void removeEnds(Road_point oldEnds) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ENDS,
                                          oldEnds);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#starts
     */
     
    public Collection<? extends Road_point> getStarts() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_STARTS,
                                               DefaultRoad_point.class);
    }

    public boolean hasStarts() {
	   return !getStarts().isEmpty();
    }

    public void addStarts(Road_point newStarts) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_STARTS,
                                       newStarts);
    }

    public void removeStarts(Road_point oldStarts) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_STARTS,
                                          oldStarts);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#end_angle
     */
     
    public Collection<? extends Float> getEnd_angle() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_END_ANGLE, Float.class);
    }

    public boolean hasEnd_angle() {
		return !getEnd_angle().isEmpty();
    }

    public void addEnd_angle(Float newEnd_angle) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_END_ANGLE, newEnd_angle);
    }

    public void removeEnd_angle(Float oldEnd_angle) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_END_ANGLE, oldEnd_angle);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#start_angle
     */
     
    public Collection<? extends Float> getStart_angle() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_START_ANGLE, Float.class);
    }

    public boolean hasStart_angle() {
		return !getStart_angle().isEmpty();
    }

    public void addStart_angle(Float newStart_angle) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_START_ANGLE, newStart_angle);
    }

    public void removeStart_angle(Float oldStart_angle) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_START_ANGLE, oldStart_angle);
    }


}
