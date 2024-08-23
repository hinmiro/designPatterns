package factoryMethod;

import java.util.Random;

public class CityMap extends GameMap {

    static Random random = new Random();

    static String[] tileNames = {"road", "building"};

    @Override
    public Tile createTile() {
        int cityNum = random.nextInt(tileNames.length);
        return switch (tileNames[cityNum]) {
            case "road" -> new RoadTile();
            case "building" -> new BuildingTile();
            default -> throw new IllegalArgumentException("Unknown map type: ");
        };
    }
}
