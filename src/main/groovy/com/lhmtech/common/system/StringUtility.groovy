package com.lhmtech.common.system

/**
 * Created by lihe on 16-12-6.
 */
final class StringUtility {
    static String takeN(String source, int n) {
        if (n >= 0 && source != null) {
            source.length() > n ? source.subSequence(0, n) : source
        }
    }
}
