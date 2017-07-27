package vsePlaneti;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by vladimir on 18.07.17.
 */
public class Utils {

    private static String pathToFile = "story.txt";

    public static void setPathToFile(String pathToFile) {
        Utils.pathToFile = pathToFile;
    }

    private static BufferedWriter writer;


    public static void openFile() throws IOException {

        writer = new BufferedWriter(new FileWriter(pathToFile));

    }

    public static void write(String message){

        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static String [] planetName = new String[]{"Церера", "Паллада", "Юнона",
            "Веста", "Астрея", "Геба", "Ирида", "Флора", "Метида", "Гигея",
            "Парфенопа", "Виктория", "Эгерия", "Ирена", "Эвномия", "Психея",
            "Фетида", "Мельпомена", "Фортуна", "Массалия", "Лютеция", "Каллиопа",
            "Талия", "Фемида", "Фокея", "Прозерпина", "Эвтерпа", "Беллона",
            "Амфитрита", "Урания", "Евфросина", "Помона", "Полигимния", "Цирцея",
            "Левкофея", "Аталанта", "Фидес", "Леда", "Летиция", "Гармония", "Дафна",
            "Изида", "Ариадна", "Ниса", "Евгения", "Гестия", "Аглая", "Дорида",
            "Палес", "Виргиния", "Немауза", "Европа", "Калипсо", "Александра",
            "Пандора", "Мелета", "Мнемозина", "Конкордия", "Элпида", "Эхо",
            "Даная", "Эрато", "Аузониа", "Ангелина", "Кибела", "Майя", "Асия",
            "Лето", "Гесперия", "Панопея", "Ниоба", "Ферония", "Клития", "Галатея",
            "Эвридика", "Фрейя", "Фригга", "Диана", "Эвринома", "Сапфо", "Терпсихора",
            "Алкмена", "Беатрис", "Клио", "Ио", "Семела", "Сильвия", "Фисба", "Юлия",
            "Антиопа", "Эгина", "Ундина", "Минерва",
            "Аврора", "Аретуса", "Эгла", "Клото", "Ианта", "Дике", "Геката"};


    public static String getPlanetName(){
        return planetName[(int) (planetName.length*Math.random())];
    }






}
