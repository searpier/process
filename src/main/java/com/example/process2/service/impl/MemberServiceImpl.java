package com.example.process2.service.impl;

import com.example.process2.dto.MemberRequestDTO;
import com.example.process2.dto.MemberResponseDTO;
import com.example.process2.repository.MemberRepository;
import com.example.process2.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    @Override
    public MemberResponseDTO insertMember(MemberRequestDTO request) {

        try {

            memberRepository.save(request.toEntity());

        }catch(Exception e){

           return MemberResponseDTO.builder()
                    .code("ERROR")
                   .content(e.getMessage())
                   .build();
        }

        return MemberResponseDTO.builder()
                .code("SUCCESS")
                .build();
    }
}
