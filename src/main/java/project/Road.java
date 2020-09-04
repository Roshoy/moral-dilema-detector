package project;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Road <br>
 * @version generated on Fri Sep 04 19:48:03 CEST 2020 by Michał Barczyk
 */

public interface Road extends WrappedIndividual {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#ends
     */
     
    /**
     * Gets all property values for the ends property.<p>
     * 
     * @returns a collection of values for the ends property.
     */
    Collection<? extends Road_point> getEnds();

    /**
     * Checks if the class has a ends property value.<p>
     * 
     * @return true if there is a ends property value.
     */
    boolean hasEnds();

    /**
     * Adds a ends property value.<p>
     * 
     * @param newEnds the ends property value to be added
     */
    void addEnds(Road_point newEnds);

    /**
     * Removes a ends property value.<p>
     * 
     * @param oldEnds the ends property value to be removed.
     */
    void removeEnds(Road_point oldEnds);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#starts
     */
     
    /**
     * Gets all property values for the starts property.<p>
     * 
     * @returns a collection of values for the starts property.
     */
    Collection<? extends Road_point> getStarts();

    /**
     * Checks if the class has a starts property value.<p>
     * 
     * @return true if there is a starts property value.
     */
    boolean hasStarts();

    /**
     * Adds a starts property value.<p>
     * 
     * @param newStarts the starts property value to be added
     */
    void addStarts(Road_point newStarts);

    /**
     * Removes a starts property value.<p>
     * 
     * @param oldStarts the starts property value to be removed.
     */
    void removeStarts(Road_point oldStarts);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#end_angle
     */
     
    /**
     * Gets all property values for the end_angle property.<p>
     * 
     * @returns a collection of values for the end_angle property.
     */
    Collection<? extends Float> getEnd_angle();

    /**
     * Checks if the class has a end_angle property value.<p>
     * 
     * @return true if there is a end_angle property value.
     */
    boolean hasEnd_angle();

    /**
     * Adds a end_angle property value.<p>
     * 
     * @param newEnd_angle the end_angle property value to be added
     */
    void addEnd_angle(Float newEnd_angle);

    /**
     * Removes a end_angle property value.<p>
     * 
     * @param oldEnd_angle the end_angle property value to be removed.
     */
    void removeEnd_angle(Float oldEnd_angle);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#start_angle
     */
     
    /**
     * Gets all property values for the start_angle property.<p>
     * 
     * @returns a collection of values for the start_angle property.
     */
    Collection<? extends Float> getStart_angle();

    /**
     * Checks if the class has a start_angle property value.<p>
     * 
     * @return true if there is a start_angle property value.
     */
    boolean hasStart_angle();

    /**
     * Adds a start_angle property value.<p>
     * 
     * @param newStart_angle the start_angle property value to be added
     */
    void addStart_angle(Float newStart_angle);

    /**
     * Removes a start_angle property value.<p>
     * 
     * @param oldStart_angle the start_angle property value to be removed.
     */
    void removeStart_angle(Float oldStart_angle);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
