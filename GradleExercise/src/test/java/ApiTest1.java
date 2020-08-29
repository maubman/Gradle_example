import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;

public class ApiTest1 {

    @Test
    public void covid19(){
        RestAssured.baseURI = String.format("https://api.quarantine.country/api/v1/summary/latest");

        Response response = given()
                .header("Accept","application/json")
                .log().all()
                .get();
        assertEquals(200,response.getStatusCode());

        String body = response.getBody().asString();
        System.out.println("Body response:  " + body);
    }
}
