package flyweight;

import javafx.scene.canvas.Canvas;

import java.util.Random;

public class CityMap extends GameMap {

    static Random random = new Random();

    static TileType[] tileNames = {TileType.ROAD, TileType.BUILDING};

    public CityMap(Canvas canvas) {
        super(canvas);
    }

    @Override
    public Tile createTile() {
        int cityNum = random.nextInt(tileNames.length);
        return switch (tileNames[cityNum]) {
            case ROAD -> new RoadTile();
            case BUILDING -> new BuildingTile();
            default -> throw new IllegalArgumentException("Unknown map type: ");
        };
    }
}
