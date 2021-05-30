package com.company;

import okhttp3.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Objects;

public class YaPogoda {
        public static void main(String[] args) throws IOException, MalformedURLException{

        OkHttpClient okHttpClient = new OkHttpClient();

        String requestBody = "GET https://api.weather.yandex.ru/v1/forecast?\n" +
                " lat=<54.70739>\n" +
                " & lon=<20.507307>" +
                " & [lang=<\"ru_RU\">]\n" +
                " & [limit=<7>]\n" +
                " & [hours=<«true»>]\n" +
                " & [extra=<«true»>]\n" +
                "\n" +
                "X-Yandex-API-Key: <a653e609-ef9b-4cb8-b198-a04108bceafb>";
                MediaType JSON = MediaType.parse("JSON");
                RequestBody requestBodyWeather = RequestBody.create(requestBody, JSON);
                Request request = new Request.Builder()
                        .url("https://api.weather.yandex.ru/v2/forecast?")
                        .post(requestBodyWeather)
                        .build();

                Response response = okHttpClient.newCall(request).execute();
                String body = Objects.requireNonNull(response.body()).string();
                System.out.println(Objects.requireNonNull(response.body()).string());
    }
}
