package ie.ucd.dodgycoders.paymentservice.service;

import ie.ucd.dodgycoders.paymentservice.api.repository.RecordRepository;
import ie.ucd.dodgycoders.paymentservice.api.PaymentApiDelegate;
import ie.ucd.dodgycoders.paymentservice.api.model.Payment;
import ie.ucd.dodgycoders.paymentservice.client.UserApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Service
public class PaymentApiDelegateImpl implements PaymentApiDelegate {
    private static final Logger logger = LoggerFactory.getLogger(PaymentApiDelegateImpl.class);

    @Autowired
    private UserApiClient userApiClient;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return PaymentApiDelegate.super.getRequest();
    }

    @Override
    public ResponseEntity<Void> addPayment(Payment payment) {
        logger.info("new request", payment);
        try{
            // hardcode only for test
          if(userApiClient.loginUser("mtumbridge2", "vQ9MSI1").getStatusCode().is2xxSuccessful()){
                //recordRepository.save(paymentRecords.factory(payment));
                logger.info("user login good");
            }
            else{
                logger.info("user login doesn't work");
                throw new IllegalAccessException();
            }

        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Payment> getAllPayment(Long paymentId) {
        try{
            logger.info("get all payment works");
            Payment payment = new Payment();
            //Payment payment = recordRepository.findByPaymentID(paymentId);
            return new ResponseEntity<Payment>(payment, HttpStatus.OK);
        }catch (Exception e){
            logger.info("get all payment doesn't work ");
            return new ResponseEntity<Payment>(HttpStatus.NOT_FOUND);
        }
    }
}
