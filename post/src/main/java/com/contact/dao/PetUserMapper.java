package com.contact.dao;

import com.contact.entity.PetUser;
import java.util.List;

public interface PetUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetUser record);

    PetUser selectByPrimaryKey(Integer id);

    List<PetUser> selectAll();

    int updateByPrimaryKey(PetUser record);
}