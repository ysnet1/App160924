package com.ysnet.android.app160924.Member;

import com.ysnet.android.app160924.Util.Retval;

/**
 * Created by Young on 2016-10-01.
 */

public interface MemberService {
    public MemberDTO login(MemberDTO member);
    public Retval join(MemberDTO member);
}
