package org.acme.schooltimetabling.solver;

import java.time.Duration;

import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;
import org.optaplanner.core.api.score.stream.ConstraintProvider;
import org.optaplanner.core.api.score.stream.Joiners;

import org.acme.schooltimetabling.domain.Lesson;

public class TimeTableConstraintProvider implements ConstraintProvider {

    @Override
    public Constraint[] defineConstraints(ConstraintFactory constraintFactory) {
        return new Constraint[] {
                // Hard constraints
                RoomConstraintProvider.roomConflict(constraintFactory),
                TeacherConstraintProvider.teacherConflict(constraintFactory),
                TeacherConstraintProvider.teacherSubjectConflict(constraintFactory),
                StudentConstraintProvider.studentGroupConflict(constraintFactory),
                // Soft constraints
                TeacherConstraintProvider.teacherRoomStability(constraintFactory),
                StudentConstraintProvider.studentTimeEfficiency(constraintFactory),
                TeacherConstraintProvider.teacherTimeEfficiency(constraintFactory),
                StudentConstraintProvider.studentGroupSubjectVariety(constraintFactory)
        };

    }
}
