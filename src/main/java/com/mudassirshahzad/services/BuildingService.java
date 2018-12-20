/**
 * 
 */
package com.mudassirshahzad.services;

import com.mudassirshahzad.entities.Building;

import java.util.List;

import javax.validation.Valid;

/**
 * @author Mudassir Shahzad
 * 20 Dec 2018
 */
public interface BuildingService {

    Building save(@Valid Building building);

    Building findById(String buildingId);

    List<Building> findByCompanyId(String companyId);

    Building findByCompanyAndAreaId(String companyId, String areaId);

    List<Building> findByCompanyIdAndNameLike(String companyId, String name, int page);

    List<Building> findByPhoneNumber(String telephoneNumber);

    Long countBuildings(String companyId);

}
