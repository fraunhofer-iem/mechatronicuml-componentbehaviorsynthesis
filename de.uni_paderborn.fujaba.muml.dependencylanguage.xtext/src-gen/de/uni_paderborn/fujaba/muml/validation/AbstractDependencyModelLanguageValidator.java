/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractDependencyModelLanguageValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/dependencylanguage/0.4.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/actionlanguage/0.4.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/valuetype/0.4.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.storydriven.org/core/expressions/0.3.1"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/behavior/0.4.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.storydriven.org/core/expressions/common/0.3.1"));
		return result;
	}
}
