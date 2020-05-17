create database School_Bracathon
use School_Bracathon

CREATE TABLE School(
    SchoolId INT PRIMARY KEY IDENTITY(1,1),
    SchoolName varchar(100),
    Region varchar(100)
)

CREATE TABLE Teacher(
    TeacherId INT PRIMARY KEY IDENTITY(1,1),
    TeacherName varchar(100),
    SchoolId INT,
    PhoneNo varchar(100)
)

CREATE TABLE Student(
    StudentId INT,
    StudentName varchar(100),
    Gender varchar(100),
    SchoolId INT
)  

CREATE TABLE Attendance_Table(
    SchoolId INT,
    TeacherPhoneNo varchar(100),
    Date DATE,
    Attendance varchar(100)
)

CREATE TABLE Performance_Table(
    TeacherPhoneNo varchar(100),
    SchoolId INT,
    Year INT,
    Month varchar(100),
    Marks varchar(100),
    Class INT
);   

INSERT INTO School (SchoolName,Region) VALUES 
('Vashantek Brac Primary School','Dhaka'),
('Bauniabadh Brac Pre Primary School','Dhaka'),
('Balurmath Brac School','Dhaka'),
('Korail Jamai Bazar Brac School','Dhaka'),
('Shattola Brac School','Dhaka'),
('Uttar Kalshi Brac Primary School','Dhaka'),
('Beltola Brac Primary School','Dhaka');


select * from School;
select * from Teacher

INSERT INTO Teacher (TeacherName,SchoolId,PhoneNo) VALUES 
('Momtaj Begum',7,'+8801715421431'),
('Rumana Ali',6,'+8801719515037'),
('Mina Begum',5,'+8801712061216'),
('Moriam Begum',4,'+8801965365009'),
('Amena Sultana',3,'+8801713061275'),
('Tuni Begum',2,'+8801829401627'),
('Umme Kulsum',1,'+8801713822498');

select * from Teacher;
select * from Student;

INSERT INTO Student VALUES 
(1,'Arifa','F',4),
(2,'Sheema','F',4),
(3,'Popi','F',4),
(4,'Nuhi','F',4),
(5,'Suchona','F',4),
(6,'Sabina','F',4),
(7,'Nipa','F',4),
(8,'Mim','F',4),
(9,'Fatema','F',4),
(10,'Amena','F',4),
(11,'Tinni','F',4),
(12,'Mala','F',4),
(13,'Helena','F',4),
(14,'Lima','F',4),
(15,'Anika','F',4),
(16,'Monoara','F',4),
(17,'Mukta','F',4),
(18,'Alamin','M',4),
(19,'Jibon','M',4),
(20,'Morsalin','M',4),
(21,'Nasimul','M',4),
(22,'Raju','M',4),
(23,'Baizid','M',4),
(24,'Minhaz','M',4),
(25,'Rakib','M',4),
(26,'Noyon','M',4),
(27,'Yeasin','M',4),
(28,'Apon','M',4),
(29,'Nizamul','M',4),
(30,'Azad','M',4);

INSERT INTO Student VALUES 
(1,'Zakia','F',2),
(2,'Humaira','F',2),
(3,'Amena','F',2),
(4,'Shamim','M',2),
(5,'Anika','F',2),
(6,'Rakib','M',2),
(7,'Shimul','M',2),
(8,'Rifat','F',2),
(9,'Alom','M',2),
(10,'Anas','M',2),
(11,'Nishat','F',2),
(12,'Ashik','M',2),
(13,'Rupa','F',2),
(14,'Arif','M',2),
(15,'Tanu','F',2),
(16,'Nuru','M',2),
(17,'Tipu','M',2),
(18,'Debu','M',2),
(19,'Rashed','M',2),
(20,'Dipu','M',2),
(21,'Minu','F',2),
(22,'Rani','F',2),
(23,'Billah','M',2),
(24,'Asif','M',2),
(25,'Rokeya','F',2),
(26,'Nipa','F',2),
(27,'Selina','F',2),
(28,'Ratul','M',2),
(29,'Neyamul','M',2),
(30,'Amzad','M',2);


select * from Student where schoolId = 4;
select * from Teacher;
select * from School;
select * from Attendance_Table;
select * from Performance_Table;
delete from Attendance_Table where Date='2019-07-20'
delete from Performance_Table where Month='July' and TeacherPhoneNo='+8801965365009'

select * from Attendance_Table where TeacherPhoneNo like '%01711566866'

