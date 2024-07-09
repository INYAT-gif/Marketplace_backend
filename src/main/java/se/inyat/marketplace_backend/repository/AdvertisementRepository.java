package se.inyat.marketplace_backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import se.inyat.marketplace_backend.model.entity.Advertisement;

import java.time.LocalDate;
import java.util.List;

/**
 * Repository for Advertisement entities.
 */
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    /**
     * Finds all advertisements with an expiration date after the specified date.
     *
     * @param date the date to compare with
     * @return a list of advertisements
     */
    List<Advertisement> findByExpirationDateAfter(LocalDate date);
}