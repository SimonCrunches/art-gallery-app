package com.safonov.galleryservice.ArtGalleryApplication.model.logic;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.safonov.galleryservice.ArtGalleryApplication.model.gallery.ReservationModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class PayForReservationModel {
    @NotBlank(message = "owner is mandatory")
    @JsonProperty("owner")
    private Long ownerId;

    @JsonProperty("reservation")
    private ReservationModel reservation;
}
