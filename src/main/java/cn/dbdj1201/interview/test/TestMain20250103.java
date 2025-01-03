package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Slf4j
public class TestMain20250103 {

    private static final String API_KEY = "RGAPI-3f9b6eab-7c0e-4e3a-9dc3-b4eaa1725496";
    private static final String REGION = "kr";
    private static final String ENDPOINT = "https://" + REGION + ".api.riotgames.com";
    private static final String QUEUE = "RANKED_SOLO_5x5";
    private static final String API_URL = ENDPOINT + "/lol/league/v4/challengerleagues/by-queue/" + QUEUE;

    public static void main(String[] args) {
        try {
            URL url = new URL(API_URL);
            System.out.println(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Riot-Token", API_KEY);

            int responseCode = connection.getResponseCode();
            System.out.println("响应状态码: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // 使用 Gson 解析 JSON 数据
//                JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();
                System.out.println("排行榜数据: " + response.toString());
            } else {
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                String errorLine;
                StringBuilder errorResponse = new StringBuilder();

                while ((errorLine = errorReader.readLine()) != null) {
                    errorResponse.append(errorLine);
                }
                errorReader.close();

                System.out.println("请求失败，错误信息: " + errorResponse.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
