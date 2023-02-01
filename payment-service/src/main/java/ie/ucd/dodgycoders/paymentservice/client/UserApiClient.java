package ie.ucd.dodgycoders.paymentservice.client;

import ie.ucd.dodgycoders.userservice.api.UserApi;
import ie.ucd.dodgycoders.userservice.api.config.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "${userservice.name:user-service}", url = "http://user-service", configuration = ClientConfiguration.class)
public interface UserApiClient extends UserApi {
}
