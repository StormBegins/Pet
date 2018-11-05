package com.contact.dao;

import com.contact.entity.PetOrder;
import java.util.List;

public interface PetOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetOrder record);

    PetOrder selectByPrimaryKey(Integer id);

    List<PetOrder> selectAll();

    int updateByPrimaryKey(PetOrder record);
}