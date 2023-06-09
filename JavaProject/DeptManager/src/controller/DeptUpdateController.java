package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import main.DeptManagerMain;
import service.DeptListService;
import service.DeptSearchService;

public class DeptUpdateController {

	DeptListService listService;
	DeptSearchService searchService;

	public DeptUpdateController() {
		this.listService = new DeptListService(new DeptDao());
		this.searchService = new DeptSearchService();
	}

	public void updateDept() {

		// 1. 수정하고자하는 데이터를 사용자로부터 받아서 => Dept

		// 2. Service에 Dept 전달해서 수정 => 결과 반환 ( 1 or 0 )

		// 3. 결과 값에 따른 결과 출력

	}

	private Dept inputUpdateDept() {

		// 1. 수정하고자 하는 부서번호를 입력하세요.
		System.out.println("부서정보 수정을 시작합니다.");
		// 전체리스트 출력
		System.out.println();
		
		List<Dept> list = listService.getDeptList();
		System.out.println("-----------------------------");
		for(Dept d : list) {
			System.out.println(d.getDeptno()+" / "+d.getDname()+" / "+d.getLoc());
		}
		System.out.println("-----------------------------");		
		System.out.println("수정하고자 하는 부서번호를 입력하세요. >>>");
		// 사용자가 부서번호 입력
		// 2. 해당 부서번호의 데이터를 가져와서 보여준다.
		Dept dept = searchService.searchDept(deptno);
		System.out.println("--------------------------");
		System.out.println(dept);
		System.out.println("--------------------------");
		
		// Dept => 사용자가 입력한 부서의 저장되어 있는 데이터를 가지는 Dept
		
		// 3. 수정할 데이터를 입력 받아 => Dept
		System.out.println(deptno + "번 부서의 정보 수정을 시작합니다.");
		System.out.println("새로운 부서이름을 입력하세요.");
		String  newdname = DeptManagerMain.sc.nextLine();
		dept.setDname(newdname);
		
		System.out.println("새로운 위치 정보를 입력하세요. >>> ");
		String newLoc = DeptManagerMain.sc.nextLine();
		dept.setLoc(newLoc);

		
		
		
		return dept;
	}
	
	public static void main(String[] args) {
		DeptUpdateController controller = new DeptUpdateController();
		
		Dept dept = controller.inputUpdateDept();
		System.out.println(dept);
	}
	

}