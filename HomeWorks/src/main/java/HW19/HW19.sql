CREATE DATABASE Student;

CREATE TABLE departments (
    department_id varchar(64) NOT NULL AUTO_INCREMENT,
    name varchar(64) NOT NULL,
    manager varchar(64) NOT NULL,
    CONSTRAINT departments_pk PRIMARY KEY (department_id)
);

-- Table: groups
CREATE TABLE groups (
    group_id varchar(64) NOT NULL AUTO_INCREMENT,
    `group` int NOT NULL,
    CONSTRAINT groups_pk PRIMARY KEY (group_id)
);

-- Table: lessons
CREATE TABLE lessons (
    lesson_id varchar(64) NOT NULL AUTO_INCREMENT,
    lesson int NOT NULL,
    name varchar(64) NOT NULL,
    teacher varchar(64) NOT NULL,
    semester int NOT NULL,
    year varchar(4) NOT NULL,
    CONSTRAINT lessons_pk PRIMARY KEY (lesson_id)
);

-- Table: scores
CREATE TABLE scores (
    scores_id int NOT NULL AUTO_INCREMENT,
    student varchar(255) NOT NULL,
    lesson varchar(64) NOT NULL,
    score varchar(64) NOT NULL
);

-- Table: students
CREATE TABLE students (
    student_id varchar(64) NOT NULL AUTO_INCREMENT,
    `group` varchar(64) NOT NULL,
    fio varchar(255) NOT NULL,
    year_entrance varchar(4) NOT NULL,
    UNIQUE INDEX payment_data_ak_1 (`group`,fio),
    CONSTRAINT students_pk PRIMARY KEY (student_id)
);

-- Table: teachers
CREATE TABLE teachers (
    teacher_id varchar(64) NOT NULL AUTO_INCREMENT,
    fio varchar(255) NOT NULL,
    department varchar(64) NOT NULL,
    CONSTRAINT teachers_pk PRIMARY KEY (teacher_id)
);

-- foreign keys
-- Reference: departments_teachers (table: teachers)
ALTER TABLE teachers ADD CONSTRAINT departments_teachers FOREIGN KEY departments_teachers (department)
    REFERENCES departments (department_id);

-- Reference: lessons_scores (table: scores)
ALTER TABLE scores ADD CONSTRAINT lessons_scores FOREIGN KEY lessons_scores (lesson)
    REFERENCES lessons (lesson_id);

-- Reference: students_groups (table: students)
ALTER TABLE students ADD CONSTRAINT students_groups FOREIGN KEY students_groups (`group`)
    REFERENCES groups (group_id);

-- Reference: students_scores (table: scores)
ALTER TABLE scores ADD CONSTRAINT students_scores FOREIGN KEY students_scores (student)
    REFERENCES students (student_id);

-- Reference: teachers_lessons (table: lessons)
ALTER TABLE lessons ADD CONSTRAINT teachers_lessons FOREIGN KEY teachers_lessons (teacher)
    REFERENCES teachers (teacher_id);

-- End of file.

