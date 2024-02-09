package com.example.first.demo.mappers;


import com.example.first.demo.Entity.Reading;

import com.example.first.demo.Vo.ReadingVo;
import lombok.experimental.SuperBuilder;

import java.util.Optional;
import java.util.stream.Collectors;

@SuperBuilder
public class ReadingMapper {
    public static Reading toReading(ReadingVo reading) {
        return Reading.builder()
                .customerId(reading.getCustomerId())
                .readingId(reading.getReadingId())
                .currentReading(reading.getCurrentReading())
                .previousReading(reading.getPreviousReading())
                .readingDate(reading.getReadingDate())
                .build();
    }
    public static ReadingVo toReadingVo(Reading read) {
        return ReadingVo.builder()
                .previousReading(read.getPreviousReading())
                .currentReading(read.getCurrentReading())
                .customerId(read.getCustomerId())
                .readingDate(read.getReadingDate())
                .build();
    }

    public static ReadingVo toReadingVoList(Optional<Reading> reading) {
        return reading.map(read -> toReadingVo(read)).orElse(null);
    }

}