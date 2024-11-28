
-- Crear tabla de roles
CREATE TABLE rol (
    id_rol BIGINT AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_rol)
);

-- Crear tabla de usuarios
CREATE TABLE usuario (
    id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL UNIQUE,
    clave VARCHAR(255) NOT NULL
);

-- Tabla intermedia para la relación muchos a muchos entre usuarios y roles
CREATE TABLE usuario_rol (
    id_usuario BIGINT NOT NULL,
    id_rol BIGINT NOT NULL,
    PRIMARY KEY (id_usuario, id_rol),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_rol) REFERENCES rol(id_rol)
);

-- Crear tabla de productos
CREATE TABLE producto (
    id_producto BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    cantidad INT NOT NULL,
    precio DECIMAL(10, 2) NOT NULL
);

-- Crear tabla de mensajes
CREATE TABLE mensaje (
    id_mensaje BIGINT AUTO_INCREMENT PRIMARY KEY,
    contenido TEXT NOT NULL,
    id_usuario BIGINT NOT NULL,
    id_destinatario BIGINT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_destinatario) REFERENCES usuario(id_usuario)
);

-- Insertar datos iniciales en la tabla de roles
INSERT INTO rol (nombre) VALUES ('ADMIN'), ('USER');

-- Insertar datos iniciales en la tabla de usuarios
INSERT INTO usuario (nombre, correo, clave) 
VALUES 
('Administrador', 'admin@example.com', 'admin123'),
('Usuario1', 'user1@example.com', 'user123'),
('Usuario2', 'user2@example.com', 'user123');

-- Insertar relaciones entre usuarios y roles
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 1), (2, 2), (3, 2);


-- Insertar datos iniciales en la tabla de productos
INSERT INTO producto (nombre, descripcion, cantidad, precio) 
VALUES 
('Laptop', 'Laptop de alta gama', 10, 1200.50),
('Smartphone', 'Teléfono inteligente con gran cámara', 50, 800.00),
('Auriculares', 'Auriculares inalámbricos', 100, 150.00);

-- Insertar datos iniciales en la tabla de mensajes
INSERT INTO mensaje (contenido, id_usuario, id_destinatario) 
VALUES 
('Hola, ¿cómo estás?', 2, 3),
('Todo bien, gracias. ¿Y tú?', 3, 2),
('¿Cuándo es la próxima reunión?', 2, 1);