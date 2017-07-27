package vsePlaneti;

import vsePlaneti.builders.StarSystemBuilder;

import java.io.IOException;

/**
 * Created by vladimir on 18.07.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {

       /*StringBuilder sb = new StringBuilder();

        BufferedReader bufferedReader =
                new BufferedReader(new  FileReader("/home/vladimir/planets"));
        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter("/home/vladimir/planets1"));


        String s;


        while (bufferedReader.ready()){

            s = bufferedReader.readLine();
            s = s.substring(0, s.indexOf('(')).trim();

            bufferedWriter.write("\""+ s+"\", ");
            bufferedWriter.flush();



        }

*/

        /*Planet Zet = new PlanetBuilder()

                .setMassPlanet(5.9726e24)
                .setsizePlanet(12756.2)
                .build();



        Planet D12 = new PlanetBuilder().build();


        System.out.println(Zet);


        System.out.println(D12);*/


        System.out.println(new StarSystemBuilder().build());


    }


}
