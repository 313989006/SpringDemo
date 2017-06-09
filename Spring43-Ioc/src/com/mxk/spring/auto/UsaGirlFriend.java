package com.mxk.spring.auto;

import org.springframework.stereotype.Component;
	/*Component 代表一种组件
	@Author win*/
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Service("usaGirlFriend")
//@Controller("usaGirlFriend")
//@Repository("usaGirlFriend")
@Component("usaGirlFriend")

public class UsaGirlFriend
{
	public String speak()
	{
		return "english";
	}

}
