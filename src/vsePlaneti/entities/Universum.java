package vsePlaneti.entities;

import java.util.List;

/**
 * Created by vladimir on 18.07.17.
 */
public class Universum {

    private List <vsePlaneti.entities.Galactos> galactos;

    private String nameUniversum;

    public Universum(List<vsePlaneti.entities.Galactos> galactos, String nameUniversum) {
        this.galactos = galactos;
        this.nameUniversum = nameUniversum;
    }
}
