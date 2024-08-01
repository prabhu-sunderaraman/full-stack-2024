import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab08 {
    static List<String> linesLst = null;

    public static void main(String[] args) throws IOException {
        linesLst = readCitiesFile();
//        storeDistinctCityNames("cities.txt");
//        storeDistinctCountryNames("countries.txt");

//        storeNames("cities.txt", line -> line.split(",")[0]);
//        storeNames("countries.txt", line -> line.split(",")[1]);
        long population = 100000000L;
        printNamesOfCitiesWithPopulationGt(population);
        System.out.println();
        printNamesOfCountriesWithPopulationGt(population);
    }

    private static Country newCountryInstance(String line) {
        return new Country(line.split(",")[1], Long.parseLong(line.split(",")[2]));
    }

    private static void printNamesOfCountriesWithPopulationGt(long population) {
        Map<String, Long> countryPopulationMap = linesLst
                .stream()
                .skip(1)
                .map(Lab08::newCountryInstance)
                .collect(
                        Collectors.groupingBy(
                                country -> country.name(),
                                Collectors.summingLong(country -> country.population())
                        )
                );
        countryPopulationMap
                .entrySet()
                .stream()
                .filter(country -> country.getValue() > population)
                .forEachOrdered(System.out::println);
    }

    private static void printNamesOfCitiesWithPopulationGt(long population) {
        linesLst
                .stream()
                .skip(1)
                .filter(line -> Long.parseLong(line.split(",")[2]) > population)
                .map(line -> line.split(",")[0] + ", " + line.split(",")[2])
                .forEach(System.out::println);
    }

    private static void storeNames(String fileName, Function<String, String> lineSplitFunction) throws IOException {
        List<String> names = linesLst
                .stream()
                .skip(1)
                .map(lineSplitFunction)
                .distinct()
                .toList();
        Files.write(Paths.get(fileName), names);
    }

    private static void storeDistinctCountryNames(String fileName) throws IOException {
        List<String> countryNames = linesLst
                .stream()
                .skip(1)
                .map(line -> line.split(",")[1])
                .distinct()
                .toList();
        Files.write(Paths.get(fileName), countryNames);
    }

    private static void storeDistinctCityNames(String fileName) throws IOException {
        List<String> cityNames = linesLst
                .stream()
                .skip(1)
                .map(line -> line.split(",")[0])
                .distinct()
                .toList();
        Files.write(Paths.get(fileName), cityNames);
    }

    private static List<String> readCitiesFile() throws IOException {
        InputStream is = Lab08.class.getResourceAsStream("/cities.csv");
        String lines = new String(is.readAllBytes());
        String[] linesArr = lines.split("\\n");
        List<String> linesLst = Arrays.stream(linesArr).toList();
        return linesLst;
    }
}
