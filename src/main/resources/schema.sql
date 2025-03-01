CREATE TABLE alumno (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        nombre VARCHAR(255),
                        apellido VARCHAR(255),
                        id_materia BIGINT
);

CREATE TABLE materia (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(255)
);