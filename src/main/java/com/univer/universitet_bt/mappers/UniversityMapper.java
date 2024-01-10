package com.univer.universitet_bt.mappers;

import com.univer.universitet_bt.DTO.UniversityDTO;
import com.univer.universitet_bt.entity.University;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UniversityMapper {
    UniversityMapper INSTANCE = Mappers.getMapper(UniversityMapper.class);

    @Mapping(source = "region.id", target = "regionId")
    UniversityDTO universityToUniversityDTO(University university);

    @Mapping(source = "regionId", target = "region.id")
    University universityDTOToUniversity(UniversityDTO universityDTO);
}
