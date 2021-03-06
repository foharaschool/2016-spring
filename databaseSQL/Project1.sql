/* Fred O'Hara
Project 1
SQL Database Prog
Th 5:30 */

/* Request 1; 2/20/2016 */
SELECT JOB_ID, JOB_TITLE
FROM JOBS
WHERE (JOB_TITLE LIKE '%Programmer%' OR JOB_TITLE LIKE '%Manager%')
AND MAX_SALARY >= 10000;

/* Request 2; 2/20/2016 */
SELECT EMPLOYEE_ID, (FIRST_NAME || ' ' || LAST_NAME) AS NAME, PHONE_NUMBER, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '01-JAN-90' AND '31-DEC-95';

/* Request 3 2/20/2016 */
SELECT DEPARTMENT_ID, DEPARTMENT_NAME,
  DECODE(MANAGER_ID, MANAGER_ID, MANAGER_ID,
                                  '-NONE-') AS MANAGER_ID,
  DECODE(DEPARTMENT_ID, DEPARTMENT_ID, DEPARTMENT_ID,
                                  '-NONE') AS DEPARTMENT_ID
FROM DEPARTMENTS;

/* Request 4 2/20/2016 */
SELECT EMPLOYEE_ID, SALARY, e.DEPARTMENT_ID, DEPARTMENT_NAME
FROM EMPLOYEES e LEFT JOIN DEPARTMENTS d
ON (e.DEPARTMENT_ID = d.DEPARTMENT_ID);

/* Request 5 2/20/2016 */
SELECT DEPARTMENT_ID, MAX(SALARY) AS MAX_SALARY, MIN(SALARY) AS MIN_SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID BETWEEN 50 AND 90
GROUP BY DEPARTMENT_ID
ORDER BY DEPARTMENT_ID DESC;

/* Request 6 2/20/2016 */
SELECT EMPLOYEE_ID, LAST_NAME, SUBSTR(PHONE_NUMBER, -8, 8) AS PHONE_NUMBER, TO_CHAR(HIRE_DATE, 'MONTH DD, YYYY') AS HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 50;