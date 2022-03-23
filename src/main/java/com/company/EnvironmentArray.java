package com.company;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Locale;

public class EnvironmentArray {
    public static void main(String[] args) throws JSONException {
        String str = "{\n" +
                "  \"data\": {\n" +
                "    \"customer\": \"IHG\",\n" +
                "    \"environment\": [{\"cit\": \"Y\"}, {\"int\": \"N\"}, {\"qcpprd\": \"N\"}, {\"intprd\": \"N\"}, {\"btprd\": \"N\"}],\n" +
                "\t    \"features\":\n" +
                "      {\n" +
                "        \"featureName\": \"Rates\",\n" +
                "        \"uabName\": \"PredefinedPackages\",\n" +
                "        \"execution_Flag\": \"Y\",\n" +
                "        \"kVs\": [\n" +
                "          {\n" +
                "            \"EnablePredefinedPackages\": \"1\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"associatedUABs\": [],\n" +
                "        \"subUABs\": [],\n" +
                "        \"jobName\": \"\",\n" +
                "        \"mavenGoal\": \"**/Features/Rates/PredefinedPackages/*\"\n" +
                "      }\n" +
                "  }\n" +
                "}";

        String environmentStatus =  null;
        JSONObject jsonObject = new JSONObject(str);
        JSONArray environmentStatusArray = jsonObject.getJSONObject("data").getJSONArray("environment");
        for(int i=0; i<environmentStatusArray.length() ; i++) {
            if (environmentStatusArray.get(i).toString().contains("cit")) {
                environmentStatus = environmentStatusArray.getJSONObject(i).getString("cit").toUpperCase().trim();
                break;
            }

        }

          String featureName = jsonObject.getJSONObject("data").getJSONObject("features").getString("featureName");
          String uabName = jsonObject.getJSONObject("data").getJSONObject("features").getString("uabName");
          String executionFlag = jsonObject.getJSONObject("data").getJSONObject("features").getString("execution_Flag");
          System.out.println(featureName + uabName + executionFlag);

          JSONArray Kvs = jsonObject.getJSONObject("data").getJSONObject("features").getJSONArray("kVs");
          System.out.println("Kvs:"+Kvs);
          String KvValue = "";
          for(int kvCounter =0 ; kvCounter<Kvs.length() ; kvCounter++) {
              KvValue = Kvs.getJSONObject(kvCounter).toString();
          }
            System.out.println("KvValue:"+KvValue);
            }
}
