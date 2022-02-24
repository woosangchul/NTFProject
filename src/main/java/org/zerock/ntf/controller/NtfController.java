package org.zerock.ntf.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.ntf.dto.PageRequestDTO;
import org.zerock.ntf.service.GuestbookService;

@Controller
@RequestMapping("/ntf")
@Log4j2
@RequiredArgsConstructor
public class NtfController {

    private final GuestbookService service;

    @GetMapping("/")
    public String index(){
        return "redirect:/guestbook/list";
    }

    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model){
        log.info("/list......" + pageRequestDTO);

        model.addAttribute("result", service.getList(pageRequestDTO));

    }



}
