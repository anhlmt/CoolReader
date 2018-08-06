CREATE DATABASE CoolReader
GO
USE CoolReader
GO
CREATE TABLE Role(
	RoleId INT PRIMARY KEY IDENTITY(1,1),
	Authority NVARCHAR(30),
);
GO
CREATE TABLE Account(
	AccountId int PRIMARY KEY IDENTITY(1,1),
	Username varchar(50),
	Password varchar(50),
	RoleId INT,
	FOREIGN KEY (RoleId) REFERENCES Role(RoleId),
);
GO
CREATE TABLE Bookcase(
	BookcaseId INT PRIMARY KEY IDENTITY(1,1),
	BookcaseName NVARCHAR(100),
	AccountId INT,
	FOREIGN KEY (AccountId) REFERENCES Account(AccountId) ON DELETE CASCADE,
);
GO
CREATE TABLE Book(
	BookId INT PRIMARY KEY IDENTITY(1,1),
	Title NVARCHAR(500),
	Brief NVARCHAR(500),
	Author NVARCHAR(100),
	Publisher NVARCHAR(200),
	Category NVARCHAR(100),
	Content NTEXT,
	CreatedDate DATE,
	UpdatedDate DATE,
);
GO
INSERT INTO Book VALUES (
	N'Dế mèn phiêu lưu ký',
	N'Kể về cuộc đời ngắn ngủi của chú dế mèn kiêu ngạo',
	N'Tô Hoài',
	N'NXB Kim Đồng',
	N'Thiếu nhi',
	N'',
	'2018-08-01',
	'2018-08-01'
)
INSERT INTO Book VALUES (
	N'Thám tử Sherlock Holmes',
	N'Kể về những màn phá án gay cấn của thám tử huyền thoại của nước Anh',
	N'Conan Doyle',
	N'NXB Văn Hóa',
	N'Trinh thám',
	N'',
	'2018-08-01',
	'2018-08-01'
)

CREATE TABLE Contain(
	BookcaseId INT,
	BookId int,
	AddedDate date,
	PRIMARY KEY (BookcaseId,BookId),
	FOREIGN KEY (BookcaseId) REFERENCES Bookcase(BookcaseId) ON DELETE CASCADE,
	FOREIGN KEY (BookId) REFERENCES Book(BookId) ON DELETE CASCADE,
);
GO
INSERT INTO Role VALUES ('Admin')
INSERT INTO Role VALUES ('User')


CREATE PROCEDURE proc_insert_acc @username varchar(50), @password varchar(50), @roleid int
AS
	INSERT INTO Account VALUES (@username, @password, @roleid);
	DECLARE @max int 
	SET @max = (SELECT MAX(AccountId) FROM Account)
	INSERT INTO Bookcase VALUES (N'My bookcase', @max)
GO

exec proc_insert_acc 'admin','admin',1
exec proc_insert_acc 'anhlmt','123456',2

