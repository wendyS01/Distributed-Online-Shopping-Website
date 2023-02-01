package ie.ucd.dodgycoders.paymentservice.api.repository;

import ie.ucd.dodgycoders.paymentservice.api.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends MongoRepository<paymentRecords, String> {

    @Query("{paymentID:'?0'}")
    Payment findByPaymentID(Long paymentId);
}
