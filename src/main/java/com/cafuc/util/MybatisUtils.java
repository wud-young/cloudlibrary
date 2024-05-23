package com.cafuc.util;

import com.cafuc.config.MyBatisConfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            // 初始化 Spring 上下文
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBatisConfig.class);

            // 获取 SqlSessionFactory
            sqlSessionFactory = context.getBean(SqlSessionFactory.class);

            // 关闭 Spring 上下文
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}