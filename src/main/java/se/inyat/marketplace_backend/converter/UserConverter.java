package se.inyat.marketplace_backend.converter;

import org.springframework.stereotype.Component;
import se.inyat.marketplace_backend.model.dto.AdvertisementView;
import se.inyat.marketplace_backend.model.dto.UserView;
import se.inyat.marketplace_backend.model.entity.User;

import java.util.stream.Collectors;

/**
 * Converter for User entities to DTOs.
 */
@Component
public class UserConverter {

    /**
     * Converts a User entity to a UserView DTO.
     *
     * @param user the user entity
     * @return the user view
     */
    public UserView convertToView(User user) {
        UserView userView = new UserView();
        userView.setId(user.getId());
        userView.setEmail(user.getEmail());
        userView.setUsername(user.getUsername());
        userView.setAdvertisements(user.getAdvertisements().stream().map(ad -> {
            AdvertisementView adView = new AdvertisementView();
            adView.setId(ad.getId());
            adView.setTitle(ad.getTitle());
            adView.setDescription(ad.getDescription());
            adView.setExpirationDate(ad.getExpirationDate());
            adView.setUser(null); // Avoid recursion
            return adView;
        }).collect(Collectors.toList()));
        return userView;
    }
}