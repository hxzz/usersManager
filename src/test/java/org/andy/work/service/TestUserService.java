package org.andy.work.service;

import java.util.Date;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.hexincad.usersmanager.entity.AcctUser;
import com.hexincad.usersmanager.service.UserService;

/**
 * 创建时间：2015-2-6 下午3:31:07
 * 
 * @author andy
 * @version 2.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
public class TestUserService {

	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;

	@Test
	public void save() {
		AcctUser acctUser = new AcctUser();
		acctUser.setId(UUID.randomUUID().toString());
		acctUser.setNickName("andy");
		acctUser.setRegisterTime(new Date());
		acctUser.setTelephone("13022221111");
		String id = userService.save(acctUser);
		LOGGER.info(JSON.toJSONString(id));
	}

}
