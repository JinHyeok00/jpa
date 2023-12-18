package com.app.member.dto;

import com.app.member.entity.MemberEntity;
import lombok.*;

// private로 만들기 때문에 Getter, Setter 가 필요하다
@Getter
@Setter
// 기본생성자를 자동으로 만들어준다
@NoArgsConstructor
// DTO의 toString 만들어 줌
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }
}
