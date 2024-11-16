package flyweight;

public class BuildingTile implements Tile {

    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public String getType() {
        return "building";
    }
}
