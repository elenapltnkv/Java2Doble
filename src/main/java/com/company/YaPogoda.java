package com.company;

import okhttp3.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Period;
import java.util.Objects;


public class YaPogoda {
    private static final String PROTOCOL = "https";
    private static final String BASE_HOST = "api.weather.yandex.ru";
    private static final String VERSION = "v1";
    private static final String API_KEY = "a653e609-ef9b-4cb8-b198-a04108bceafb";
    private static final String INFOLATLON = "ourCity";
    private static final String Period = 5;


    public static void main(String[] args) throws IOException, MalformedURLException {

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


        public void getWeather(String, Period period) throws IOException {{
            if (period1 == Period.ofDays(5)) {
                HttpUrl url = new HttpUrl.Builder()
                        .scheme("https")
                        .host("api.weather.yandex.ru")
                        .addPathSegment("v2")
                        .addPathSegment("forecast")
                        .addQueryParameter("lat", "lat")
                        .addQueryParameter("lon", "lon")
                        .addQueryParameter("limit", "5")
                        .addQueryParameter("lang", "ru_RU")
                        .addQueryParameter("extra", "false")
                        .addQueryParameter("hours", "false")
                        .build();
                Request request = new Request.Builder()
                        .url(url)
                        .addHeader("X-Yandex-API-Key", "a653e609-ef9b-4cb8-b198-a04108bceafb")
                        .build();
                Response response = okHttpClient.newCall(request).execute();
                Request request1 = new Request.Builder()
                        .url("https://api.weather.yandex.ru/v2/forecast?")
                        .get()
                        .addHeader("X-Yandex-API-Key", "a653e609-ef9b-4cb8-b198-a04108bceafb")
                        .build();


                MediaType JSON = MediaType.parse("JSON");
                RequestBody requestBodyWeather = RequestBody.create(requestBody, JSON);

                String body = Objects.requireNonNull(response.body()).string();
                System.out.println(response);
            }
        }
    }


