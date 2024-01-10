package com.univer.universitet_bt.controller;

import com.univer.universitet_bt.DTO.UniversityDTO;
import com.univer.universitet_bt.entity.University;
import com.univer.universitet_bt.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/universities")
@RequiredArgsConstructor
public class UniversityController {
    private final UniversityService universityService;


    @PostMapping("/create")
    public ResponseEntity<?> createUniversity(@RequestBody UniversityDTO universityDTO) {
        University university = universityService.createUniversityFromDTO(universityDTO);
        return ResponseEntity.ok(university);
    }
}
