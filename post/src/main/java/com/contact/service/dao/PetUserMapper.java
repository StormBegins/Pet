package com.contact.service.dao;

import com.contact.service.entity.PetUser;
import java.util.List;

public interface PetUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_user
     *
     * @mbg.generated
     */
    int insert(PetUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_user
     *
     * @mbg.generated
     */
    List<PetUser> selectAll();
}