USE QlNhaDat
GO

CREATE TABLE ChucNang 
(
	maChucNang VARCHAR(11) PRIMARY KEY,
	tenChucNang NVARCHAR(20)
)

CREATE TABLE Nguoi 
(
	ma VARCHAR(11),
	hoTen NVARCHAR(30),
	ngaySinh DATE,
	queQuan NVARCHAR(50),
	email VARCHAR(30),
	matKhau VARCHAR(20),
	trangThai INT,
	maChucNang VARCHAR(11),
	PRIMARY KEY (ma, maChucNang),
	FOREIGN KEY (maChucNang) REFERENCES ChucNang(maChucNang)
)

INSERT INTO ChucNang VALUES 
( 'CN01', N'Chức năng 1'),
( 'CN02', N'Chức năng 2'),
( 'CN03', N'Chức năng 3')

INSERT INTO Nguoi VALUES
('1', N'Nguyễn Việt Trung', '2001-09-30', 'Thái Nguyên', 'viettrungcntt03@gmail.com', '123', '1', 'CN01'),
('2', N'Nguyễn Văn A', '2001-01-01', 'Hà Nội', 'a@gmail.com', '123', '1', 'CN02')