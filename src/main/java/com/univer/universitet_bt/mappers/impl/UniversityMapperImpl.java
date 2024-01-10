package com.univer.universitet_bt.mappers.impl;

import com.univer.universitet_bt.DTO.UniversityDTO;
import com.univer.universitet_bt.entity.University;
import com.univer.universitet_bt.mappers.UniversityMapper;
import org.springframework.stereotype.Component;

@Component
public class UniversityMapperImpl implements UniversityMapper {

    @Override
    public UniversityDTO universityToUniversityDTO(University university) {
        if (university == null) {
            return null;
        }

        UniversityDTO universityDTO = new UniversityDTO();

        universityDTO.setId(university.getId());
        universityDTO.setName(university.getName());
        universityDTO.setRegionId(university.getRegion() != null ? university.getRegion().getId() : null);

        return universityDTO;
    }

    @Override
    public University universityDTOToUniversity(UniversityDTO universityDTO) {
        if (universityDTO == null) {
            return null;
        }

        University university = new University();

        university.setId(universityDTO.getId());
        university.setName(universityDTO.getName());


        return university;
    }
}