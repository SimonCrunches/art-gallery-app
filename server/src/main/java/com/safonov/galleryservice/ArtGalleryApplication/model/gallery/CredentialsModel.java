package com.safonov.galleryservice.ArtGalleryApplication.model.gallery;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class CredentialsModel {
    @NotBlank
    @JsonProperty("login")
    protected String login;

    @NotBlank
    @JsonProperty("password")
    protected String password;

    @NotBlank
    @JsonProperty("email")
    protected String email;
}
