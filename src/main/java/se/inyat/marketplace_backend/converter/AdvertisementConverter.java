package se.inyat.marketplace_backend.converter;

import org.springframework.stereotype.Component;
import se.inyat.marketplace_backend.model.dto.AdvertisementView;
import se.inyat.marketplace_backend.model.entity.Advertisement;

/**
 * Converter for Advertisement entities to DTOs.
 */
@Component
public class AdvertisementConverter {

    /**
     * Converts an Advertisement entity to an AdvertisementView DTO.
     *
     * @param advertisement the advertisement entity
     * @return the advertisement view
     */
    public AdvertisementView convertToView(Advertisement advertisement) {
        AdvertisementView advertisementView = new AdvertisementView();
        advertisementView.setId(advertisement.getId());
        advertisementView.setTitle(advertisement.getTitle());
        advertisementView.setDescription(advertisement.getDescription());
        advertisementView.setExpirationDate(advertisement.getExpirationDate());
        advertisementView.setUser(null); // Avoid recursion
        return advertisementView;
    }
}