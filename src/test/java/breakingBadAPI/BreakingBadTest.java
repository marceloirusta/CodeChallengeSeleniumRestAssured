package breakingBadAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;

import static io.restassured.RestAssured.given;


public class BreakingBadTest {


    @Test
    public void printBirthday() throws UnsupportedEncodingException {

        String url = "https://www.breakingbadapi.com/api/characters?name=Walter+White";
        String resultURL = java.net.URLDecoder.decode(url, "UTF-8");

        Response response = given()
                .when()
                .get(resultURL);

        Assert.assertTrue(response.asString().contains("Walter White"), "Request doesn't contain Walter White");

        String birthday = response.then().extract().path("birthday").toString();
        System.out.println("Walter White's birthday: "+ birthday);
    }

    @Test
    public void printAllCharacters() throws UnsupportedEncodingException {

        for (int i = 1; i< 63; i ++){
            if(i > 57 && i < 112){
                continue;
            }
            String url = "https://www.breakingbadapi.com/api/characters/"+i;
            String resultURL = java.net.URLDecoder.decode(url, "UTF-8");

            Response response = given()
                    .when()
                    .get(resultURL);

            String jsonStr = response.asString();
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                Character[] character = objectMapper.readValue(jsonStr, Character[].class);
                System.out.println("Character name: \"" + character[0].getName() + "\"");
                System.out.println("Portrayed: \"" + character[0].getPortrayed() + "\"");
                System.out.println("----------------------------------------------------");
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }

    }

}
