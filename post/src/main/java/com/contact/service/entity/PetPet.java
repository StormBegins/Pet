package com.contact.service.entity;

public class PetPet {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_pet.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_pet.tagId
     *
     * @mbg.generated
     */
    private Integer tagid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_pet.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_pet.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_pet.id
     *
     * @return the value of pet_pet.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_pet.id
     *
     * @param id the value for pet_pet.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_pet.tagId
     *
     * @return the value of pet_pet.tagId
     *
     * @mbg.generated
     */
    public Integer getTagid() {
        return tagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_pet.tagId
     *
     * @param tagid the value for pet_pet.tagId
     *
     * @mbg.generated
     */
    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_pet.name
     *
     * @return the value of pet_pet.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_pet.name
     *
     * @param name the value for pet_pet.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_pet.status
     *
     * @return the value of pet_pet.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_pet.status
     *
     * @param status the value for pet_pet.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}