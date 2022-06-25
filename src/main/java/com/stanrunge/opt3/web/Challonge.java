package com.stanrunge.opt3.web;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class Challonge {
    public static void getGrantRequest() {
        try {
            URL url = new URL("https://api.challonge.com/oauth/authorize");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("scope", "me tournaments:read matches:read participants:read");
            conn.setRequestProperty("client_id", "c616997cc38f36cc276aa30d1d00a0aac436d44332441bbe24189eccacf0bd89");
            conn.setRequestProperty("redirect_uri", "https://oauth.pstmn.io/v1/callback");
            conn.setRequestProperty("response_type", "code");
            conn.connect();

            InputStream is = conn.getInputStream();
            Scanner scanner = new Scanner(is);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void postRefreshTokenRequest() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://auth.challonge.com/oauth/authorize_device"))
            .header("scope", "me tournaments:read matches:read participants:read")
            .header("client_id", "c616997cc38f36cc276aa30d1d00a0aac436d44332441bbe24189eccacf0bd89")
            .header("redirect_uri", "https://oauth.pstmn.io/v1/callback")
            .header("response_type", "code")
            .GET()
            .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void getCatFact() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://meowfacts.herokuapp.com/"))
            .GET()
            .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            ObjectMapper mapper = new ObjectMapper();
            Map map = mapper.readValue(response.body(), Map.class);
            System.out.println(map.get("data"));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }
}