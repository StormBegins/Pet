package com.contact.dao;

import com.contact.entity.PetCategory;
import java.util.List;

public interface PetCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetCategory record);

    PetCategory selectByPrimaryKey(Integer id);

    List<PetCategory> selectAll();

    int updateByPrimaryKey(PetCategory record);
}