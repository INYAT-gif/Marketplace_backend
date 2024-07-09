package se.inyat.marketplace_backend.model.dto;

import lombok.Data;

/**
 * DTO for user authentication.
 */
@Data
public class UserForm {

    private String email;
    private String password;
}