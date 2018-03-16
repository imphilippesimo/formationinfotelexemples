package com.infotel.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.infotel.gestionbiblio.entity.Member;

import com.infotel.gestionbiblio.service.inter.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
    MemberService memberService;
    
    @PostMapping("/add")
    public void addMember(@RequestBody Member member) 
    {
    	memberService.insert(member);            
    }

    @GetMapping("/getlist")
    public List<Member> getMembers() 
    {
        List<Member> Members = memberService.getList();

        return Members;
    }
}
