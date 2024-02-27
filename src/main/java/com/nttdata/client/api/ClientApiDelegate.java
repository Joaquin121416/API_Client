package com.nttdata.client.api;

import com.nttdata.client.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * A delegate to be called by the {@link ClientApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-27T10:19:11.588399700-05:00[America/Lima]")
public interface ClientApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /client : Add a new client
     * Add a new client
     *
     * @param client Create a new client (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     * @see ClientApi#addClient
     */
    default Mono<ResponseEntity<Client>> addClient(Mono<Client> client,
                                                   ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"firstName\" : \"Joaquin\", \"lastName\" : \"Cunorana\", \"password\" : \"12345\", \"clientid\" : 10, \"phone\" : \"12345\", \"motherSurname\" : \"Jimenez\", \"email\" : \"joa@email.com\", \"username\" : \"theUser\", \"status\" : \"active\", \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ] }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                String exampleString = "<client> <clientid>10</clientid> <username>theUser</username> <firstName>Joaquin</firstName> <lastName>Cunorana</lastName> <motherSurname>Jimenez</motherSurname> <email>joa@email.com</email> <password>12345</password> <phone>12345</phone> <status>aeiou</status> <tags> <tag> <id>123456789</id> <name>aeiou</name> </tag> </tags> </client>";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        System.out.println("PUT");
        return result.then(client).then(Mono.empty());

    }

    /**
     * DELETE /client/{clientId} : Deletes a client
     * delete a client
     *
     * @param clientId Client id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid client value (status code 400)
     * @see ClientApi#deleteClient
     */
    default Mono<ResponseEntity<Void>> deleteClient(Long clientId,
        String apiKey,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * GET /client/findByStatus : Finds client by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (optional, default to active)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     * @see ClientApi#findClientByStatus
     */
    default Mono<ResponseEntity<Flux<Client>>> findClientByStatus(String status,
                                                                  ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "[ { \"firstName\" : \"Joaquin\", \"lastName\" : \"Cunorana\", \"password\" : \"12345\", \"clientid\" : 10, \"phone\" : \"12345\", \"motherSurname\" : \"Jimenez\", \"email\" : \"joa@email.com\", \"username\" : \"theUser\", \"status\" : \"active\", \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ] }, { \"firstName\" : \"Joaquin\", \"lastName\" : \"Cunorana\", \"password\" : \"12345\", \"clientid\" : 10, \"phone\" : \"12345\", \"motherSurname\" : \"Jimenez\", \"email\" : \"joa@email.com\", \"username\" : \"theUser\", \"status\" : \"active\", \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ] } ]";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                String exampleString = "<client> <clientid>10</clientid> <username>theUser</username> <firstName>Joaquin</firstName> <lastName>Cunorana</lastName> <motherSurname>Jimenez</motherSurname> <email>joa@email.com</email> <password>12345</password> <phone>12345</phone> <status>aeiou</status> <tags> <tag> <id>123456789</id> <name>aeiou</name> </tag> </tags> </client>";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /client/findByTags : Finds client by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (optional)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     * @see ClientApi#findClientByTags
     */
    default Mono<ResponseEntity<Flux<Client>>> findClientByTags(List<String> tags,
                                                                ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "[ { \"firstName\" : \"Joaquin\", \"lastName\" : \"Cunorana\", \"password\" : \"12345\", \"clientid\" : 10, \"phone\" : \"12345\", \"motherSurname\" : \"Jimenez\", \"email\" : \"joa@email.com\", \"username\" : \"theUser\", \"status\" : \"active\", \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ] }, { \"firstName\" : \"Joaquin\", \"lastName\" : \"Cunorana\", \"password\" : \"12345\", \"clientid\" : 10, \"phone\" : \"12345\", \"motherSurname\" : \"Jimenez\", \"email\" : \"joa@email.com\", \"username\" : \"theUser\", \"status\" : \"active\", \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ] } ]";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                String exampleString = "<client> <clientid>10</clientid> <username>theUser</username> <firstName>Joaquin</firstName> <lastName>Cunorana</lastName> <motherSurname>Jimenez</motherSurname> <email>joa@email.com</email> <password>12345</password> <phone>12345</phone> <status>aeiou</status> <tags> <tag> <id>123456789</id> <name>aeiou</name> </tag> </tags> </client>";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /client/{clientId} : Find client by ID
     * Returns a single client
     *
     * @param clientId ID of client to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Client not found (status code 404)
     * @see ClientApi#getClientById
     */
    default Mono<ResponseEntity<Client>> getClientById(Long clientId,
                                                       ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"firstName\" : \"Joaquin\", \"lastName\" : \"Cunorana\", \"password\" : \"12345\", \"clientid\" : 10, \"phone\" : \"12345\", \"motherSurname\" : \"Jimenez\", \"email\" : \"joa@email.com\", \"username\" : \"theUser\", \"status\" : \"active\", \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ] }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                String exampleString = "<client> <clientid>10</clientid> <username>theUser</username> <firstName>Joaquin</firstName> <lastName>Cunorana</lastName> <motherSurname>Jimenez</motherSurname> <email>joa@email.com</email> <password>12345</password> <phone>12345</phone> <status>aeiou</status> <tags> <tag> <id>123456789</id> <name>aeiou</name> </tag> </tags> </client>";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * PUT /client : Update an existing client
     * Update an existing client by Id
     *
     * @param client Update an existent client (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Client not found (status code 404)
     *         or Validation exception (status code 405)
     * @see ClientApi#updateClient
     */
    default Mono<ResponseEntity<Client>> updateClient(Mono<Client> client,
                                                      ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"firstName\" : \"Joaquin\", \"lastName\" : \"Cunorana\", \"password\" : \"12345\", \"clientid\" : 10, \"phone\" : \"12345\", \"motherSurname\" : \"Jimenez\", \"email\" : \"joa@email.com\", \"username\" : \"theUser\", \"status\" : \"active\", \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ] }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                String exampleString = "<client> <clientid>10</clientid> <username>theUser</username> <firstName>Joaquin</firstName> <lastName>Cunorana</lastName> <motherSurname>Jimenez</motherSurname> <email>joa@email.com</email> <password>12345</password> <phone>12345</phone> <status>aeiou</status> <tags> </tags> </client>";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(client).then(Mono.empty());

    }

    /**
     * POST /client/{clientId} : Updates a client with form data
     * 
     *
     * @param clientId ID of client that needs to be updated (required)
     * @param name Name of client that needs to be updated (optional)
     * @param status Status of client that needs to be updated (optional)
     * @return Invalid input (status code 405)
     * @see ClientApi#updateClientWithForm
     */
    default Mono<ResponseEntity<Void>> updateClientWithForm(Long clientId,
        String name,
        String status,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

}
