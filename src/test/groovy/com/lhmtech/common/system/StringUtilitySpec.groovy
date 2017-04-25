package com.lhmtech.common.system

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by lihe on 16-12-6.
 */
class StringUtilitySpec extends Specification {
    @Unroll
    def "get first #source - #n from string"() {
        when:
        String result = StringUtility.takeN(source, n)

        then:
        result == expected

        where:
        source       | n   | expected
        '1234567890' | -1  | null
        '1234567890' | 0   | ''
        '1234567890' | 1   | '1'
        '1234567890' | 5   | '12345'
        '1234567890' | 9   | '123456789'
        '1234567890' | 10  | '1234567890'
        '1234567890' | 100 | '1234567890'
        ''           | 0   | ''
        ''           | 1   | ''
        null         | 0   | null
        null         | 1   | null
    }
}