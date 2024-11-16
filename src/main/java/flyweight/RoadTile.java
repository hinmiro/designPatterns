package flyweight;

public class RoadTile implements Tile {

    @Override
    public String getCharacter() {
        return "R";
    }

    public String getType() {
        return "road";
    }
}
