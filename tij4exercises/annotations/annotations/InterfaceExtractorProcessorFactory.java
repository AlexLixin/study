/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 20, 2019
 *
 ************************************************************************/
//: annotations/InterfaceExtractorProcessorFactory.java
// APT-based annotation processing.
package annotations;

import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import java.util.*;

public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds, AnnotationProcessorEnvironment env) {
        return new InterfaceExtractorProcessor(env);
    }

    @Override
    public Collection<String> supportedAnnotationTypes() {
        return Collections.singleton("annotations.ExtractInterface");
    }

    @Override
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }
} ///:~