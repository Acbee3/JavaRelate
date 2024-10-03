package com.lc.test01;

import com.lc.mapper.CountryMapper;
import com.lc.work.Country;
import jdk.nashorn.internal.codegen.ApplySpecialization;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Test {

    // 获取日志对象, 参数为当前类class对象
    Logger logger = LogManager.getLogger(String.valueOf(Test.class));
    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List ctryList = sqlSession.selectList("selectAllCountries");
//        for(int i = 0; i < ctryList.size(); i++) {
//            Country ctry = (Country) ctryList.get(i);
//            System.out.println("country: " + ctry.getRegion_id() + "-" + ctry.getCountry_name() + "-" + ctry.getCountry_id());
//        }
        CountryMapper ctryMapper = sqlSession.getMapper(CountryMapper.class);
        List ctryList = ctryMapper.selectAllCountries();
        for(int i = 0; i < ctryList.size(); i++) {
            Country ctry = (Country) ctryList.get(i);
//            System.out.println("country: " + ctry.getRegion_id() + "-" + ctry.getCountry_name() + "-" + ctry.getCountry_id());
        }
        Country ctryS = ctryMapper.selectCountries("Australia");
//        System.out.println("select: " + ctryS.getCountry_name());
        // 新增
//        Country newCtry = new Country("UG", "Uganda", "4");
//        int res = ctryMapper.insertCountry(newCtry);
//        if(res > 0) {
//            System.out.println("数据添加成功！");
//        }
        // 修改
        Country newCtry = new Country("UG", "Uganda", "4");
        int res = ctryMapper.updateCountryInfo("UG", newCtry);
        if(res > 0) {
            System.out.println("数据修改成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

}
