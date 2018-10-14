package com.vamshimididuddi.myassistant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vamshimididuddi.myassistant.entities.Friend;

@Repository
public interface FriendDataJpaRepository extends JpaRepository<Friend,Integer> {

}
