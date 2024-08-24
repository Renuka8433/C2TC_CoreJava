package com.tnsif.sm.storeservice;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {

}
