import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeletionTestExample {

    private final String PATH = "http://dummy.restapiexample.com/api/v1";

    @Test
    public void shouldDeleteEmployee() {
        given()
        .when()
               .delete(PATH + "/delete/4269")
        .then()
               .log()
               .status()
               .statusCode(200);

        given()
        .when()
                .get(PATH + "/employee/4269")
        .then()
                .log()
                .status()
                .statusCode(404);
    }
}
