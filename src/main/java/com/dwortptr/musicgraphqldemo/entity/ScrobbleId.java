package com.dwortptr.musicgraphqldemo.entity;

import jakarta.persistence.Column;
import lombok.Getter;

import java.io.Serializable;

public record ScrobbleId(String utcTime, String trackId) implements Serializable{}
