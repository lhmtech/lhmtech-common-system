package com.lhmtech.common.system

import groovy.json.JsonBuilder

/**
 * Created by lihe on 16-11-15.
 */
final class FileUtility {
    static void saveAsJson(String folder, String file, Object product) {
        ensureFolder(folder)
        String fullFilePath = combinePath(folder, file)
        BufferedWriter writer = new File(fullFilePath).newWriter()
        writer << new JsonBuilder(product).toPrettyString()
        writer.close()
    }

    static String combinePath(String parent, String subPath) {
        File parentFile = new File(parent);
        File subFile = new File(parentFile, subPath);
        return subFile.getPath();
    }

    static void ensureFolder(String folder) {
        File fileObject = new File(folder)
        if (!fileObject.exists()) {
            fileObject.mkdirs()
        }
    }
}