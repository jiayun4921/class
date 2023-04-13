-- 2023.04.13
-- join

-- cross join
-- 스키마를 붙이고 결과 행은 모든 경우의 수를 만들어낸다. => n * m
-- emp, dept => 14* 4 => 56

select *
from emp, dept
;

select *
from emp cross join dept
;

select *
from emp,dept 
where emp.deptno=dept.deptno;

select *
from emp inner join dept
on emp.deptno=dept.deptno
;

select *
from emp join dept
where emp.deptno=dept.deptno
;


select *
from emp join dept
using(deptno) -- 같은 이름의 컬럼일때 사용가능
;

select *
from emp natural join dept
;


select deptno
from emp natural join dept -- 같은이름의 컬럼이 잇을때 
;



select *
from emp,dept -- 두개의 컬럼을 붙여준다. 콤마로 연결
where emp. deptno=dept.deptno --동일한 값의 컬럼을 비교해서 유효한 데이터를 출력
;


select e.deptno, d.deptno, dname
from emp e, dept d --별칭 설정해줌
where e.deptno=d.deptno;



--• 이름이 SCOTT인 사원의 부서명을 출력해봅시다
-- join을 모를시 ↓
select deptno from emp where ename='SCOTT';
--20
select dname from dept where deptno = 20;

-- join으로 해결↓
select e.ename,d.dname
from emp e, dept d
where e.deptno=d.deptno
        and e.ename='SCOTT'; --and 연산으로 추가적인 정보를 가져옴.
        
        
-- 사원별 급여 등급 표현
select * from salgrade;

select e.ename, s.grade, s.losal, e.sal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and hisal
;


--self join : 자기 자신의 테이블을 조인하는 경우
-- 각 사원의 이름과 각 사원의 매니저 이름을 출력
select e.ename, m.ename
from emp e, emp m -- 별칭을 따로 주어야 같은 테이블 안에서 비교가 가능함.
where e.mgr=m.empno
;

-- outer join : 조건에 만족하지 않는 행도 출력을 하는 join
select e.ename, nvl(m.ename,'없음')
from emp e, emp m
where e.mgr=m.empno(+); --내가 표현하고 싶은 반대쪽에 플러스를 붙여서 표현


select *
from emp e join emp m
on e.mgr=m.empno
;


select *
from emp e left outer join emp m
on e.mgr=m.empno
;



-- 도서 판매 정보 출력
select * from orders;

select o.orderid, c.name, b.bookname, o.saleprice, o.orderdate
from orders o, customer c, book b
where o.custid=c.custid and o.bookid=b.bookid
;

