package com.univer.universitet_bt.mappers;

import com.univer.universitet_bt.DTO.RegionDTO;
import com.univer.universitet_bt.entity.Region;
import org.mapstruct.Mapper;

@Mapper
public interface RegionMapper {
    RegionDTO regionToRegionDTO(Region region);
    Region regionDTOToRegion(RegionDTO regionDTO);
}
