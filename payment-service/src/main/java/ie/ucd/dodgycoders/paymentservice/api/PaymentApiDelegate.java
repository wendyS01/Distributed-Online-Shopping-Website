package ie.ucd.dodgycoders.paymentservice.api;

import ie.ucd.dodgycoders.paymentservice.api.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link PaymentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T17:33:14.335Z[Europe/Dublin]")
public interface PaymentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /payment : add new payment
     *
     * @param payment  (optional)
     * @return Invalid input (status code 405)
     * @see PaymentApi#addPayment
     */
    default ResponseEntity<Void> addPayment(Payment payment) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /payment/{paymentId} : Get all the payments
     *
     * @param paymentId ID of the payment (required)
     * @return successfully get all payments (status code 200)
     *         or Invalid ID (status code 400)
     *         or Payments not found (status code 404)
     * @see PaymentApi#getAllPayment
     */
    default ResponseEntity<Payment> getAllPayment(Long paymentId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"paymentPlacedTime\" : \"2022-11-11T15:30:45Z\", \"amount\" : 66, \"userId\" : 1, \"paymentStatus\" : \"pendding\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
