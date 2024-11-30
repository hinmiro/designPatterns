package facade;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiFacade api = new ApiFacade("https://api.chucknorris.io/jokes/random");
        System.out.println(api.getJsonFromApi());
        api.setApiUrl("https://api.fxratesapi.com/latest");
        System.out.println(api.getJsonFromApi());
    }
}
