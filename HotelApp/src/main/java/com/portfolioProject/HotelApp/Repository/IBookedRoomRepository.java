package com.portfolioProject.HotelApp.Repository;

import com.portfolioProject.HotelApp.Model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookedRoomRepository extends JpaRepository<BookedRoom, Long> {
}
