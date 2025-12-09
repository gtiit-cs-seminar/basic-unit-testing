package util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class ArrayAlgorithmsTest {

    @ParameterizedTest
    @MethodSource("inputsFromFileIntegerList")
    void testSortWithDataFromFile(int[] inputArray) {
        ArrayAlgorithms.sort(inputArray);
        //TODO: What's the expectation?
    }

    private static Stream<int[]> inputsFromFileIntegerList() throws IOException {
        String filename = "/Users/diegog/repos/gtiit/seminar/copy/basic-unit-testing/numbers.txt";
        Path filePath = Paths.get(filename);
        List<String> lines = Files.readAllLines(filePath);
        // fix to parse a list of integers per line like: [1, 12, 335, 4]
        return lines.stream()
                .filter(line -> !line.trim().isEmpty())
                .map(line -> Arrays.stream(line.replaceAll("[\\[\\]\\s]", "").split(","))
                        .mapToInt(Integer::parseInt)
                        .toArray()
                );
     }

    private static Stream<int[]> inputsFromFileOnlyDigits() throws IOException {
        String filename = "put here the filename with the fuzzed inputs";
        Path filePath = Paths.get(filename);
        List<String> lines = Files.readAllLines(filePath);

        return lines.stream()
                .filter(line -> !line.trim().isEmpty())
                .map(line -> line.chars()
                        .filter(Character::isDigit)
                        .map(Character::getNumericValue)
                        .toArray()
                );
    }

}
