CREATE DATABASE employee_ms;
USE employee_ms;

CREATE TABLE Employee (
    employeeId INT  PRIMARY KEY auto_increment,
    firstName VARCHAR(10),
    lastName VARCHAR(10),
    dob DATE,
    address VARCHAR(50),
    age INT,
    gender VARCHAR(7),
    phone CHAR(10) NOT NULL CHECK (Phone REGEXP '^[0-9]{10}$'),
    joinDate DATE,
    email VARCHAR(50),
    NIC VARCHAR(20),
    position VARCHAR(20),
    experience VARCHAR(50),
    qualification VARCHAR(50),
    moreDetails VARCHAR(100) 
);

CREATE TABLE UserType (
    userId INT PRIMARY KEY auto_increment,
    username VARCHAR(10),
    password VARCHAR(20),
    email VARCHAR(50),
    position VARCHAR(20)
);

CREATE TABLE Leave_(
    leaveId INT PRIMARY KEY auto_increment,
    startDate DATE,
    endDate DATE,
    leaveStatus VARCHAR(30),
    leaveType VARCHAR(20),
    reason VARCHAR(100),
    employeeId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Audit_Log (
    auditId INT PRIMARY KEY auto_increment,
    actions VARCHAR(50),
    oldValue VARCHAR(20),
    newValue VARCHAR(20),
    date DATE,
    time time,
    tableName VARCHAR(20),
    employeeId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Position (
    positionId INT PRIMARY KEY auto_increment,
    positionType VARCHAR(10),
    description VARCHAR(20),
    status VARCHAR(20),
    lastModifiedDate DATE,
    creationDate DATE,
    basicSalary FLOAT,
    employeeId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Pay_Slip (
    slipId INT PRIMARY KEY auto_increment,
    slipDate DATE,
    companyName VARCHAR(30),
    companyAccNumber INT,
    empBankName VARCHAR(20),
    empAccNumber INT,
    earnings FLOAT,
    deductions FLOAT,
    netSalary FLOAT,
    employeeId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Training_Program (
    programmeId INT PRIMARY KEY auto_increment,
    name VARCHAR(10),
    startDate DATE,
    endDate DATE,
    location VARCHAR(10),
    employeeId INT,
    attendanceId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId),
    FOREIGN KEY (attendanceId) REFERENCES Attendance(attendanceId)
);

CREATE TABLE Permissions (
    permissionId INT PRIMARY KEY auto_increment,
    name VARCHAR(10),
    accessRigths VARCHAR(10),
    createDate DATE,
    lastModifiedDate DATE,
    userId INT,
    FOREIGN KEY (userId) REFERENCES UserType(userId)
);

CREATE TABLE PayRoll (
    payrollId INT PRIMARY KEY auto_increment,
    grossSalary FLOAT,
	bonus FLOAT,
	ETF FLOAT,
	EPF FLOAT,
	taxAmount FLOAT,
    netSalary FLOAT,
    paymentDate DATE,
    payMonth varchar(10),
    payYear INT,
    slipId INT,
    employeeId INT,
    FOREIGN KEY (slipId) REFERENCES Pay_Slip(slipId),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Attendance (
    attendanceId INT PRIMARY KEY auto_increment,
    clockInTime DATETIME,
    clockOutTime DATETIME,
    workHours INT,
    OTHours INT,
    status VARCHAR(10),
    date DATE,
    employeeId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

create table Schedule_ (
   scheduleId INT PRIMARY KEY auto_increment,
   scheduleName varchar(10),
   description varchar(20),
   createDate date,
   lastUpdate datetime,
   employeeId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
    );
    
CREATE TABLE Budget (
    budgetId INT PRIMARY KEY auto_increment,
    itemCategory VARCHAR(10),
    description VARCHAR(20),
    amount FLOAT,
    transactionDate DATE
);

CREATE TABLE Performance_Review (
    reviewId INT PRIMARY KEY auto_increment,
    reviewDate DATE,
    reviewer VARCHAR(10),
    overallRating INT,
    comments VARCHAR(30),
    periodStartDate DATE,
    periodEndDate DATE,
    employeeId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Feedback (
    feedbackId INT PRIMARY KEY auto_increment,
    feedbackDate DATE,
    provider VARCHAR(10),
    comments VARCHAR(30),
	employeeId INT,
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

select * from UserType;

INSERT INTO UserType (userId, username, password, email,position)
VALUES (1, 'admin', '123', 'shehan@gmail.com','Admin');
INSERT INTO UserType (userId, username, password, email,position)
VALUES (2, 'CEO', '456', 'manahara@gmail.com','CEO');
INSERT INTO UserType (userId, username, password, email,position)
VALUES (3, 'PM', '789', 'bhanuka@gmail.com','Program Manager');
INSERT INTO UserType (userId, username, password, email,position)
VALUES (4, 'CM', '134', 'danoja@gmail.com','Center Manager');
INSERT INTO UserType (userId, username, password, email,position)
VALUES (5, 'FM', '521', 'mineth@gmail.com','Financial Manager');

drop schema employee_ms;
