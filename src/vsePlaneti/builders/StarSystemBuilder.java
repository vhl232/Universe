package vsePlaneti.builders;

import javafx.util.Builder;
import vsePlaneti.entities.Planet;
import vsePlaneti.entities.StarSystem;

import java.lang.reflect.MalformedParametersException;
import java.util.ArrayList;
import java.util.List;

public class StarSystemBuilder implements Builder<StarSystem> {
    public static final int MIN_STARS_NUMBER = 1;
    public static final int MAX_STARS_NUMBER = 3;

    public static final int MIN_PLANETS_NUMBER = 0;
    public static final int MAX_PLANETS_NUMBER = 10;

    public static final String[] starNames = {
            "ACAMAR",
            "ACHERNAR",
            "Achird",
            "ACRUX",
            "Acubens",
            "ADARA",
            "Adhafera",
            "Adhil",
            "AGENA",
            "Ain al Rami",
            "Ain",
            "Al Anz",
            "Al Kalb al Rai",
            "Al Minliar al Asad",
            "Al Minliar al Shuja",
            "Aladfar",
            "Alathfar",
            "Albaldah",
            "Albali",
            "ALBIREO",
            "Alchiba",
            "ALCOR",
            "ALCYONE",
            "ALDEBARAN",
            "ALDERAMIN",
            "Aldhibah",
            "Alfecca Meridiana",
            "Alfirk",
            "ALGENIB",
            "ALGIEBA",
            "ALGOL",
            "Algorab",
            "ALHENA",
            "ALIOTH",
            "ALKAID",
            "Alkalurops",
            "Alkes",
            "Alkurhah",
            "ALMAAK",
            "ALNAIR",
            "ALNATH",
            "ALNILAM",
            "ALNITAK",
            "Alniyat",
            "Alniyat",
            "ALPHARD",
            "ALPHEKKA",
            "ALPHERATZ",
            "Alrai",
            "Alrisha",
            "Alsafi",
            "Alsciaukat",
            "ALSHAIN",
            "Alshat",
            "Alsuhail",
            "ALTAIR",
            "Altarf",
            "Alterf",
            "Aludra",
            "Alula Australis",
            "Alula Borealis",
            "Alya",
            "Alzirr",
            "Ancha",
            "Angetenar",
            "ANKAA",
            "Anser",
            "ANTARES",
            "ARCTURUS",
            "Arkab Posterior",
            "Arkab Prior",
            "ARNEB",
            "Arrakis",
            "Ascella",
            "Asellus Australis",
            "Asellus Borealis",
            "Asellus Primus",
            "Asellus Secondus",
            "Asellus Tertius",
            "Asterope",
            "Atik",
            "Atlas",
            "Auva",
            "Avior",
            "Azelfafage",
            "Azha",
            "Azmidiske",
            "Baham",
            "Baten Kaitos",
            "Becrux",
            "Beid",
            "BELLATRIX",
            "BETELGEUSE",
            "Botein",
            "Brachium",
            "CANOPUS",
            "CAPELLA",
            "Caph",
            "CASTOR",
            "Cebalrai",
            "Celaeno",
            "Chara",
            "Chort",
            "COR CAROLI",
            "Cursa",
            "Dabih",
            "Deneb Algedi",
            "Deneb Dulfim",
            "Deneb el Okab",
            "Deneb el Okab",
            "Deneb Kaitos Shemali",
            "DENEB",
            "DENEBOLA",
            "Dheneb",
            "Diadem",
            "DIPHDA",
            "Double Double (7051)",
            "Double Double (7052)",
            "Double Double (7053)",
            "Double Double (7054)",
            "Dschubba",
            "Dsiban",
            "DUBHE",
            "Ed Asich",
            "Electra",
            "ELNATH",
            "ENIF",
            "ETAMIN",
            "FOMALHAUT",
            "Fornacis",
            "Fum al Samakah",
            "Furud",
            "Gacrux",
            "Gianfar",
            "Gienah Cygni",
            "Gienah Ghurab",
            "Gomeisa",
            "Gorgonea Quarta",
            "Gorgonea Secunda",
            "Gorgonea Tertia",
            "Graffias",
            "Grafias",
            "Grumium",
            "HADAR",
            "Haedi",
            "HAMAL",
            "Hassaleh",
            "Head of Hydrus",
            "Herschel's \"Garnet Star\"",
            "Heze",
            "Hoedus II",
            "Homam",
            "Hyadum I",
            "Hyadum II",
            "IZAR",
            "Jabbah",
            "Kaffaljidhma",
            "Kajam",
            "KAUS AUSTRALIS",
            "Kaus Borealis",
            "Kaus Meridionalis",
            "Keid",
            "Kitalpha",
            "KOCAB",
            "Kornephoros",
            "Kraz",
            "Kuma",
            "Lesath",
            "Maasym",
            "Maia",
            "Marfak",
            "Marfak",
            "Marfic",
            "Marfik",
            "MARKAB",
            "Matar",
            "Mebsuta",
            "MEGREZ",
            "Meissa",
            "Mekbuda",
            "Menkalinan",
            "MENKAR",
            "Menkar",
            "Menkent",
            "Menkib",
            "MERAK",
            "Merga",
            "Merope",
            "Mesarthim",
            "Metallah",
            "Miaplacidus",
            "Minkar",
            "MINTAKA",
            "MIRA",
            "MIRACH",
            "Miram",
            "MIRPHAK",
            "MIZAR",
            "Mufrid",
            "Muliphen",
            "Murzim",
            "Muscida",
            "Muscida",
            "Muscida",
            "Nair al Saif",
            "Naos",
            "Nash",
            "Nashira",
            "Nekkar",
            "NIHAL",
            "Nodus Secundus",
            "NUNKI",
            "Nusakan",
            "Peacock",
            "PHAD",
            "Phaet",
            "Pherkad Minor",
            "Pherkad",
            "Pleione",
            "Polaris Australis",
            "POLARIS",
            "POLLUX",
            "Porrima",
            "Praecipua",
            "Prima Giedi",
            "PROCYON",
            "Propus",
            "Propus",
            "Propus",
            "Rana",
            "Ras Elased Australis",
            "Ras Elased Borealis",
            "RASALGETHI",
            "RASALHAGUE",
            "Rastaban",
            "REGULUS",
            "Rigel Kentaurus",
            "RIGEL",
            "Rijl al Awwa",
            "Rotanev",
            "Ruchba",
            "Ruchbah",
            "Rukbat",
            "Sabik",
            "Sadalachbia",
            "SADALMELIK",
            "Sadalsuud",
            "Sadr",
            "SAIPH",
            "Salm",
            "Sargas",
            "Sarin",
            "Sceptrum",
            "SCHEAT",
            "Secunda Giedi",
            "Segin",
            "Seginus",
            "Sham",
            "Sharatan",
            "SHAULA",
            "SHEDIR",
            "Sheliak",
            "SIRIUS",
            "Situla",
            "Skat",
            "SPICA",
            "Sterope II",
            "Sualocin",
            "Subra",
            "Suhail al Muhlif",
            "Sulafat",
            "Syrma",
            "Tabit (1543)",
            "Tabit (1544)",
            "Tabit (1552)",
            "Tabit (1570)",
            "Talitha",
            "Tania Australis",
            "Tania Borealis",
            "TARAZED",
            "Taygeta",
            "Tegmen",
            "Tejat Posterior",
            "Terebellum",
            "Terebellum",
            "Terebellum",
            "Terebellum",
            "Thabit",
            "Theemim",
            "THUBAN",
            "Torcularis Septentrionalis",
            "Turais",
            "Tyl",
            "UNUKALHAI",
            "VEGA",
            "VINDEMIATRIX",
            "Wasat",
            "Wezen",
            "Wezn",
            "Yed Posterior",
            "Yed Prior",
            "Yildun",
            "Zaniah",
            "Zaurak",
            "Zavijah",
            "Zibal",
            "Zosma",
            "Zuben Elakrab",
            "Zuben Elakribi",
            "Zuben Elgenubi",
            "Zuben Elschemali"
    };

