package flyweight;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static Map<TileType, Image> tileImages = new HashMap<>();

    public static Image getTileImage(TileType type) {
        Image image = tileImages.get(type);

        if (image == null) {
            image = loadImage(type);
            tileImages.put(type, image);
        }
        return image;
    }

    private static Image loadImage(TileType type) {
        return switch (type) {
            case BUILDING -> new Image("buildingTile.png");
            case ROAD -> new Image("roadTile.png");
            case SWAMP -> new Image("swampTile.png");
            case FOREST -> new Image("forestTile.png");
            case WATER -> new Image("waterTile.png");
        };
    }
}
