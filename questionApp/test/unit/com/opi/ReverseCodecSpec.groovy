package com.opi

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class ReverseCodecSpec extends Specification {

    def setup() {
		mockCodec(ReverseCodec)
    }

    def cleanup() {
    }

    void "my text is reversed"() {
		when:
		def text = "this is my test"

		then:
		text.reverse() == text.encodeAsReverse()
    }
}
