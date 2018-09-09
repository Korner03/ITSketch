package com.example.user.myapplication;

public class MessagePojo {

    private String name;
    private PortfolioActivity.ROOM_TYPES roomType;

    MessagePojo(String name, PortfolioActivity.ROOM_TYPES roomType) {
        this.name = name;
        this.roomType = roomType;
    }

    public String getName()
    {
        return name;
    }

    public String getFileName() {
        return name + "_" + roomType.toString();
    }

    public PortfolioActivity.ROOM_TYPES getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return name + ", " + roomType.toString();
    }
}
