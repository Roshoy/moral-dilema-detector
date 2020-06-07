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
 * Source Class: DefaultMaterial_consequence <br>
 * @version generated on Thu May 28 13:55:50 CEST 2020 by kamsz
 */
public class DefaultMaterial_consequence extends WrappedIndividualImpl implements Material_consequence {

    public DefaultMaterial_consequence(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_material_value
     */
     
    public Collection<? extends Object> getHas_material_value() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_MATERIAL_VALUE, Object.class);
    }

    public boolean hasHas_material_value() {
		return !getHas_material_value().isEmpty();
    }

    public void addHas_material_value(Object newHas_material_value) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_MATERIAL_VALUE, newHas_material_value);
    }

    public void removeHas_material_value(Object oldHas_material_value) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_MATERIAL_VALUE, oldHas_material_value);
    }


}