INSERT INTO Attendance_Table VALUES 
(2,'+8801829401627','2019-07-01','3fffffec'),
(4,'+8801965365009','2019-07-01','3fffff6a'),
(2,'+8801829401627','2019-07-02','3faffffc'),
(4,'+8801965365009','2019-07-02','3fffbf6f'),
(2,'+8801829401627','2019-07-03','3fffffff'),
(4,'+8801965365009','2019-07-03','3fdfffff'),
(2,'+8801829401627','2019-07-04','3fffcfff'),
(4,'+8801965365009','2019-07-04','2fffff6a'),
(2,'+8801829401627','2019-07-05','3fffffff'),
(4,'+8801965365009','2019-07-05','3fffefff'),
(2,'+8801829401627','2019-07-06','3fefffff'),
(4,'+8801965365009','2019-07-06','3ffdff7f'),
(2,'+8801829401627','2019-07-07','3effff5f'),
(4,'+8801965365009','2019-07-07','3fffafff'),
(2,'+8801829401627','2019-07-08','3ffeffff'),
(4,'+8801965365009','2019-07-08','3fdfff6f'),
(2,'+8801829401627','2019-07-09','3ffcffef'),
(4,'+8801965365009','2019-07-09','3ffffffe'),
(2,'+8801829401627','2019-07-10','3fffffef'),
(4,'+8801965365009','2019-07-10','3ffdffff');

INSERT INTO Attendance_Table VALUES 
(2,'+8801829401627','2019-07-11','3ffeffec'),
(4,'+8801965365009','2019-07-11','3affff6a'),
(2,'+8801829401627','2019-07-12','3faff7fc'),
(4,'+8801965365009','2019-07-12','3fffff6f'),
(2,'+8801829401627','2019-07-13','3ffdffff'),
(4,'+8801965365009','2019-07-13','3fdfefff'),
(2,'+8801829401627','2019-07-14','3fffcfff'),
(4,'+8801965365009','2019-07-14','2fafff6a'),
(2,'+8801829401627','2019-07-15','3fffffff'),
(4,'+8801965365009','2019-07-15','3fffefff'),
(2,'+8801829401627','2019-07-16','3fefffff'),
(4,'+8801965365009','2019-07-16','3ffdff7f'),
(2,'+8801829401627','2019-07-17','3effff5f'),
(4,'+8801965365009','2019-07-17','3fffafff'),
(2,'+8801829401627','2019-07-18','3ffeffff'),
(4,'+8801965365009','2019-07-18','3fdfff6f'),
(2,'+8801829401627','2019-07-19','3ffcffef'),
(4,'+8801965365009','2019-07-19','3ffffffe'),
(2,'+8801829401627','2019-07-20','3fffffaf'),
(4,'+8801965365009','2019-07-20','3ffcffff')

select * from Student
select SchoolName from School order by SchoolName

select Attendance from Attendance_Table where SchoolId=2 and TeacherPhoneNo='' and Date=''

select Marks from Performance_Table where SchoolId=2 and TeacherPhoneNo='' and Year=2019 and Month='"+monthComboBox.getSelectedItem().toString()+"'

insert into Performance_Table values
('+8801965365009',4,2019,'January','pswxptnvBzzxyyxmtsqMAIHAFAIquA',1),
('+8801965365009',4,2019,'February','rBzzxyyxmtsqMAswxptnvIHAFAIquA',1),
('+8801965365009',4,2019,'March','pAIquABzxmtsqMAswxzxyyptnvIHAF',1),
('+8801965365009',4,2019,'April','tswvBzzxptnxyIHAyxmtsqMAFuAAIq',1),
('+8801965365009',4,2019,'May','pBzzxyyxmtsqMAswxptnvIHAFAIquA',1),
('+8801965365009',4,2019,'June','pAIquABzxmtsqMAswxzxyyptnvIHAF',1),
('+8801965365009',4,2019,'July','rBzzxyyxmtsqMAswxptnvIHAFAIquA',1),
('+8801829401627',2,2019,'January','mtsqMAIHAFpswxptnvBzzxyyxAIquA',3),
('+8801829401627',2,2019,'February','rBzxptnvIHAFzxyyxmtsqMAswAIquA',3),
('+8801829401627',2,2019,'March','pAIquAswxzxyABzxmtsqMyptnvIHAF',3),
('+8801829401627',2,2019,'April','tswvBzyxmtsqMAFuAzxptnxyIHAAIq',3),
('+8801829401627',2,2019,'May','pBzsqMAswxptnvIHzxyyxmtAFAIquA',3),
('+8801829401627',2,2019,'June','pAIquABzxxyyptnvIHmtsqMAswxzAF',3),
('+8801829401627',2,2019,'July','rBzyxmtsqMAswzxyxptnvIHAFAIquA',3)