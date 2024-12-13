package com.edmondsinc.wishlist.model.dto;

import com.edmondsinc.wishlist.model.Wish;

import java.util.List;

public class WishListCreateDto {
    String name;
    Long userId;
    List<Long> wishIds;

    public WishListCreateDto() {
    }

    public WishListCreateDto(String name, Long userId, List<Long> wishIds) {
        this.name = name;
        this.userId = userId;
        this.wishIds = wishIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getWishIds() {
        return wishIds;
    }

    public void setWishIds(List<Long> wishIds) {
        this.wishIds = wishIds;
    }
}
