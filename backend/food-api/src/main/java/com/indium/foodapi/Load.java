package com.indium.foodapi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Load {
    public static void main(String[] args) {
        List<Long> numbers = new ArrayList<>();
        LongStream.range(0, 1000000).forEach(i -> numbers.add(i));
        HttpClient client = HttpClient.newHttpClient();
        numbers
                .parallelStream()
                .forEach(i -> {
                    client.sendAsync(HttpRequest.newBuilder()
                                    .uri(URI.create("http://localhost:30001/orders?foodItems=food" + i))
                                    .POST(HttpRequest.BodyPublishers.noBody())
                                    .build(), HttpResponse.BodyHandlers.ofString())
                            .thenApply(HttpResponse::body)
                            .thenAccept(response -> System.out.println(response))
                            .join();
                });
    }
}
