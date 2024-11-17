package flyweight;

import javafx.scene.image.Image;

public class TileImage {
    private final Image tile;
    private final TileType type;


    public TileImage(TileType type ) {
       this.type = type;
       this.tile = TileGraphicFactory.getTileImage(type);
    }


    public Image getImage() { return tile; }
}
