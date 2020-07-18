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
 * Source Class: DefaultMoral_dilemma <br>
 * @version generated on Sat Jul 18 16:47:57 CEST 2020 by Michał Barczyk
 */
public class DefaultMoral_dilemma extends WrappedIndividualImpl implements Moral_dilemma {

    public DefaultMoral_dilemma(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/moral_dilemma_presence
     */
     
    public Collection<? extends WrappedIndividual> getMoral_dilemma_presence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_MORAL_DILEMMA_PRESENCE,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasMoral_dilemma_presence() {
	   return !getMoral_dilemma_presence().isEmpty();
    }

    public void addMoral_dilemma_presence(WrappedIndividual newMoral_dilemma_presence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_MORAL_DILEMMA_PRESENCE,
                                       newMoral_dilemma_presence);
    }

    public void removeMoral_dilemma_presence(WrappedIndividual oldMoral_dilemma_presence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_MORAL_DILEMMA_PRESENCE,
                                          oldMoral_dilemma_presence);
    }


}
