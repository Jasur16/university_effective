package com.univer.universitet_bt.service;

import com.univer.universitet_bt.DTO.UniversityDTO;
import com.univer.universitet_bt.entity.Region;
import com.univer.universitet_bt.entity.University;
import com.univer.universitet_bt.mappers.UniversityMapper;
import com.univer.universitet_bt.repository.RegionRepository;
import com.univer.universitet_bt.repository.UniversityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UniversityService {
    private final UniversityRepository universityRepository;
    private final UniversityMapper universityMapper;
    private final RegionRepository regionRepository;


    public University createUniversityFromDTO(UniversityDTO universityDTO) {
        University university = new University();
        Region region = regionRepository.findById(universityDTO.getRegionId()).orElse(null);
        university.setRegion(region);
        university.setName(universityDTO.getName());

        return universityRepository.save(university);
    }
}