package com.lhmtech.common.system

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by lihe on 4/24/17.
 */
class TextParserSpec extends Specification {
    @Unroll
    def 'parse Double: #input'() {
        when:
        Double value = TextParser.parse(input)

        then:
        value == expected

        where:
        input    | expected
        '0'      | 0.0
        '1'      | 1.0
        '-1'     | -1.0
        '1.0'    | 1.0
        '-1.0'   | -1.0
        'N/A'    | null
        '1.2.2'  | null
        '@DFJKL' | null
    }
}
