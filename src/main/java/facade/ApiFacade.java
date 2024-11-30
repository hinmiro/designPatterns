package facade;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiFacade {
    private JSONObject jsonObject;
    private final JSONParser parser;
    private String apiUrl;

    public ApiFacade(String apiUrl) {
        this.parser = new JSONParser();
        this.apiUrl = apiUrl;
    }

    public void setApiUrl(String url) {
        this.apiUrl = url;
    }

    public String getJsonFromApi() throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return extractJokeFromJson(content.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            connection.disconnect();
        }
    }


    private String extractJokeFromJson(String json) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        jsonObject = (JSONObject) parser.parse(json);
        return gson.toJson(jsonObject);
    }

}

