package com.univer.universitet_bt.service;

import com.univer.universitet_bt.DTO.RegionDTO;
import com.univer.universitet_bt.entity.Region;
import com.univer.universitet_bt.mappers.RegionMapper;
import com.univer.universitet_bt.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository regionRepository;
    private final RegionMapper regionMapper;


    public RegionDTO createRegion(RegionDTO regionDTO) {
        Region region = regionMapper.regionDTOToRegion(regionDTO);
        return regionMapper.regionToRegionDTO(regionRepository.save(region));
    }

}