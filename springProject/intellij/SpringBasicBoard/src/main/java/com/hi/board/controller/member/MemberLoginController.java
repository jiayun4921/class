package com.hi.board.controller.member;

import com.hi.board.domain.member.MemberDTO;
import com.hi.board.service.member.MemberLoginService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
@Log4j2
public class MemberLoginController {

    @Autowired
    private MemberLoginService loginService;

    @GetMapping
    public String  loginForm(){
        log.info("GET  /login");
        return "member/loginForm";

    }

    @PostMapping
    public String login(
            @RequestParam("uid") String uid,
            @RequestParam("pw") String pw,
            HttpSession session

    ){

        // 서비스로 uid,pw, 현재 세션(로그인이 되었을 때 속성에 회원 정보를 저장) 전달
        boolean result = loginService.login(uid, pw, session);

        // 서비스 : 로그인 처리 -> 응답(로그인 성공, 실패)
        // 로그인 성공시
        if(result){
            return "redirect:/board/list";
        }

        // 로그인 실패시
        return "redirect:/login";

    }

}
