package com.contact.service.dao;

import com.contact.service.entity.PetOrder;
import java.util.List;

public interface PetOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_order
     *
     * @mbg.generated
     */
    int insert(PetOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_order
     *
     * @mbg.generated
     */
    List<PetOrder> selectAll();
}