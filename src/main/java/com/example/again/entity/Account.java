package com.example.again.entity;

import com.example.again.validator.ValidateXSourceValue;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.Date;

@Entity
@Table(name = "account", schema = "public")
public class Account
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ValidateXSourceValue(allowedValues = {"bank", "gosuslugi"})
    @Column
    private Integer bank_id;

    @ValidateXSourceValue(allowedValues = {"bank", "gosuslugi"})
    @Column
    private String lastName;

    @ValidateXSourceValue(allowedValues = {"mail", "bank", "gosuslugi"})
    @Column
    private String firstName;

    @ValidateXSourceValue(allowedValues = {"bank", "gosuslugi"})
    @Column
    private String middleName;

    @ValidateXSourceValue(allowedValues = {"bank", "gosuslugi"})
    @Column
    private Date dateOfBirth;

    @ValidateXSourceValue(allowedValues = {"bank", "gosuslugi"})
    @Column
    private String passportNumber;

    @ValidateXSourceValue(allowedValues = {"bank", "gosuslugi"})
    @Column
    private String placeOfBirth;

    @ValidateXSourceValue(allowedValues = {"mobile", "bank", "gosuslugi"})
    @Column
    private String phoneNumber;

    @ValidateXSourceValue(allowedValues = "mail")
    @Column
    private String email;

    @ValidateXSourceValue(allowedValues = {"gosuslugi"})
    @Column
    private String registrationAddress;

    @Column
    private String livingAddress;

    public Account() {}

    Account(int bank_id, String lastName, String firstName, String middleName, Date dateOfBirth,
            String passportNumber, String placeOfBirth, String phoneNumber, String email, String registrationAddress,
            String livingAddress) {
        this.bank_id = bank_id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.passportNumber = passportNumber;
        this.placeOfBirth = placeOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registrationAddress = registrationAddress;
        this.livingAddress = livingAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if(!(o instanceof Account))
//            return false;
//
//        Account account = (Account) o;
//        return Objects.equals()
//    }
}
