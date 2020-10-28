import com.fasterxml.jackson.databind.ObjectMapper;
import com.swapi.PetByID;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    @Test
    public void testswapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://petstore.swagger.io/v2/pet/9222968140491050000");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        PetByID petByID = mapper.readValue(response, PetByID.class);
        String expectedName = "doggie";
        String expectedStatus = "available";
        assertEquals(expectedName, petByID.getName());
        assertEquals(expectedStatus, petByID.getStatus());
    }
}
