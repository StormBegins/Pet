package com.contact.service.dao;

import com.contact.service.entity.PetCategory;
import java.util.List;

public interface PetCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_category
     *
     * @mbg.generated
     */
    int insert(PetCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_category
     *
     * @mbg.generated
     */
    List<PetCategory> selectAll();
}