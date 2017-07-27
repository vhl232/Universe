package vsePlaneti.builders;

import vsePlaneti.Utils;
import vsePlaneti.entities.Civilization;
import vsePlaneti.entities.Planet;
import javafx.util.Builder;

import java.util.Random;

/**
 * Created by vladimir on 18.07.17.
 */
public class PlanetBuilder implements Builder<Planet> {

    private Planet planet;

    private static final Random random = new Random();

    public PlanetBuilder() {
        this.planet = new  Planet(null, random.nextBoolean(),random.nextBoolean(),
                Utils.getPlanetName(),2374 + (Math.random()*137448),
                1.303e22+(Math.random()*1.89858697E27),
                0.46+(Math.random()*48.85),60 +(Math.random()*640),
                random.nextBoolean());
    }

    public PlanetBuilder setOwner (Civilization owner){

        planet.setOwner(owner);

        return this;
    }

    public PlanetBuilder setAtmosfir (boolean atmosfir){

        planet.setHasAtmosfere(atmosfir);

        return this;
    }

    public PlanetBuilder setGround (boolean ground ){
        planet.setHasGround(ground);

        return this;
    }

    public PlanetBuilder setName (String namePlanet){

        planet.setNamePlanet(namePlanet);

        return this;
    }

    public PlanetBuilder setsizePlanet( double sizePlanet){

        planet.setSizePlanet(sizePlanet);

        return this;
    }


    public PlanetBuilder setMassPlanet(double massPlanet){

        planet.setMassPlanet(massPlanet);

        return this;
    }


    public PlanetBuilder setDistanceToTheStar(double distanceToTheStar){

        planet.setDistanceToTheStar( distanceToTheStar);

        return this;
    }

    public PlanetBuilder setTemperatur (double temperatur){

        planet.setTemperature(temperatur);

        return this;
    }


    public PlanetBuilder setHasLiquidWater(boolean hasLiquidWater){

        planet.setHasLiquidWater(hasLiquidWater);

        return this;
    }



















    @Override
    public Planet build() {
        return planet;
    }
}
