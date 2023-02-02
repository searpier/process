package com.example.process2.service;

import com.example.process2.dto.MemberRequestDTO;
import com.example.process2.dto.MemberResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    MemberResponseDTO insertMember(MemberRequestDTO request); // 로직 비어있음
}
