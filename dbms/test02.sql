SELECT * FROM EMPLOYEES e ;

CREATE TABLE TB_TEAM(
	tId		NUMBER(10) 		PRIMARY KEY ,
	tLoc	varchar2(10)	NOT NULL ,
	tName	varchar2(10)	NOT NULL ,
	tNum	varchar2(15), 
	tHomep	varchar2(60)
); 

CREATE TABLE TB_PLAYER(
	pNum	NUMBER(10)		PRIMARY KEY,
	pName	varchar2(10)	NOT NULL,
	pPos	varchar2(10),
	pHeight	NUMBER(3),
	pHomep	NUMBER(10)
);

INSERT INTO TB_TEAM (TID, TLOC, TNAME, TNUM, THOMEP)
VALUES (0303, '서울', '하늘', 'ss0303', 'http://www.seoulsky.com/');
INSERT INTO TB_TEAM (TID, TLOC, TNAME, TNUM, THOMEP)
VALUES (0520, '부산', '바다', 'bs0520', 'http://www.busansea.com/');

INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(1, '김일', '투수', 178, 101);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(2, '김이', '포수', 175, 102);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(3, '김삼', '1루수', 175, 103);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(4, '김사', '2루수', 183, 104);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(5, '김오', '3루수', 187, 105);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(6, '김육', '유격수', 190, 106);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(7, '김칠', '외야수', 177, 107);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(8, '김팔', '외야수', 175, 108);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(9, '김구', '외야수', 185, 109);
INSERT INTO TB_PLAYER (pNum, pName, pPos, pHeight, pHomep)
values(10, '김십', '타자', 178, 010);

--선수 번호, 선수 이름, 포지션, 신장, 팀 명, 홈페이지 조회
SELECT tp.PNUM , tp.PNAME , tp.PPOS , tp.PHEIGHT , tt.TNAME , tt.THOMEP  
FROM TB_PLAYER tp 
	INNER JOIN TB_TEAM tt ON tt.TID = tp.PNUM 
;

DROP TABLE TB_PLAYER ;

DROP TABLE TB_TEAM ;

--6-1. LOCATIONS 테이블 COUNTRIES 테이블의 부모 자식 관계?
-- LOCATIONS 테이블이 부모테이블, COUNTRIES 테이블이 자식테이블

--6-2. COUNTRIES 테이블과 REGIONS 테이블의 부모 자식 관계?
-- COUNTRIES 테이블이 부모테이블, REGIONS 테이블이 자식테이블

--6-3. 외래키 삭제 옵션 ON DELETE CASCADE 에 대해서 설명하시오
-- 참조되는 부모테이블의 행에 대한 delete를 허용한다.

--6-4. 외래키 삭제 옵션 ON DELETE SET NULL 에 대해서 설명하시오
-- 참조되는 부모 테이블의 행에 대한 delete를 허용한다.


--20번 부서 사원의 EMPLOYEE_ID, FIRST_NAME 과 LAST_NAME을 연결 조회,
-- DEPARTMENT_ID, HIRE_DATE, DEPARTMENT_NAME을 조회해서 view를 생성하여라
CREATE OR REPLACE VIEW v_emp (DEPARTMENT_ID, HIRE_DATE, DEPARTMENT_NAME)
	AS SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
		FROM EMPLOYEES e 
		WHERE DEPARTMENT_ID = 20
);