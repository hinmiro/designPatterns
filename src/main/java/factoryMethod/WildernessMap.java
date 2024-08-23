package factoryMethod;


import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class WildernessMap extends GameMap {

    static Random random = new Random();
    static String[] wilderTileNames = {"swamp", "water", "forest"};


    @Override
    public Tile createTile() {
        int num = random.nextInt(wilderTileNames.length);
        return switch (wilderTileNames[num]) {
            case "swamp" -> new SwampTile();
            case "water" -> new WaterTile();
            case "forest" -> new ForestTile();
            default -> throw new IllegalArgumentException("Unknown map type");
        };
    }
}
