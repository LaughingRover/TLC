package com.company.student;

import com.company.Level;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(Long id, String name, Level level, List<Double> grades) {
        super(id, name, level, grades);
    }

    @Override
    public Double getAverageGrade() {
        return getAverageGrade() * 1.1;
    }
}
