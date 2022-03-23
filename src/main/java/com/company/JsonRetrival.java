package com.company;

public class JsonRetrival {
    public static void main(String[] args) {

        String jsonString = " {\n" +
                "      \"data\": [\n" +
                "        {\n" +
                "          \"op\": \"upsert\",\n" +
                "          \"path\": \"/data/hotelReservation/segments[id=1]/segmentPmsStatus\",\n" +
                "          \"value\": \"No-show\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }";

        //jsonString = jsonString.replace("\n", "");
        jsonString = jsonString.replaceAll("\\s+", "");
        jsonString.toString();
    }
}
