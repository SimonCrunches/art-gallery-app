package com.safonov.galleryservice.ArtGalleryApplication.entity.actor;

import com.safonov.galleryservice.ArtGalleryApplication.entity.gallery.ClientOwnerPayment;
import com.safonov.galleryservice.ArtGalleryApplication.entity.gallery.OwnerArtistPayment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "owner")
@EqualsAndHashCode(callSuper = true)
public class Owner extends User {

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<ClientOwnerPayment> clientOwnerPayments = new HashSet<>();

    @OneToMany(mappedBy = "artist", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<OwnerArtistPayment> ownerArtistPayments = new HashSet<>();

    public Owner(@NotNull final String firstName,
                 @NotNull final String secondName) {
        this.firstName = firstName;
        this.lastName = secondName;
    }
}
