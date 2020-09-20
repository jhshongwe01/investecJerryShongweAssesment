package investecApi;

import common.baseClass;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Properties;

public class investecApi {



public void getPeopleApiCall(){

    RestAssured.baseURI=readEnvironmentProperty("apiUrl");//Get url from the properties file
    RequestSpecification httpRequest=RestAssured.given().contentType("application/json");
    Response response= httpRequest.get(readEnvironmentProperty("apiEndpoint"));//get endpoint from the environment properties file
    JSONObject jsonObject = new JSONObject(response.getBody().prettyPrint());
    int statusCode=response.statusCode();//Get the response status
    Assert.assertEquals(statusCode, 200);//Assert that the call was successful

    JSONArray myResponse = jsonObject.getJSONArray("results");
    ArrayList<String> list = new ArrayList<String>();
    //Loop through the resuls array until you find R2-D2
    //use the index of to find skin_color
    //Assert that skin_color white, blue
    for(int i=0; i<myResponse.length(); i++){
        list.add(myResponse.getJSONObject(i).getString("name"));
        if(myResponse.getJSONObject(i).getString("name").equals("R2-D2")){
            String skinColour=myResponse.getJSONObject(i).getString("skin_color");
            Assert.assertEquals(skinColour,"white, blue");
        }
    }

    System.out.println(statusCode);//display status code on the console
    System.out.println(jsonObject);//display status code on the console

}

    public String readEnvironmentProperty(String property){

        Properties properties=baseClass.readPropertiesFileValues("environment.properties");
        return  properties.getProperty(property);
    }


}
