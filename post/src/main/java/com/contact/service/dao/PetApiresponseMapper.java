package com.contact.service.dao;

import com.contact.service.entity.PetApiresponse;
import java.util.List;

public interface PetApiresponseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_apiresponse
     *
     * @mbg.generated
     */
    int insert(PetApiresponse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_apiresponse
     *
     * @mbg.generated
     */
    List<PetApiresponse> selectAll();
}