package factoryMethod;

public class SwampTile implements Tile{

    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public String getType() {
        return "swamp";
    }
}
