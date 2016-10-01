package com.ysnet.android.app160924.Member;

import android.util.Log;

/**
 * Created by Young on 2016-10-01.
 */

public class MemberServiceImpl implements MemberService{
    MemberDAO dao=new MemberDAO();

    @Override
    public MemberDTO login(MemberDTO param) {
        Log.i("=Impl>> DAO에서 받은 id : ",param.getId());
        Log.i("=Impl>> DAO에서 받은 pw : ",param.getPw());

        MemberDTO member = new MemberDTO();
        member=dao.select(param);
        if(member == null){
          member.setId("NONE");
          return member;

        }else if(member.getPw().equals(param.getPw())){
          return member;
        }else{
            member.setId("NO_MATCH");
          return member;
        }

    }

    @Override
    public MemberDTO join(MemberDTO member) {
        return null;
    }
}
