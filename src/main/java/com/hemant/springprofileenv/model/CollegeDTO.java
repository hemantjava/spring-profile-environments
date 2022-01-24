package com.hemant.springprofileenv.model;

import com.hemant.springprofileenv.entity.College;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class CollegeDTO {
    private Long id;
    private String name;
    private String city;
    private String state;
    private String location;

    public static List<CollegeDTO> mapToCollege(List<College> colleges) {
       return colleges.stream().map(college ->
                CollegeDTO.builder().city(college.getCity()).id(college.getId()).name(college.getName())
                        .state(college.getState()).location(college.getLocation()).build())
               .collect(Collectors.toList());
    }
}
