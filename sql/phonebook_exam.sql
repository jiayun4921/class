-- 2023.04.18 
-- 전화번호 저장 테이블 DDL


create table phoneInfo_basic (
        idx number(6) primary key,
        fr_name varchar2(20) not null ,
        fr_phonenumber varchar2(20) not null,
        fr_email varchar2(20),
        fr_address varchar2(20),
        fr_regdate date default sysdate
);

desc phoneInfo_basic;



create table phoneInfo_univ (
        idx number(6) constraint PK_phoneInfo_univ_idx primary key,
        fr_u_major varchar2(20) default 'N',
        fr_u_year number(1) default 1 check(0<fr_u_year and 5>fr_u_year),
        fr_ref number(7) constraint REF_phoneInfo_univ_fr_ref references phoneInfo_basic(idx) not null
        );
        
desc phoneInfo_univ;     
        
   
                
create table phoneInfo_com (
        idx number(6) constraint PK_phoneInfo_com primary key,
        fr_c_company varchar2(20) default 'N',
        fr_ref number(6) constraint REF_phoneInfo_com_fr_ref references phoneInfo_basic(idx) not null
        );
desc phoneInfo_com;



-- 1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
insert into phoneInfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address,fr_regdate)
        values (1, '윤지아', '010-3316-4921', 'wldk4921@gmail.com', '고양시 덕양구', sysdate);


-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
insert into phoneInfo_univ (idx, fr_u_major, fr_u_year,fr_ref)
        values (2, '철학과', '3', 1); 



-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
insert into phoneinfo_com (idx, fr_c_company, fr_ref)
        values (3,'삼성',1);




        
        
        