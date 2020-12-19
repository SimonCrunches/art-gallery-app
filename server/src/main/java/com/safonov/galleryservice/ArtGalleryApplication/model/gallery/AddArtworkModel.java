package com.safonov.galleryservice.ArtGalleryApplication.model.gallery;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class AddArtworkModel {
    private Long artistId;
    private ArtworkModel artwork;
}