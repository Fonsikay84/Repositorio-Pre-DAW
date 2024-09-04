-- Tabla de Usuario.

  CREATE TABLE usuario
  (
    idusuario NUMBER(3),
    username  VARCHAR2(50),
    password  VARCHAR2(50)
  );
  
  COMMENT ON TABLE usuario IS 'Tabla de usuarios.';
  COMMENT ON COLUMN usuario.idusuario IS 'ID del usuario.';
  COMMENT ON COLUMN usuario.username IS 'Nombre del usuario.';
  COMMENT ON COLUMN usuario.password IS 'Contraseña del usuario.';

-- Creación del sinónimo de la tabla Usuario.

  CREATE PUBLIC SYNONYM usuario FOR curso_java.usuario;

-- Creación del índice de la PK de la tabla Usuario.

  CREATE UNIQUE INDEX i_idusuario ON usuario(idusuario);

-- Creación de la Primary Key de la tabla Usuario.

  ALTER TABLE usuario ADD (CONSTRAINT pk_usuario PRIMARY KEY (idusuario));

-- Creación de la secuencia asociada al campo "usuario.idusuario".

  CREATE SEQUENCE usuario_seq  MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 1 CACHE 20 ORDER  NOCYCLE;

-- Creación del trigger para cargar de forma automática el campo "usuario.idusuario" con la secuencia "usuario_seq".

  CREATE OR REPLACE TRIGGER tr_usuario_idusuario
  BEFORE INSERT ON usuario
  FOR EACH ROW
  BEGIN
  
    :NEW.idusuario := usuario_seq.NEXTVAL;
  
  END tr_usuario_idusuario;
  /

-- Carga de datos de la tabla Usuario.

  BEGIN
  
    INSERT INTO usuario (username, password) VALUES ('Fonsi', 'Fonsikay1984');
    INSERT INTO usuario (username, password) VALUES ('Isa', 'Isa1986');
    
    COMMIT;
    
  END;