package com.hi.todo.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo/modify")
@Log4j2
public class TodoModifyController {

    // get : 수정할 수 있는 화면
    @RequestMapping(method = RequestMethod.GET)
    public String getModifyForm(Model model){
        log.info("get /todo/modify");
        model.addAttribute("todo", "TODO");
        return "todo/modifyForm"; // view 반환
        // /WEB-INF/views/todo/modifyForm.jsp
    }

    // post : 데이터 받고 -> 수정 -> list로 이동
    @RequestMapping(method = RequestMethod.POST)
    public String modify(
        @ModelAttribute("modifyData") TodoReadController modifyTodoRequest

    ){

        log.info("post /todo/modify");

        log.info("modifyTodoRequest : " + modifyTodoRequest);

        return "todo/modify";

        // return "redirect:/todo/list";

    }

    @ModelAttribute("StrData")
    public String getData(){
        return "hello Spring!";

    }


}