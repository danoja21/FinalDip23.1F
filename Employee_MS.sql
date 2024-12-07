CREATE DATABASE employee_ms;
USE employee_ms;

CREATE TABLE Employee (
    employeeId VARCHAR(10)  PRIMARY KEY,
    firstName VARCHAR(10),
    lastName VARCHAR(10),
    dob DATE,
    address VARCHAR(50),
    age INT(3),
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
    userId VARCHAR(10) PRIMARY KEY,
    username VARCHAR(10),
    password VARCHAR(20),
    email VARCHAR(50),
    position VARCHAR(20)
);

CREATE TABLE Leave_(
    leaveId VARCHAR(10) PRIMARY KEY,
    startDate DATE,
    endDate DATE,
    status VARCHAR(20),
    leaveType VARCHAR(20),
    reason VARCHAR(50),
    employeeId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Audit_Log (
    auditId VARCHAR(10) PRIMARY KEY,
    actions VARCHAR(50),
    oldValue VARCHAR(20),
    newValue VARCHAR(20),
    date DATE,
    time time,
    tableName VARCHAR(20),
    employeeId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Position (
    positionId VARCHAR(10) PRIMARY KEY,
    positionType VARCHAR(10),
    description VARCHAR(20),
    status VARCHAR(20),
    creationDate DATE,
    lastModifiedDate DATE,
    basicSalary FLOAT,
    employeeId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Pay_Slip (
    slipId VARCHAR(10) PRIMARY KEY,
    slipDate DATE,
    companyName VARCHAR(30),
    companyAccNumber INT(16),
    empBankName VARCHAR(20),
    empAccNumber INT(16),
    earnings FLOAT,
    deductions FLOAT,
    netSalary FLOAT,
    employeeId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Training_Program (
    programId VARCHAR(10) PRIMARY KEY,
    name VARCHAR(10),
    startDate DATE,
    endDate DATE,
    location VARCHAR(10),
    employeeId VARCHAR(10),
    attendanceId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId),
    FOREIGN KEY (attendanceId) REFERENCES Attendance(attendanceId)
);

CREATE TABLE Permissions (
    permissionId VARCHAR(10) PRIMARY KEY,
    name VARCHAR(10),
    accessRigths VARCHAR(10),
    createDate DATE,
    lastModifiedDate DATE,
    userId VARCHAR(10),
    FOREIGN KEY (userId) REFERENCES UserType(userId)
);

CREATE TABLE PayRoll (
    payrollId VARCHAR(10) PRIMARY KEY,
    grossSalary FLOAT,
	bonus FLOAT,
	ETF FLOAT,
	EPF FLOAT,
	taxAmount FLOAT,
    netSalary FLOAT,
    paymentDate DATE,
    payMonth varchar(10),
    payYear INT(5),
    slipId VARCHAR(10),
    employeeId VARCHAR(10),
    FOREIGN KEY (slipId) REFERENCES Pay_Slip(slipId),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Attendance (
    attendanceId VARCHAR(10) PRIMARY KEY,
    clockInTime TIME,
    clockOutTime TIME,
    workHours INT(10),
    OTHours INT(10),
    status VARCHAR(20),
    date DATE,
    employeeId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

create table Schedule_ (
   scheduleId VARCHAR(10) PRIMARY KEY,
   scheduleName varchar(10),
   description varchar(20),
   createDate date,
   lastUpdate date,
   employeeId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
    );
    
CREATE TABLE Budget (
    budgetId VARCHAR(10) PRIMARY KEY,
    itemCategory VARCHAR(10),
    description VARCHAR(20),
    amount FLOAT,
    transactionDate DATE
);

CREATE TABLE Performance_Review (
    reviewId VARCHAR(10) PRIMARY KEY,
    reviewDate DATE,
    reviewer VARCHAR(10),
    overallRating INT(1),
    comments VARCHAR(30),
    periodStartDate DATE,
    periodEndDate DATE,
    employeeId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

CREATE TABLE Feedback (
    feedbackId VARCHAR(10) PRIMARY KEY,
    feedbackDate DATE,
    provider VARCHAR(10),
    comments VARCHAR(30),
	employeeId VARCHAR(10),
    FOREIGN KEY (employeeId) REFERENCES Employee(employeeId)
);

select * from UserType;

drop schema employee_ms;


