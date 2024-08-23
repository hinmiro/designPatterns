package factoryMethod;


public abstract class GameMap {
    Tile[][] tiles;
    int rows = 10;
    int columns = 10;

    public GameMap() {
        tiles = new Tile[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    Tile createTile() {
        return null;
    }

    void display() {
        for (Tile[] tile : tiles) {
            for (Tile value : tile) {
                System.out.print(value.getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
