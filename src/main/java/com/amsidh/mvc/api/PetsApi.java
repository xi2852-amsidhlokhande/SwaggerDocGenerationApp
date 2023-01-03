/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.amsidh.mvc.api;

import com.amsidh.mvc.model.Error;
import com.amsidh.mvc.model.Pet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-03T19:26:23.961218200+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "pets", description = "the pets API")
@RequestMapping("${openapi.swaggerPetstore.base-path:}")
public interface PetsApi {

    default PetsApiDelegate getDelegate() {
        return new PetsApiDelegate() {};
    }

    /**
     * POST /pets : Create a pet
     *
     * @return Null response (status code 201)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "createPets",
        summary = "Create a pet",
        tags = { "pets" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Null response"),
            @ApiResponse(responseCode = "200", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pets",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> createPets(
        
    ) {
        return getDelegate().createPets();
    }


    /**
     * GET /pets : List all pets
     *
     * @param limit How many items to return at one time (max 100) (optional)
     * @return A paged array of pets (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "listPets",
        summary = "List all pets",
        tags = { "pets" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A paged array of pets", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "200", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pets",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Pet>> listPets(
        @Parameter(name = "limit", description = "How many items to return at one time (max 100)") @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        return getDelegate().listPets(limit);
    }


    /**
     * GET /pets/{petId} : Info for a specific pet
     *
     * @param petId The id of the pet to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "showPetById",
        summary = "Info for a specific pet",
        tags = { "pets" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "200", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pets/{petId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Pet> showPetById(
        @Parameter(name = "petId", description = "The id of the pet to retrieve", required = true) @PathVariable("petId") String petId
    ) {
        return getDelegate().showPetById(petId);
    }

}