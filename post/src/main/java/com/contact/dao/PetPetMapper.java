package com.contact.dao;

import com.contact.entity.PetPet;
import java.util.List;

public interface PetPetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetPet record);

    PetPet selectByPrimaryKey(Integer id);

    List<PetPet> selectAll();

    int updateByPrimaryKey(PetPet record);
}