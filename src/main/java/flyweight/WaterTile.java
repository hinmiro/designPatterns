package flyweight;

import javafx.scene.image.Image;

public class WaterTile implements Tile {
    private TileImage image;

    public WaterTile() {
        this.image = new TileImage(TileType.WATER);
    }

    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public TileType getType() {
        return TileType.WATER;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }
}
