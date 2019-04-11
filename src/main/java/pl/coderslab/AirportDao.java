package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AirportDao {




       public static List<Airport> getList () throws IOException {

            Path path = Paths.get("/home/marcin/workspace/mvn_proj/Homework_04/airports.txt");

            List contents = Files.readAllLines(path);

            for (Object content : contents) {
                System.out.println(content);
            }

            List<Airport> airports = new ArrayList<>();

            String[] airportParams = new String[3];

        for (int i = 0; i < contents.size(); i++) {
            airportParams = contents.get(i).toString().split(";");
            airports.add(new Airport(airportParams[0],airportParams[1],airportParams[2]));
        }

            return airports;
        }

}
