package com.storeRoom.storeRoom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storeRoom.storeRoom.entity.Room;

@Repository

public interface RoomRepository extends JpaRepository<Room, Integer>{

}
