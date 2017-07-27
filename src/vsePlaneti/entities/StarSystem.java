package vsePlaneti.entities;

import java.util.List;

/**
 * Created by vladimir on 18.07.17.
 */
public class StarSystem {

    private List <Star> stars;

    private List <vsePlaneti.entities.Planet> planets;

    private double size;

    public StarSystem() {
    }

    public StarSystem(List<Star> stars, List<vsePlaneti.entities.Planet> planets) {
        this.stars = stars;
        this.planets = planets;

        calculateStarSystemSize();
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
        calculateStarSystemSize();
    }

    public double getSize() {
        return size;
    }

    private void calculateStarSystemSize() {
        if (planets != null) {
            double maxDistance = Double.MIN_VALUE;

            for (int i = 0; i < planets.size(); i++) {

                if (planets.get(i).getDistanceToTheStar()>maxDistance){

                    maxDistance = planets.get(i).getDistanceToTheStar();
                }

            }

            size = maxDistance * 1.5;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\t\tStarSystem{stars: {\n");
        for (Star s : stars) {
            sb.append("\t\t\t").append(s.toString()).append(",\n");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("}").append("\n");

        sb.append("\t\tplanets: {\n");
        for (Planet planet : planets) {
            sb.append("\t\t\t").append(planet.toString()).append(",\n");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("}").append("\n");

        return sb.toString();
    }

    public static class Star{

        private String nameStar;

        private double massStar;

        private double sizeStar;

        public Star(String nameStar, double massStar, double sizeStar) {
            this.nameStar = nameStar;
            this.massStar = massStar;
            this.sizeStar = sizeStar;
        }

        @Override
        public String toString() {
            return "Star{" +
                    "nameStar='" + nameStar + '\'' +
                    ", massStar=" + massStar +
                    ", sizeStar=" + sizeStar +
                    '}';
        }
    }
}
