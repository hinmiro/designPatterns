package flyweight;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class GameMap {
    Tile[][] tiles;
    int rows = 10;
    int columns = 10;

    public GameMap(Canvas canvas) {
        int tileSize = 80;
        GraphicsContext gc = canvas.getGraphicsContext2D();

        tiles = new Tile[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Tile tile = createTile();
                Image img = TileGraphicFactory.getTileImage(tile.getType());
                gc.drawImage(img, j * tileSize, i * tileSize, tileSize, tileSize);
                tiles[i][j] = tile;
            }
        }
    }

    abstract Tile createTile();

    void display() {
        for (Tile[] tile : tiles) {
            for (Tile value : tile) {
                System.out.print(value.getCharacter() + " ");
            }
            System.out.println();
        }
    }

}
