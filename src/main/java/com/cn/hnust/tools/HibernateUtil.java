package com.cn.hnust.tools;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by kangkang on 2017/4/7.
 */
public class HibernateUtil {
    public static final ThreadLocal local = new ThreadLocal();
    private static SessionFactory sessionFactory;
    public static Session currentSession() throws HibernateException {
        Session session = (Session) local.get();
        //open a new session if this thread has no session
        if(session == null) {
             StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure() // configures settings from hibernate.cfg.xml 中configure()默认读取的hibernate.cfg.xml路径为项目的src目录下的文件，如果hibernate.cfg.xml没有直接放在项目src目录下，则需在configure() 中进行配置。否则，会找不到hibernate.cfg.xml
                    .build();
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
            session = sessionFactory.openSession();
            local.set(session);

        }

        return session;

    }
}
