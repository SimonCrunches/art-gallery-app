package com.safonov.galleryservice.ArtGalleryApplication.controller;

import com.safonov.galleryservice.ArtGalleryApplication.data.actor.CredentialsRepository;
import com.safonov.galleryservice.ArtGalleryApplication.data.actor.RoleRepository;
import com.safonov.galleryservice.ArtGalleryApplication.entity.actor.Role;
import com.safonov.galleryservice.ArtGalleryApplication.model.gallery.CredentialsModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class BackendController {

    private final RoleRepository roleRepository;
    private final CredentialsRepository credentialsRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public BackendController(@NotNull final RoleRepository roleRepository,
                             @NotNull final CredentialsRepository credentialsRepository) {
        this.roleRepository = roleRepository;
        this.credentialsRepository = credentialsRepository;
    }

    @GetMapping("/roles")
    public ResponseEntity<Object> getRoles() {
        return ResponseEntity.ok(roleRepository.findAll()
                .stream()
                .map(Role::getName)
                .collect(Collectors.toList()));
    }

    @GetMapping("/users")
    public ResponseEntity<Object> getUsers() {
        return ResponseEntity.ok(credentialsRepository.findAll()
                .stream()
                .map(user -> modelMapper.map(user, CredentialsModel.class))
                .collect(Collectors.toList()));
    }
}