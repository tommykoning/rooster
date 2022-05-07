/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.acme.schooltimetabling;

import java.time.DayOfWeek;
import java.time.LocalTime;

import org.acme.schooltimetabling.domain.Lesson;
import org.acme.schooltimetabling.domain.Room;
import org.acme.schooltimetabling.domain.Teacher;
import org.acme.schooltimetabling.domain.Timeslot;
import org.acme.schooltimetabling.persistence.LessonRepository;
import org.acme.schooltimetabling.persistence.RoomRepository;
import org.acme.schooltimetabling.persistence.TeacherRepository;
import org.acme.schooltimetabling.persistence.TimeslotRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class TimeTableSpringBootApp {

    public static void main(String[] args) {
        SpringApplication.run(TimeTableSpringBootApp.class, args);
    }

    @Value("${timeTable.demoData:SMALL}")
    private DemoData demoData;

    @Bean
    public CommandLineRunner demoData(
            TimeslotRepository timeslotRepository,
            RoomRepository roomRepository,
            LessonRepository lessonRepository,
            TeacherRepository teacherRepository) {
        return (args) -> {
            if (demoData == DemoData.NONE) {
                return;
            }

            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
            if (demoData == DemoData.LARGE) {
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
            }

            roomRepository.save(new Room("Room A"));
            roomRepository.save(new Room("Room B"));
            roomRepository.save(new Room("Room C"));
            if (demoData == DemoData.LARGE) {
                roomRepository.save(new Room("Room D"));
                roomRepository.save(new Room("Room E"));
                roomRepository.save(new Room("Room F"));
            }

            teacherRepository.save(new Teacher("E.J.B. van Zon", "Math"));
            teacherRepository.save(new Teacher("B.M. Derks", "English"));
            teacherRepository.save(new Teacher("J.P. Tilma", "Spanish"));
            teacherRepository.save(new Teacher("K.J. van der Lelij", "History"));


            lessonRepository.save(new Lesson("Math", "9th grade"));
            lessonRepository.save(new Lesson("Math", "9th grade"));
            lessonRepository.save(new Lesson("History", "9th grade"));
            lessonRepository.save(new Lesson("English", "9th grade"));
            lessonRepository.save(new Lesson("English", "9th grade"));
            lessonRepository.save(new Lesson("Spanish", "9th grade"));
            lessonRepository.save(new Lesson("Spanish", "9th grade"));
            if (demoData == DemoData.LARGE) {
                lessonRepository.save(new Lesson("Math", "9th grade"));
                lessonRepository.save(new Lesson("Math", "9th grade"));
                lessonRepository.save(new Lesson("Math", "9th grade"));
                lessonRepository.save(new Lesson("History", "9th grade"));
                lessonRepository.save(new Lesson("English", "9th grade"));
            }

            lessonRepository.save(new Lesson("Math", "10th grade"));
            lessonRepository.save(new Lesson("Math", "10th grade"));
            lessonRepository.save(new Lesson("Math", "10th grade"));
            lessonRepository.save(new Lesson("History", "10th grade"));
            lessonRepository.save(new Lesson("English", "10th grade"));
            lessonRepository.save(new Lesson("Spanish", "10th grade"));
            if (demoData == DemoData.LARGE) {
                lessonRepository.save(new Lesson("Math", "10th grade"));
                lessonRepository.save(new Lesson("Math", "10th grade"));
                lessonRepository.save(new Lesson("History", "10th grade"));
                lessonRepository.save(new Lesson("English", "10th grade"));
                lessonRepository.save(new Lesson("English", "10th grade"));

                lessonRepository.save(new Lesson("Math", "11th grade"));
                lessonRepository.save(new Lesson("Math", "11th grade"));
                lessonRepository.save(new Lesson("Math", "11th grade"));
                lessonRepository.save(new Lesson("Math", "11th grade"));
                lessonRepository.save(new Lesson("Math", "11th grade"));
                lessonRepository.save(new Lesson("History", "11th grade"));
                lessonRepository.save(new Lesson("History", "11th grade"));
                lessonRepository.save(new Lesson("English", "11th grade"));
                lessonRepository.save(new Lesson("English", "11th grade"));
                lessonRepository.save(new Lesson("English", "11th grade"));
                lessonRepository.save(new Lesson("Spanish", "11th grade"));

                lessonRepository.save(new Lesson("Math", "12th grade"));
                lessonRepository.save(new Lesson("Math", "12th grade"));
                lessonRepository.save(new Lesson("Math", "12th grade"));
                lessonRepository.save(new Lesson("Math", "12th grade"));
                lessonRepository.save(new Lesson("Math", "12th grade"));
                lessonRepository.save(new Lesson("History", "12th grade"));
                lessonRepository.save(new Lesson("History", "12th grade"));
                lessonRepository.save(new Lesson("English", "12th grade"));
                lessonRepository.save(new Lesson("English", "12th grade"));
                lessonRepository.save(new Lesson("English", "12th grade"));
                lessonRepository.save(new Lesson("Spanish", "12th grade"));
            }

            Lesson lesson = lessonRepository.findAll(Sort.by("id")).iterator().next();
            lesson.setTimeslot(timeslotRepository.findAll(Sort.by("id")).iterator().next());
            lesson.setRoom(roomRepository.findAll(Sort.by("id")).iterator().next());

            lessonRepository.save(lesson);
        };
    }

    public enum DemoData {
        NONE,
        SMALL,
        LARGE
    }

}
