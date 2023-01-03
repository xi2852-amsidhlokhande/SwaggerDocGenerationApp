package com.amsidh.mvc.api;

import com.amsidh.mvc.model.Error;
import com.amsidh.mvc.model.Pet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-03T20:07:03.019472900+05:30[Asia/Calcutta]")
@Controller
public class PetsApiController implements PetsApi {

    private final PetsApiDelegate delegate;

    public PetsApiController(@Autowired(required = false) PetsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PetsApiDelegate() {});
    }

    @Override
    public PetsApiDelegate getDelegate() {
        return delegate;
    }

}
