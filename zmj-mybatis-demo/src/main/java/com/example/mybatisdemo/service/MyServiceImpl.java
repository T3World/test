package com.example.mybatisdemo.service;

import com.example.mybatisdemo.mapper.MyMapper;
import com.example.mybatisdemo.mybatisUtil.MUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MUtil mUtil;

    @Override
    public String searchAll(String database, String tableName) {
        Class[] mappers = new Class[]{MyMapper.class};
        String[] xmlMappers = new String[]{"mappers/myMapper.xml"};
        SqlSession sqlSession = null;
        try {
            System.out.println("start mutil!");
            sqlSession = mUtil.openSession(database, mappers, xmlMappers);

            MyMapper mapper = sqlSession.getMapper(MyMapper.class);
            return mapper.selectTheFirst(tableName);


        } catch (Exception e){
            e.printStackTrace();
            System.out.println("factory build failure");
        }finally {
            sqlSession.close();
        }
        return null;
    }
}
