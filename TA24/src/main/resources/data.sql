DROP TABLE IF EXISTS empleados;

CREATE TABLE empleados (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50),
trabajo ENUM ('Comercial','Informatico','Marketing','Finanzas'),
salario DECIMAL(15,2)
);

INSERT INTO empleados(nombre,trabajo,salario) VALUES
("Juan Cuesta","Comercial",650),
("Emilo Delgado","Marketing",480),
("Mariano Delgado","Finanzas",520);