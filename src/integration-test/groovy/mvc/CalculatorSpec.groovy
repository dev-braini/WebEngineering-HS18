package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class CalculatorSpec extends GebSpec {

    // Defines a when-then workflow
    // check page title
    void "Basic calculation"() {
        when:
        go '/static/GradeCalculator.html'
        then:
        title == "Grade Calculator"
    }
}
