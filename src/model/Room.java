package model;

import java.util.Objects;

public class Room implements IRoom {
    private final String roomNumber;
    private final RoomType roomType;
    private final Double roomPrice;
    private final boolean isFree;

    public Room(final String roomNumber, final RoomType roomType, final Double roomPrice) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        if (roomPrice == 0) {
            isFree = true;
        } else {
            isFree = false;
        }
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return roomPrice;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public boolean isFree() {
        return isFree;
    }

    @Override
    public String toString() {
        return "\nRoom:\n" +
                "\troomNumber=" + roomNumber + "\n" +
                "\troomPrice=" + roomPrice + "\n"
        "\troomType=" + roomType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return roomNumber.equals(room.roomNumber) && roomType == room.roomType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, roomType);
    }
}
