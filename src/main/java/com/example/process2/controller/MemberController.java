package com.example.process2.controller;

import com.example.process2.dto.MemberRequestDTO;
import com.example.process2.dto.MemberResponseDTO;
import com.example.process2.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public MemberResponseDTO insertMember(MemberRequestDTO request){
        return memberService.insertMember(request);
    }


}
