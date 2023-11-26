/*
 * This file is generated by jOOQ.
 */
package com.keval.app.generated.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String firstName;
    private String lastName;
    private String address;

    public User() {}

    public User(User value) {
        this.userId = value.userId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.address = value.address;
    }

    public User(
        Integer userId,
        String firstName,
        String lastName,
        String address
    ) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    /**
     * Getter for <code>testdb.user.user_id</code>.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>testdb.user.user_id</code>.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>testdb.user.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>testdb.user.first_name</code>.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for <code>testdb.user.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>testdb.user.last_name</code>.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for <code>testdb.user.address</code>.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>testdb.user.address</code>.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!this.userId.equals(other.userId))
            return false;
        if (this.firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!this.firstName.equals(other.firstName))
            return false;
        if (this.lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!this.lastName.equals(other.lastName))
            return false;
        if (this.address == null) {
            if (other.address != null)
                return false;
        }
        else if (!this.address.equals(other.address))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(userId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(address);

        sb.append(")");
        return sb.toString();
    }
}