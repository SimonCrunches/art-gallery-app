package com.safonov.galleryservice.ArtGalleryApplication.model.gallery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class TicketModel {

    @NotNull
    @JsonProperty("reservation")
    private Long reservationId;

    @JsonProperty("expo")
    private Long expoId;

    @JsonProperty("artist")
    private Double cost;
}
