package com.xyq.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.xyq.entity.Account;
import com.xyq.entity.Log;
import com.xyq.mapper.AccountMapper;
import com.xyq.mapper.LogMapper;
import com.xyq.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Override
	public int account(Account outac, Account inac) throws IOException {
		
		//获取SqlSession对象
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		//获取mapper接口实例化对象
		AccountMapper accountMapper = session.getMapper(AccountMapper.class);
		Account outac2 = accountMapper.getAccountByIdPwd(outac.getId(), outac.getPwd());
		//判断转账账户和密码
		if(outac2 != null) {
			//判断转账账户余额与转账金额的大小
			if(outac.getMoney() <= outac2.getMoney()) {
				//判断入账账户的账户和用户名
				Account inac2 = accountMapper.getAccountByIdName(inac.getId(), inac.getName());
				if(inac2 != null) {
					//进行转账
					outac.setMoney(-outac.getMoney());
					int num = accountMapper.updateAccountMoney(outac);
					num += accountMapper.updateAccountMoney(inac);
					if(num == 2) {
						//保留转账记录
							//创建Log对象
								Log log = new Log(outac.getId(), inac.getId(), inac.getMoney());
							//获取mapper实例话对象
								LogMapper logMapper = session.getMapper(LogMapper.class);
								logMapper.inserLog(log);
						//打印日志
								Logger logger = Logger.getLogger(AccountServiceImpl.class);
								logger.debug(outac.getId()+"在"+new Date().toLocaleString()+"给"+inac.getId()+"转了"+inac.getMoney()+"元");
						session.commit();
						return ACCOUNT_SUCCESS;
					} else {
						return ACCOUNT_ERROR;
					}
				}else {
					return ACCOUNT_IN_ID_NAME_ERROR;
				}
			} else {
				return ACCOUNT_MONERY_ERROT;
			}
		}else {
			return ACCOUNT_OUT_ID_PWD_ERROR;
		}
	}

}
