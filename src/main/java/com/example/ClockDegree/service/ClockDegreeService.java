package com.example.ClockDegree.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class ClockDegreeService {

    public double getAngle(LocalDateTime date) {
        String[] numbers = date.format(DateTimeFormatter.ofPattern("h:mm")).split(":");
        double hour = Double.parseDouble(numbers[0]);
        double minute = Double.parseDouble(numbers[1]);
        double hourCoef = 30;
        double minuteCoef = 6;
        double hourMinuteCoef = 0.5;

        double hourDegree = hour == 12 ? 0 : hour * hourCoef + minute * hourMinuteCoef;
        double minuteDegree = minute * minuteCoef;
        double angle = (hourDegree > minuteDegree) ? (hourDegree - minuteDegree) : (minuteDegree - hourDegree);
        return angle <= 180 ? angle : (360 - angle);
    }







}
