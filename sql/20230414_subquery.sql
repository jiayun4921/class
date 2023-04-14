-- 2023.04.14
-- sub query

-- 스칼라 부속질의 : select절에 쓸수 있는 서브쿼리, 단일값(질의의 결과가 단일행, 단일열)(select 다음에 단일값이 들어가야함)
select deptno, (select dname from dept where dept.deptno=emp.deptno) as dname
from emp
where ename ='SCOTT' 
;


select o.custid, c.name, sum(saleprice)
from orders o, customer c
where o.custid=c.custid
group by o.custid, c.name
;


select o.custid,
        (select name from customer c where c.custid=o.custid) as name,
        (select sysdate from dual),
        sum(o.saleprice)
from orders o
group by o.custid
;



-- 인라인 뷰 : from 절 뒤에 오는 서브쿼리, 가상의 테이블, 테이블처럼 사용

select empno, ename, job, hiredate from emp where deptno-30;

select * from (select empno, ename, job, hiredate from emp where deptno=30)
where ename='SCOTT'
;

-- 고객번호가 2이하인 고객들의 총 판매액
select o.custid, sum(saleprice) total
from (select custid, name from customer where custid<=2) c, orders o
where c.custid=o.custid
group by o.custid
;


select ename
from emp
;

select rownum, ename, hiredate
from emp
order by hiredate
;

select ename, hiredate from emp order by hiredate
;


select rownum, ename, hiredate
from (select ename, hiredate from emp order by hiredate)
where rownum<=3
;


-- emp 테이블에서 최고 급여를 받는 사람 5명을 뽑아서 사원의 이름, 급여 정보를 출력해보자
select rownum,  ename, sal from emp order by sal desc;

select rownum, ename, sal
from (select ename, sal from emp order by sal desc)
where rownum<=5
;



-- 중첩 질의 : where절 뒤에 오는 비교연산과 연산자를 통해 처리할때 사용

-- 비교 : 단일값이 나오는 서브쿼리를 사용
-- 평균급여보다 더 많은 급여를 받는 사원
select avg(sal) from emp; -- 2074

select *
from emp
where sal > (select avg(sal) from emp)
;

-- 평균 주문금액 이하의
-- 주문에 대해서 주문번호와 금액을 보이시오.

select  orderid, saleprice
from orders
where saleprice <= (select avg(saleprice) from orders) -- 평균 주문 금액
;
select avg(saleprice) from orders;


-- 각 고객의 평균 주문금액보다 큰 금액의 
-- 주문 내역에 대해서
-- 주문번호, 고객번호, 금액을 보이시오.

select o1.orderid, o1.custid, o1.saleprice
from orders o1
where saleprice >(select avg(saleprice) from orders o2 where o2.custid=o1.custid) -- 고객의 평균 구매액 
;

-- 1번 고객의 평균 구매액
select avg(saleprice) from orders where custid=1;

-- 주어진 문제가 3000 이상 받는 사원이 소속된 부서(10번, 20번)와 
-- 동일한 부서에서 근무하는 사원.

select * from emp where sal>=3000;
select deptno from emp where sal>=3000;

select * from emp where deptno in (10,20,20);
-- 다중행 단일 열 : 10,20,30
select * from emp where deptno in (select distinct deptno from emp where sal>=3000);


-- 대한민국에 거주하는 고객에게 
-- 판매한 도서의 총 판매액을 구하시오
select sum(saleprice)
from orders
where custid in (select custid from customer where address like '%대한민국%')
;

-- 대한민국에 거주하는 고객 번호
select custid from customer where address like '%대한민국%';
-- 대한민국에 거주하지 않는 고객 번호
select custid from customer where address not like '%대한민국%';



