package vsePlaneti.entities;

/**
 * Created by vladimir on 18.07.17.
 */
public class Civilization  implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        while (!thread.isInterrupted()){

            population *= populationGrowth;//prirost naseleniya

            if (population <= 0){
                break;
            }




        }

    }



    private Religion religion;

    private ReligionType religionType;

    private String name;

    private String politicStroy;

    private long population;

    private double populationGrowth;

    private double sceinsLavel;

    public Civilization() {
    }

    public Civilization(Religion religion, ReligionType religionType,
                        String name, String politicStroy, long population,
                        double populationGrowth, double sceinsLavel) {
        this.religion = religion;
        this.religionType = religionType;
        this.name = name;
        this.politicStroy = politicStroy;
        this.population = population;
        this.populationGrowth = populationGrowth;
        this.sceinsLavel = sceinsLavel;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public ReligionType getReligionType() {
        return religionType;
    }

    public void setReligionType(ReligionType religionType) {
        this.religionType = religionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoliticStroy() {
        return politicStroy;
    }

    public void setPoliticStroy(String politicStroy) {
        this.politicStroy = politicStroy;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getPopulationGrowth() {
        return populationGrowth;
    }

    public void setPopulationGrowth(double populationGrowth) {
        this.populationGrowth = populationGrowth;
    }

    public double getSceinsLavel() {
        return sceinsLavel;
    }

    public void setSceinsLavel(double sceinsLavel) {
        this.sceinsLavel = sceinsLavel;
    }
}
