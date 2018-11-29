package ee.sdacademy.thymleaf.contacts.repository;

        import org.springframework.data.repository.CrudRepository;

        import ee.sdacademy.thymleaf.contacts.domain.Contact;

        import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

    List<Contact> findAll();
}
