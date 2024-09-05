package com.notizen.notizennotes.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
@RedisHash
@Getter
@Setter
public class Note {
    @Id
    private Integer id;
    private String note;
}
