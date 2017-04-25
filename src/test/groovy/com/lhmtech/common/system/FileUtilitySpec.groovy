package com.lhmtech.common.system

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by lihe on 16-11-15.
 */
class FileUtilitySpec extends Specification {
    String folder = './build/ioHelper'

    def cleanup() {
        new File(folder).deleteDir()
    }

    def "SaveAsJson"() {
        given:
        String file = 'string.json'
        String value = 'the-json-string'

        when:
        new FileUtility().saveAsJson(folder, file, value)

        then:
        new File('./build/ioHelper/string.json').text == '"the-json-string"'
    }

    @Unroll
    def 'combinePath'() {

        when:
        String combined = new FileUtility().combinePath(parent, subPath)

        then:
        combined == expected

        where:
        parent     | subPath  | expected
        './build/' | 'a'      | './build/a'
        './build'  | 'a'      | './build/a'
        './build/' | 'a.json' | './build/a.json'
    }

    def 'ensureFolder'() {
        when:
        new FileUtility().ensureFolder(folder)

        then:
        new File(folder).exists()

    }
}
