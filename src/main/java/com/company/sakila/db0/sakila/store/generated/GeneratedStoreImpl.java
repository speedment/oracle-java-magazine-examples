package com.company.sakila.db0.sakila.store.generated;

import com.company.sakila.db0.sakila.address.Address;
import com.company.sakila.db0.sakila.staff.Staff;
import com.company.sakila.db0.sakila.store.Store;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.db0.sakila.store.Store}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedStoreImpl implements Store {
    
    private short storeId;
    private short managerStaffId;
    private int addressId;
    private Timestamp lastUpdate;
    
    protected GeneratedStoreImpl() {
        
    }
    
    @Override
    public short getStoreId() {
        return storeId;
    }
    
    @Override
    public short getManagerStaffId() {
        return managerStaffId;
    }
    
    @Override
    public int getAddressId() {
        return addressId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Store setStoreId(short storeId) {
        this.storeId = storeId;
        return this;
    }
    
    @Override
    public Store setManagerStaffId(short managerStaffId) {
        this.managerStaffId = managerStaffId;
        return this;
    }
    
    @Override
    public Store setAddressId(int addressId) {
        this.addressId = addressId;
        return this;
    }
    
    @Override
    public Store setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Staff findManagerStaffId(Manager<Staff> foreignManager) {
        return foreignManager.stream().filter(Staff.STAFF_ID.equal(getManagerStaffId())).findAny().orElse(null);
    }
    
    @Override
    public Address findAddressId(Manager<Address> foreignManager) {
        return foreignManager.stream().filter(Address.ADDRESS_ID.equal(getAddressId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("storeId = "        + Objects.toString(getStoreId()));
        sj.add("managerStaffId = " + Objects.toString(getManagerStaffId()));
        sj.add("addressId = "      + Objects.toString(getAddressId()));
        sj.add("lastUpdate = "     + Objects.toString(getLastUpdate()));
        return "StoreImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Store)) { return false; }
        final Store thatStore = (Store)that;
        if (this.getStoreId() != thatStore.getStoreId()) {return false; }
        if (this.getManagerStaffId() != thatStore.getManagerStaffId()) {return false; }
        if (this.getAddressId() != thatStore.getAddressId()) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatStore.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getStoreId());
        hash = 31 * hash + Short.hashCode(getManagerStaffId());
        hash = 31 * hash + Integer.hashCode(getAddressId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}