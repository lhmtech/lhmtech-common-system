package com.lhmtech.common.system

import spock.lang.Specification

/**
 * Created by lihe on 16-12-6.
 */
class DateUtilitySpec extends Specification {
    def "years ago"() {
        given:
        def year = 1

        when:
        def ago = DateUtility.yearsAgo(year);

        then:
        ago != null
    }

    def "days ago"() {
        given:
        def day = 1

        when:
        def ago = DateUtility.daysAgo(day)

        then:
        ago != null

    }

}
