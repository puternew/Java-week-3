/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.model;

/**
 *
 * @author INT105
 */
public class Address {
     private String houseNo;
    private String street;
    private String province;
    private String zipCode;

    public Address() {
    }

    public Address(String houseNo, String street, String province, String zipCode) {
        this.houseNo = houseNo;
        this.street = street;
        this.province = province;
        this.zipCode = zipCode;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", street=" + street + ", province=" + province + ", zipCode=" + zipCode + '}';
    }
    

}
