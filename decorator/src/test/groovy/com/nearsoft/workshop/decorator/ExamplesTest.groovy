package com.nearsoft.workshop.decorator

import com.nearsoft.workshop.decorator.Examples

class ExamplesTest extends GroovyTestCase {
    void testGetLoggingAdd() {
        Examples e = new Examples()
        e.loggingAdd(4,2)
        e.loggingSubstract(4,2)
        e.loggingMultiply(4,2)
        e.loggingDivide(4,2)
    }
}
