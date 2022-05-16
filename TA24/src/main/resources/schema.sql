DROP TABLE IF EXISTS empleados;

CREATE TABLE empleados (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50),
trabajo ENUM ('Comercial','Informatico','Marketing','Finanzas'),
salario DECIMAL(15,2)
);