package a1026.ex;

public class mydatabas {
    CREATE DATABASE mydatabas

    show databases // 처음 데이터베이스 확인

    USE mydatabas
    
    CREATE TABLE students( // 테이블 추가
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(50),
        math_score INT,
        science_score INT,
        english_score INT
    );
    
    INSERT INTO students(name, math_score, science_score, english_score) VALUES ('John Doe', 90, 85, 78),('Jane Smith', 88, 92, 76),('Bob Johnson', 76, 89, 82);
    
    SELECT name, math_score, science_score, english_score FROM students;
    
    SELECT
    AVG(math_score) AS avrage_math,
    AVG(science_score) AS avrage_science,
    AVG(english_score) AS avrage_english
    FROM students;

    SELECT * FROM students WHERE name = 'John Doe';

    DROP TABLE students;
}
