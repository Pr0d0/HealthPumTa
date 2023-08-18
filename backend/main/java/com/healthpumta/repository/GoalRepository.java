package com.healthpumta.repository;

import com.healthpumta.domain.Exercise;
import com.healthpumta.domain.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Long> {
    List<Goal> findByExercise(Exercise exercise);
}
