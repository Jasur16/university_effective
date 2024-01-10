package com.univer.universitet_bt.mappers.impl;

import com.univer.universitet_bt.DTO.RegionDTO;
import com.univer.universitet_bt.entity.Region;
import com.univer.universitet_bt.mappers.RegionMapper;
import org.springframework.stereotype.Component;

@Component
public class RegionMapperImpl implements RegionMapper {

    @Override
    public RegionDTO regionToRegionDTO(Region region) {
        if (region == null) {
            return null;
        }

        RegionDTO regionDTO = new RegionDTO();

        regionDTO.setId(region.getId());
        regionDTO.setName(region.getName());

        return regionDTO;
    }

    @Override
    public Region regionDTOToRegion(RegionDTO regionDTO) {
        if (regionDTO == null) {
            return null;
        }

        Region region = new Region();

        region.setId(regionDTO.getId());
        region.setName(regionDTO.getName());

        return region;
    }
}