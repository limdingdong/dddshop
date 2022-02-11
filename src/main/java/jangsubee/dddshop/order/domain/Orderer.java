package jangsubee.dddshop.order.domain;

import jangsubee.dddshop.member.domain.MemberId;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Embeddable
@RequiredArgsConstructor
public class Orderer {

    /**
     * MemberId에 정의한 컬럼 이름을 변경하기 위해
     * @AttributeOverride 애노테이션 사용
     */
    @Embedded
    @AttributeOverrides(
            @AttributeOverride(name = "id", column = @Column(name = "orderer_id"))
    )
    private MemberId memberId;

    @Column(name = "orderer_name")
    private String name;
    private String email;

    public MemberId getMemberId() {
        return memberId;
    }
}
