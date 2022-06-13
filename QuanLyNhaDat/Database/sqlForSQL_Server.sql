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
  t_id int IDENTITY(1,1) NOT NULL,
  t_date DATE NOT NULL,
  t_price FLOAT NOT NULL,
  t_type VARCHAR(1) NOT NULL,
  t_area FLOAT NOT NULL,
  id int NOT NULL,
  PRIMARY KEY (T_id),
  FOREIGN KEY (id) REFERENCES USERS(id),
  CHECK (t_type='A' OR t_type='B' OR t_type='C')
) 
GO
CREATE TABLE HOME_TRANSACTIONS (
  t_id int IDENTITY(1,1) NOT NULL,
  t_date DATE NOT NULL,
  t_price FLOAT NOT NULL,
  t_type NVARCHAR(12) NOT NULL,
  t_area FLOAT NOT NULL,
  id int NOT NULL,
  PRIMARY KEY (T_id),
  FOREIGN KEY (id) REFERENCES USERS(id),
  CHECK (t_type=N'cao cấp' OR t_type=N'thường')
)

GO
INSERT INTO ROLES ( name) VALUES
(N'Trưởng phòng'),
(N'Nhân viên');

GO
INSERT INTO users ( fullname, username, password, role_id ) VALUES
( N'Admin', 'admin', '123', 1),
( N'Nguyễn Việt Trung', 'viettrungcntt03@gmail.com', '123', 2);

GO
INSERT INTO LAND_TRANSACTIONS (t_date, t_price, t_type, t_area, id) VALUES 
( '2022-06-01', 99, 'B', 1000, 2),
( '2021-06-01', 199, 'A', 500, 2),
( '2022-06-01', 89, 'C', 1000, 2),
( '2022-06-01', 299, 'A', 500, 2),
( '2021-06-01', 69, 'C', 1000, 2)

GO
INSERT INTO HOME_TRANSACTIONS (t_date, t_price, t_type, t_area, id) VALUES 
( '2022-06-01', 99, N'cao cấp', 1000, 2),
( '2022-06-01', 69, N'thường', 500, 2),
( '2022-06-01', 69, N'thường', 1000, 2),
( '2022-06-01', 99, N'cao cấp', 1000, 2),
( '2022-06-01', 99, N'cao cấp', 1000, 2)

SELECT * FROM USERS
select * from LAND_TRANSACTIONS
select* from HOME_TRANSACTIONS
