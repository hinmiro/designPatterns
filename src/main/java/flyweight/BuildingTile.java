package flyweight;

import javafx.scene.image.Image;

public class BuildingTile implements Tile {
    private TileImage image;

    public BuildingTile() {
        this.image = new TileImage(TileType.BUILDING);
    }

    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public TileType getType() {
        return TileType.BUILDING;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }
}
