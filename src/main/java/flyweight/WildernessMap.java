package flyweight;


import javafx.scene.canvas.Canvas;

import java.util.Random;

public class WildernessMap extends GameMap {

    static Random random = new Random();
    static TileType[] wilderTileNames = {TileType.SWAMP, TileType.WATER, TileType.FOREST};

    public WildernessMap(Canvas canvas) {
        super(canvas);
    }


    @Override
    public Tile createTile() {
        int num = random.nextInt(wilderTileNames.length);
        return switch (wilderTileNames[num]) {
            case SWAMP -> new SwampTile();
            case WATER -> new WaterTile();
            case FOREST -> new ForestTile();
            default -> throw new IllegalArgumentException("Unknown map type");
        };
    }
}
