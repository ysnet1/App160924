package com.ysnet.android.app160924.Member;

import android.content.Context;
import android.util.Log;

import com.ysnet.android.app160924.Util.Retval;

/**
 * Created by Young on 2016-10-01.
 */

public class MemberServiceImpl implements MemberService{
    MemberDAO dao;
    public MemberServiceImpl(Context context){
        this.dao = new MemberDAO(context);
    }
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
    public Retval join(MemberDTO param) {
        Log.i("Service에서 받은 id : ",param.getId());
        Log.i("Service에서 받은 pw : ",param.getPw());
        Log.i("Service에서 받은 name : ",param.getName());
        Log.i("Service에서 받은 email : ",param.getEmail());
        Log.i("Service에서 받은 addr : ",param.getAddr());
        Log.i("Service에서 받은 phone : ",param.getPhone());
        Log.i("Service에서 받은 image : ",param.getProfileImg());
        return  dao.insert(param);

    }
}
