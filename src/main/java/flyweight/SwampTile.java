package flyweight;

import javafx.scene.image.Image;

public class SwampTile implements Tile {
    private TileImage image;

    public SwampTile() {
        this.image = new TileImage(TileType.SWAMP);
    }

    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public TileType getType() {
        return TileType.SWAMP;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }
}
