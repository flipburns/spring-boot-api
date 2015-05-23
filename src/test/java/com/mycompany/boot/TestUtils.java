package com.mycompany.boot;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.io.IOUtils;

public class TestUtils {

    public static String readToStringFromClasspath(String path){
        try {
            InputStream resourceAsStream = TestUtils.class.getClassLoader().getResourceAsStream(path);
            return IOUtils.toString(resourceAsStream);
        } catch (Exception e) {
            return "";
        }

    }

}
