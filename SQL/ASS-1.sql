
CREATE TABLE CLIENT_MASTER(
	Client_No varchar(20),
  	Name varchar(20),
  	City varchar(20),
  	Pincode varchar(20),
  	Bal_due varchar(20)
);
CREATE TABLE SALE_ORDER(
	Order_No varchar(20),
  	Order_Date varchar(20),
  	Client_No varchar(20),
    Salesman_No varchar(20),
  	Dely_Date varchar(20),
  	Order_status varchar(20)
);

INSERT into CLIENT_MASTER values 
('C00001'	,'SMITHA JAIN'	,'Mumbai'	,400054,	15000),
('C00002'	,'VANDANA  RAO'	,'Chennai'	,780001,	0),
('C00003'	,'PREM PUJARI'	,'Mumbai'	,400057,	5000),
('C00004'	,'BASU NATH'	,'Mumbai'	,400056,	0),
('C00005'	,'RAVI SHANKAR'	,'Delhi'	,100001,	2000),
('C00006'	,'ROOPA'	,'Mumbai'	,400050,	0);

INSERT INTO SALE_ORDER VALUES 
('O19001','12-Jan-13','C00001','S00001','20-Jan-13','In process'),
('O19002','25-Jan-13','C00002','S00002','27-Jan-13','Cancelled'),
('O46865','18-Feb-13','C00003','S00003','20-Feb-13','Fulfilled'),
('O19003','03-Apr-13','C00001','S00001','07-Apr-13','Fulfilled'),
('O46866','20-May-13','C00004','S00002','07-Apr-13','Cancelled'),
('O19008','23-May-13','C00005','S00004','26-May-13','In process');


select * from CLIENT_MASTER;
select *from  SALE_ORDER;
select * from CLIENT_MASTER WHERE bal_due = 0;
update CLIENT_MASTER SET City = 'Jaipur' where Client_No = 'C00004';
select * from CLIENT_MASTER;
select * from CLIENT_MASTER WHERE City = 'Mumbai';
