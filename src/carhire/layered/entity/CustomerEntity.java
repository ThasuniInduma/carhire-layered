/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.entity;

/**
 *
 * @author ASUS
 */
public class CustomerEntity {
    private String id;
    private String name;
    private Integer nic;
    private String address;
    private String phoneNo;

    public CustomerEntity() {
    }

    public CustomerEntity(String id, String name, Integer nic, String address, String phoneNo) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nic
     */
    public Integer getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(Integer nic) {
        this.nic = nic;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "id=" + id + ", name=" + name + ", nic=" + nic + ", address=" + address + ", phoneNo=" + phoneNo + '}';
    }
    
    
}
