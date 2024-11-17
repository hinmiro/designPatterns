package flyweight;

import javafx.scene.image.Image;

public class ForestTile implements Tile {
    private TileImage image;

    public ForestTile() {
        image = new TileImage(TileType.FOREST);
    }

    @Override
    public String getCharacter() {
        return "F";
    }

    @Override
    public TileType getType() {
        return TileType.FOREST;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }

}
