package vsePlaneti.entities;

/**
 * Created by vladimir on 18.07.17.
 */
public class Planet {


    private vsePlaneti.entities.Civilization owner;

    private boolean hasAtmosfere;

    private boolean hasGround;

    private String namePlanet;

    private double volume;//obyem


    private double sizePlanet;

    private double massPlanet;

    private double denciti; // plotnost

    private double distanceToTheStar;

    private double temperature;

    private boolean hasLiquidWater;


    public Planet(Object o, boolean b, boolean nextBoolean, String planetName, double v) {
    }

    public Planet(vsePlaneti.entities.Civilization owner,
                  boolean hasAtmosfere,
                  boolean hasGround,
                  String namePlanet,
                  double sizePlanet,
                  double massPlanet,
                  double distanceToTheStar,
                  double temperature,
                  boolean hasLiquidWater)
    {
        this.owner = owner;
        this.hasAtmosfere = hasAtmosfere;
        this.hasGround = hasGround;
        this.namePlanet = namePlanet;
        this.sizePlanet = sizePlanet;
        this.massPlanet = massPlanet;
        this.distanceToTheStar = distanceToTheStar;
        this.temperature = temperature;
        this.hasLiquidWater = hasLiquidWater;
        this.denciti = calculateDenciti();
        this.volume = calculateVolume();
    }



    public double calculateVolume(){

        return (4/3)*(Math.PI*Math.pow(sizePlanet/2,3));
    }



    public double calculateDenciti(){

        return massPlanet/calculateVolume();
    }

    public vsePlaneti.entities.Civilization getOwner() {
        return owner;
    }

    public boolean isHasAtmosfere() {
        return hasAtmosfere;
    }

    public boolean isHasGround() {
        return hasGround;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public double getVolume() {
        return volume;
    }

    public double getSizePlanet() {
        return sizePlanet;
    }

    public double getMassPlanet() {
        return massPlanet;
    }

    public double getDenciti() {
        return denciti;
    }

    public double getDistanceToTheStar() {
        return distanceToTheStar;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isHasLiquidWater() {
        return hasLiquidWater;
    }

    public void setDistanceToTheStar(double distanceToTheStar) {
        this.distanceToTheStar = distanceToTheStar;
    }

    public void setOwner(Civilization owner) {
        this.owner = owner;
    }

    public void setHasAtmosfere(boolean hasAtmosfere) {
        this.hasAtmosfere = hasAtmosfere;
    }

    public void setHasGround(boolean hasGround) {
        this.hasGround = hasGround;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public void setSizePlanet(double sizePlanet) {
        this.sizePlanet = sizePlanet;
        this.volume = calculateVolume();
    }

    public void setMassPlanet(double massPlanet) {
        this.massPlanet = massPlanet;
        this.denciti = calculateDenciti();
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHasLiquidWater(boolean hasLiquidWater) {
        this.hasLiquidWater = hasLiquidWater;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "owner=" + owner +
                ", hasAtmosfere=" + hasAtmosfere +
                ", hasGround=" + hasGround +
                ", namePlanet='" + namePlanet + '\'' +
                ", volume=" + volume +
                ", sizePlanet=" + sizePlanet +
                ", massPlanet=" + massPlanet +
                ", denciti=" + denciti +
                ", distanceToTheStar=" + distanceToTheStar +
                ", temperature=" + temperature +
                ", hasLiquidWater=" + hasLiquidWater +
                '}';
    }
}
