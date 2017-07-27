package vsePlaneti.entities;



import java.util.List;

/**
 * Created by vladimir on 18.07.17.
 */
public class Galactos {

    private String nameStarSystem;

    private List <StarSystem> starSystem;

    public Galactos(String nameStarSystem, List<StarSystem> starSystem) {
        this.nameStarSystem = nameStarSystem;
        this.starSystem = starSystem;
    }
}
