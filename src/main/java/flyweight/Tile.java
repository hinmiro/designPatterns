package flyweight;


import javafx.scene.image.Image;

public interface Tile {

    String getCharacter();

    TileType getType();

    Image getTileImage();
}
