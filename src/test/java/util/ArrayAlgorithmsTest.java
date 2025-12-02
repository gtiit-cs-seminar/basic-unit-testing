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
    @MethodSource("inputsFromFile")
    void testSortWithDataFromFile(int[] inputArray) {
        System.out.println("in: " + Arrays.toString(inputArray));
        ArrayAlgorithms.sort(inputArray);
        System.out.println("out: " + Arrays.toString(inputArray));
        //TODO: What's the expectation?
    }

    private static Stream<int[]> inputsFromFile() throws IOException {
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
