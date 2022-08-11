SELECT * FROM EMPLOYEES e ;

CREATE TABLE EMPLOYEES_NEW AS
SELECT *
FROM hr.EMPLOYEES e ;

CREATE TABLE DEPARTMENTS_NEW AS
SELECT *
FROM hr.DEPARTMENTS d ;

ALTER TABLE EMPLOYEES_NEW
ADD USER_NAME	varchar2(20);

ALTER TABLE EMPLOYEES_NEW
ADD CONSTRAINTS emp_pk PRIMARY KEY (EMPLOYEE_ID);

ALTER TABLE DEPARTMENTS_NEW
ADD CONSTRAINTS dep_pk PRIMARY KEY (DEPARTMENT_ID);

ALTER TABLE DEPARTMENTS_NEW
ADD CONSTRAINTS dep_fk FOREIGN KEY (DEPARTMENT_ID)
REFERENCES DEPARTMENTS_NEW (DEPARTMENT_ID);

--7. DEPARTMENT_ID = 60인 사원의 EMPLOYEE_ID , FIRST_NAME , DEPARTMENT_ID, DEPARTMENT_NAME을 오름차순으로 조회 하시오.
SELECT en.EMPLOYEE_ID, en.FIRST_NAME, en.DEPARTMENT_ID, en.DEPARTMENT_NAME
FROM EMPLOYEES_NEW
	INNER JOIN DEPARTMENTS_NEW ON en.DEPARTMENT_ID = dn.DEPARTMENT_ID 
WHERE DEPARTMENT_ID = 60
ORDER BY EMPLOYEE_ID , FIRST_NAME , DEPARTMENT_ID, DEPARTMENT_NAME
;

--8. EMPLOYEES_NEW 테이블에서 DEPARTMENT_ID가 100인 사원들의 급여(SALARY) 평균을 구하여라.
SELECT AVG(SALARY) 
FROM EMPLOYEES_NEW en 
WHERE DEPARTMENT_ID = 100
;

--9. EMPLOYEES_NEW 테이블을 삭제 하시요.
DROP TABLE EMPLOYEES_NEW;

--10. DEPARTMENTS_NEW 테이블을 삭제 하시요.
DROP TABLE DEPARTMENTS_NEW;

--11. EMPLOYEES 테이블과 DEPARTMENTS 테이블을 사용하여 ‘Sales’ 부서이름에 속한 직원의 이름(FIRST_NAME), 급여(SALARY), 부서이름(DEPARTMENT_NAME)을 조회하시오.
-- 단, 급여는 100번 부서의 평균보다 적게 받는 직원 정보만 출력되어야 한다.(총 16건)
SELECT e.FIRST_NAME , e.SALARY , d.DEPARTMENT_NAME
FROM EMPLOYEES e 
	INNER JOIN DEPARTMENTS d ON e.EMPLOYEE_ID = d.DEPARTMENT_ID 
WHERE SALARY  < (SELECT AVG(SALARY)
					 FROM EMPLOYEES
					 WHERE DEPARTMENT_ID = 100)
;


--12. EMPLOYEES 테이블과 DEPARTMENTS테이블을 사용하여, 커미션(COMMISSION_PCT)을 받는 사원의 이름(FIRST_NAME), 직업(JOB_ID), 부서번호(DEPARTMENT_ID),부서명(DEPARTMENT_NAME)을 출력하라.(총 35건)
SELECT e.FIRST_NAME , e.JOB_ID , d.DEPARTMENT_ID , d.DEPARTMENT_NAME 
FROM EMPLOYEES e 
	INNER JOIN DEPARTMENTS d ON e.EMPLOYEE_ID = d.DEPARTMENT_ID 
WHERE COMMISSION_PCT IS NOT NULL 
;

--13. EMPLOYEES 테이블에서 사원번호가(EMPLOYEE_ID) 123인 사원의 직업(JOB_ID)과 같고 , 사원번호(EMPLOYEE_ID)가 192인 사원의 급여(SALARY)보다 많은 사원의 사원번호(EMPLOYEE_ID),이름(FIRST_NAME),직업(JOB_ID),급여(SALARY)를 출력하라.(총 5건)
SELECT EMPLOYEE_ID , FIRST_NAME , JOB_ID , SALARY 
FROM EMPLOYEES e 
WHERE SALARY > (SELECT SALARY 
				FROM EMPLOYEES e2
				WHERE JOB_ID = JOB_ID (EMPLOYEE_ID = 123)
				AND EMPLOYEE_ID = 192)
;

--14. 학생 관리를 위한 다음 조건을 만족시키는 STUDENT 테이블을 생성하여라.
CREATE TABLE student(
	stId		varchar2()		PRIMARY KEY 
	stName		varchar2(10)	NOT NULL 
	stNum		NUMBER(11) 		NOT NULL 
	stAdd		varchar2		NOT NULL 
	stSub		varchar2(100)		
);