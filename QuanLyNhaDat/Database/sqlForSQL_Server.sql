CREATE DATABASE btl_java_quanlynhadat
GO
USE btl_java_quanlynhadat
GO

CREATE TABLE ROLES (
  role_id int IDENTITY(1,1) PRIMARY KEY,
  name nvarchar(20) NOT NULL
) 

GO
CREATE TABLE USERS (
  id int IDENTITY(1,1) NOT NULL,
  fullname nvarchar(30) NOT NULL,
  username nvarchar(30) NOT NULL,
  password nvarchar(30) NOT NULL,
  role_id int NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (role_id) REFERENCES ROLES(role_id)
) 
GO
CREATE TABLE LAND_TRANSACTIONS (
  land_id int IDENTITY(1,1) NOT NULL,
  land_date DATE NOT NULL,
  land_price FLOAT NOT NULL,
  land_type VARCHAR(1) NOT NULL,
  land_area FLOAT NOT NULL,
  id int NOT NULL,
  PRIMARY KEY (land_id),
  CONSTRAINT FK__LAND_TRANSAC__id FOREIGN KEY (id) REFERENCES USERS(id),
  CONSTRAINT CHK_Land CHECK (Land_type='A' OR Land_type='B' OR Land_type='C')
) 
GO
CREATE TABLE HOME_TRANSACTIONS (
  home_id int IDENTITY(1,1) NOT NULL,
  home_date DATE NOT NULL,
  home_price FLOAT NOT NULL,
  home_type NVARCHAR(12) NOT NULL,
  home_area FLOAT NOT NULL,
  id int NOT NULL,
  PRIMARY KEY (home_id),
  CONSTRAINT FK__HOME_TRANSAC__id FOREIGN KEY (id) REFERENCES USERS(id),
  CONSTRAINT CHK_Home CHECK (home_type=N'cao cấp' OR home_type=N'thường')
)

GO
INSERT INTO ROLES ( name) VALUES
(N'Trưởng phòng'),
(N'Nhân viên');

GO
INSERT INTO users ( fullname, username, password, role_id ) VALUES
( N'Admin', 'admin', '123', 1),
( N'Nguyễn Việt Trung', 'viettrungcntt03@gmail.com', '123', 2);

