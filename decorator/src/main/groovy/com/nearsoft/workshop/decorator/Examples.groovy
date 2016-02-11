package com.nearsoft.workshop.decorator

import groovy.util.logging.Slf4j

@Slf4j
class Examples {
    def add = { a, b -> a + b }

    def substract = { a, b -> a - b }

    def multiply = { a, b -> a * b }

    def divide = { a, b -> a / b }

    def makeLogger = { calcFn ->
        {
            a, b ->
                def result = calcFn(a, b)
                log.info("Result is $result")
                result
        }
    }

    def loggingAdd = makeLogger(add)
    def loggingSubstract = makeLogger(substract)
    def loggingMultiply = makeLogger(multiply)
    def loggingDivide = makeLogger(divide)

}