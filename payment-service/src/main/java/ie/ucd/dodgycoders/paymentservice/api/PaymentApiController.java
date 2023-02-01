package ie.ucd.dodgycoders.paymentservice.api;

import ie.ucd.dodgycoders.paymentservice.api.model.Payment;


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

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T17:33:14.335Z[Europe/Dublin]")
@Controller
@RequestMapping("${openapi.dodgyDriversOnlineMallOpenAPI30.base-path:/api}")
public class PaymentApiController implements PaymentApi {

    private final PaymentApiDelegate delegate;

    public PaymentApiController(@Autowired(required = false) PaymentApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PaymentApiDelegate() {});
    }

    @Override
    public PaymentApiDelegate getDelegate() {
        return delegate;
    }

}
