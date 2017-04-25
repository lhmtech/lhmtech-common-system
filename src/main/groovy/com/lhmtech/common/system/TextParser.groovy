package com.lhmtech.common.system

/**
 * Created by lihe on 4/24/17.
 */
final class TextParser {
    static Double parse(String text) {
        Double value = null
        try {
            value = Double.parseDouble(text)
        }catch (e) {

        }
        value
    }
}
