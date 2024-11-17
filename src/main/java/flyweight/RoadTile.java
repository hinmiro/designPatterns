package flyweight;

import javafx.scene.image.Image;

public class RoadTile implements Tile {
    private TileImage image;

    public RoadTile() {
        this.image = new TileImage(TileType.ROAD);
    }

    @Override
    public String getCharacter() {
        return "R";
    }

    public TileType getType() {
        return TileType.ROAD;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }
}
