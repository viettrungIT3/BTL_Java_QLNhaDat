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
  PRIMARY KEY (id,role_id),
  FOREIGN KEY (role_id) REFERENCES ROLES(role_id)
) 

GO
INSERT INTO ROLES ( name) VALUES
(N'Trưởng phòng'),
(N'Nhân viên');

GO
INSERT INTO users ( fullname, username, password, role_id ) VALUES
( N'Admin', 'admin', '123', 1),
( N'Nguyễn Việt Trung', 'viettrungcntt03@gmail.com', '123', 2);

