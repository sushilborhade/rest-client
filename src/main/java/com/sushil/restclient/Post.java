package com.sushil.restclient;

public record Post(Integer userId,
                   Integer id,
                   String title,
                   String body) {
}
