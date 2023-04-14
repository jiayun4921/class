-- 2023.04.13
-- join_ exam1



-- 32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오
select e.ename, e.deptno, d.dname --(ename, dname 앞에 별칭을 안붙여도됌. 값이 겹치치 않기때문에. 하지만 나중에 보기편하려면 별칭 붙이는게 편함)
from emp e, dept d
where e.deptno=d.deptno -- emp와 dept에 있는 deptno를 비교한다
        and e.ename='SCOTT' ;
        

--33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.
select ename, dname, loc
from emp inner join dept
on emp.deptno=dept.deptno;


select e.ename, d.dname, d.loc
from emp e inner join dept d
on e.deptno=d.deptno
;

select e.ename, d.dname, d.loc
from emp e inner join dept d
using(deptno)
;

select ename, dname, loc
from emp natural join dept --중복되는 컬럼을 만들지 않기때문에 별칭 생략가능
;


select e.ename, d.dname, d.loc
from emp e inner join dept d
using(deptno)
;



--36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.
select ename, dname
from emp join dept
on emp.deptno=dept.deptno
    and ename like '%A%';
    
    
select e.ename, d.dname
from emp e, dept d
where e.deptno=d.deptno
    and e.ename like '%A%'
    ;
    

    

--37. JOIN을 이용하여 
-- NEW YORK에 근무하는 
-- 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.
select e.ename, e.job, e.deptno, d.dname
from emp e join dept d
on e.deptno=d.deptno
where d.loc='NEW YORK'
;


select e.ename, e.job, d.deptno, d.dname
from emp e, dept d
where e.deptno=d.deptno
and d.loc='NEW YORK'
;

​

-- 38. SELF JOIN을 사용하여 
--사원의 이름 및 사원번호, 관리자 이름을 출력하시오.
select e.ename, e.empno, m.ename
from emp e, emp m 
where e.mgr=m.empno
;


select e.ename, e.empno, m.ename
from emp e, emp m
where e.mgr=m.empno
;
​


--39. OUTER JOIN, SELF JOIN을 사용하여 
--관리자가 없는 사원을 포함하여 
--사원번호를 기준으로 내림차순 정렬하여 출력하시오.
select e.ename, m.empno, nvl(m.ename, '없음')
from emp e, emp m
where e.mgr=m.empno(+)
order by m.empno desc;
;


select e.ename, e.empno, nvl(m.ename,'관리자 없음') as "관리자"
from emp e, emp m
where e.mgr=m.empno(+)
;



select e.ename, e.empno, nvl(m.ename, '관리자 없음')
from emp e left outer join emp m
on e.mgr=m.empno
;

--40. SELF JOIN을 사용하여 
-- 지정한 사원의 이름, 부서번호,  
-- 지정한 사원과 동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )



select
from emp e, emp m
where e.empno=m.deptno
;

-- 동일한 부서에서 근무하는 사원이라는 조건이 있기 때문에 deptno로 비교해야함
select e2.ename, e2.deptno
from emp e1, emp e2
where e1.deptno=e2.deptno 
and e1.ename='SCOTT' and e2.ename!='SCOTT'
order by e1.ename
;



--41. SELF JOIN을 사용하여 
-- WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.
select *
from emp e, emp w
where w.ename='WARD'
and e.hiredate > w.hiredate
;

-- 샐러리 비교 ↓
select *
from emp e, emp w
where w.ename='WARD'
and e.sal > w.sal
;



--42. SELF JOIN 을 사용하여 
-- 관리자보다 먼저 입사한 모든 
--사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오.

select e.ename, e.hiredate, m.ename, m.hiredate
from emp e, emp m
where e.mgr=m.empno
and e.hiredate<m.hiredate
;



