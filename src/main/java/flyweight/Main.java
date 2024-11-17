package flyweight;


public class Main {


//    public static GameMap createMap(String type) {
//        return switch (type) {
//            case "wilderness" -> new WildernessMap();
//            case "city" -> new CityMap();
//            default -> throw new IllegalArgumentException("Unknown map type");
//        };
//    }

    public static void main(String[] args) {
//        GameMap map = createMap("wilderness");
//        map.display();
        View.launch(View.class, args);
    }
}
