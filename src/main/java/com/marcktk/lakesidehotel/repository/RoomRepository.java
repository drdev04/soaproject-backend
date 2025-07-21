package com.marcktk.lakesidehotel.repository;

import com.marcktk.lakesidehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
