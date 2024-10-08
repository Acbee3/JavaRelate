import com.lc.mapper.CountryMapper;
import com.lc.work.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
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
            System.out.println("country: " + ctry.getRegion_id() + "-" + ctry.getCountry_name() + "-" + ctry.getCountry_id());
        }
    }
}
