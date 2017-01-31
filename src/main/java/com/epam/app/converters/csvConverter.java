package com.epam.app.converters;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jacek on 31.01.17.
 */
public class csvConverter {
    private static final Logger logger = Logger.getLogger(csvConverter.class);

    private static final String CSV_SPLIT_BY = ",";

    public static Stream convert() {
        String csvFile = "/csv/salary.csv";
        String line = "";

        try (Stream<String> stream = Files.lines(Paths.get(csvFile))) {
            //stream.forEach(System.out::println);

            Function<String, Stream<String>> function = a -> Stream.of(a.split(","));

            stream.map(function).flatMap(x-> x).forEach(System.out::println);
         //  stream.map(function);
            // stream.map(function).flatMap(l-> l.stream() ).collect(Collectors.joining(", ")).forEach(System.out::print);
            return stream;

        } catch (IOException e) {
            logger.log(Level.ERROR, "");
        }

        return Stream.empty();
    }

}
