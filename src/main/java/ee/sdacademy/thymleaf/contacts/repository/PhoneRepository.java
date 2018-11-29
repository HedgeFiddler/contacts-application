package ee.sdacademy.thymleaf.contacts.repository;

import ee.sdacademy.thymleaf.contacts.domain.Phone;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhoneRepository extends CrudRepository<Phone, Integer> {

    List<Phone> findAllByContactid(Integer contactId);

}