    private StarSystem system;

    private List<StarSystem.Star> stars;
    private List<Planet> planets;


    public StarSystemBuilder() {
        stars = generateStarsList();
        planets = generatePlanetsList();
        system = new StarSystem(stars, planets);
    }

    private List<StarSystem.Star> generateStarsList() {
        List<StarSystem.Star> result = new ArrayList<>();
        int stars = (int) (MIN_STARS_NUMBER + (MAX_STARS_NUMBER - MIN_STARS_NUMBER) * Math.random());
        for (int i = 0; i < stars; i++) {
            result.add(createRandomStar());
        }
        return result;
    }

    private StarSystem.Star createRandomStar() {
        double sunMass = 1.9885e30; // kg
        double minStarMass = 0.07 * sunMass;
        double maxStarMass = 3 * sunMass;

        double sunSize = 6.960e8;   // meters
        double minStarSize = 0.087 * sunSize;
        double maxStarSize = 1640 * sunSize;

        return new StarSystem.Star(starNames[(int) (starNames.length*Math.random())],
                minStarMass + (maxStarMass - minStarMass) * Math.random(),
                minStarSize + (maxStarSize - minStarSize) * Math.random());
    }

    public StarSystemBuilder addStar(StarSystem.Star star) {
        if (stars == null) {
            stars = new ArrayList<>();
        }

        stars.add(star);
        return this;
    }

    public StarSystemBuilder addStars(int numberOfStarsToAdd) {
        if (numberOfStarsToAdd < 1) throw new MalformedParametersException("The number of stars to add is too low");

        for (int i = 0; i < numberOfStarsToAdd; i++) {
            addStar(createRandomStar());
        }

        return this;
    }

    public StarSystemBuilder setStars(List<StarSystem.Star> stars) {
        system.setStars(stars);
        return this;
    }

    private List<Planet> generatePlanetsList() {
        List<Planet> result = new ArrayList<>();
        int planets = (int) (MIN_PLANETS_NUMBER+ (MAX_PLANETS_NUMBER- MIN_PLANETS_NUMBER) * Math.random());
        for (int i = 0; i < planets; i++) {
            result.add(new PlanetBuilder().build());
        }
        return result;
    }

    public StarSystemBuilder addPlanet(Planet planet) {
        if (planets == null) {
            planets = new ArrayList<>();
        }

        planets.add(planet);
        return this;
    }

    public StarSystemBuilder addPlanets(int numberOfPlanetsToAdd) {
        if (numberOfPlanetsToAdd < 1) throw new MalformedParametersException("The number of planets to add is too low");

        for (int i = 0; i < numberOfPlanetsToAdd; i++) {
            addPlanet(new PlanetBuilder().build());
        }

        return this;
    }

    public StarSystemBuilder setPlanets(List<Planet> planets) {
        system.setPlanets(planets);
        return this;
    }

    @Override
    public StarSystem build() {
        return system;
    }
}
