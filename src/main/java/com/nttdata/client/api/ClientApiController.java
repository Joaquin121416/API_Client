package com.nttdata.client.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Generated;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-27T10:19:11.588399700-05:00[America/Lima]")
@Controller
@RequestMapping(value = "/client",produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientApiController implements ClientApi {

    private final ClientApiDelegate delegate;

    public ClientApiController(@Autowired(required = false) ClientApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ClientApiDelegate() {});
    }

    @Override
    public ClientApiDelegate getDelegate() {
        return delegate;
    }

}
