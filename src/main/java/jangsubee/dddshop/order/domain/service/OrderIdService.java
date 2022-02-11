package jangsubee.dddshop.order.domain.service;

import jangsubee.dddshop.member.domain.MemberId;
import jangsubee.dddshop.order.domain.OrderNo;
import org.springframework.stereotype.Service;

@Service
public class OrderIdService {

    public OrderNo createId(MemberId memberId) {
        if (memberId == null) {
            throw new IllegalArgumentException("회원식별자는 필수 입력항목 입니다.");
        }
        return new OrderNo(memberId.toString() + "-" + Long.toString(System.currentTimeMillis()));
    }
}
