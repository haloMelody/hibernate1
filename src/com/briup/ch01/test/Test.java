package com.briup.ch01.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.briup.ch01.Clazz;
import com.briup.ch01.Phone;
import com.briup.ch01.Student;

public class Test {
	public static void main(String[] args) {
		//1.创建配置对象
		Configuration config = new Configuration();
		//2.读取配置文件
		config.configure();
		//3.创建连接工厂
		SessionFactory factory = config.buildSessionFactory();
		//4.创建会话
		Session session = factory.openSession();
		//5.开启事务
		Transaction tran = session.beginTransaction();
		
		//1.添加学生
//		Student stu = new Student(null, "vicky", 15, "南昌");
//		session.save(stu);
		
		//2.查询单值
//		Student stu = (Student) session.load(Student.class,2L);
//		System.out.println(stu);
		
		//3.修改
//		Long id = 3L;
//		Student stu = (Student) session.load(Student.class,id);
//		stu.setName("tom");
//		session.update(stu);
		
		//4.删除
//		Long id = 1L;
//		Student stu = (Student) session.load(Student.class,id);
//		session.delete(stu);
		
		//5.hql查询
//		String hql = "from Student";
//		Query query = session.createQuery(hql);
//		List<Student> stus = query.list();
//		for(Student s : stus){
//			System.out.println(s);
//		}
		
		//6.hql条件查询
//		String hql = "from Student where age > ?";
//		Query query = session.createQuery(hql);
//		query.setInteger(0,13);
//		List<Student> stus = query.list();
//		for(Student s : stus){
//			System.out.println(s);
//		}
		
		//7.qbc查询
		//创建模板
//		Criteria criteria = session.createCriteria(Student.class);
//		
//		criteria.add(Restrictions.lt("age",18));
//		criteria.add(Restrictions.gt("id",2L));
//		criteria.add(Restrictions.like("name","%m%"));
//		
//		List<Student> stus = criteria.list();
//		for(Student s : stus){
//			System.out.println(s);
//		}
//		
		
		//1.开班
//		Clazz clazz = new Clazz("网通","天天向上");
//		session.save(clazz);
		
		//2.修改
//		Query query = session.createQuery("from Clazz where name = ?");
//		query.setString(0,"moumou");
//		Clazz clazz = (Clazz) query.uniqueResult();
//		if(clazz != null){
//			clazz.setName("冶金");
//		}
		
		//3.报道
		//Student stu2 = new Student(null, "马瑞", 19, "乌鲁木齐");
		//session.save(stu2);
		
		//查询班级
		//Clazz clazz = (Clazz) session.load(Clazz.class, 2L);
		
		//查询学生
//		Query query = session.createQuery("from Student where name = ?");
//		query.setString(0, "杰克");
//		Student stu = (Student) query.uniqueResult();
//		
		//分班
//		stu.setClazz(clazz);
		
		//录入后直接分班
//		stu2.setClazz(clazz);
		
		//查询某班级所有学生
//		Query query = session.createQuery("from Student as stu where stu.clazz.name=?");
//		query.setString(0, "冶金");
//		List<Student> list = query.list();
//		for(Student stu : list){
//			System.out.println(stu);
//		}
//		
		//录入手机信息
//		Phone phone = new Phone("三星", "s", 1199);
//		session.save(phone);
		
		//修改手机信息
//		Query query = session.createQuery("from Phone where name=?");
//		query.setString(0, "诺基亚");
//		Phone phone = (Phone) query.uniqueResult();
//		if(phone != null){
//			phone.setPrice(789);
//		}
		
//		//查询学生
//		Student student = (Student) session.load(Student.class, 1L);
//		
//		//查询手机
//		Query query = session.createQuery("from Phone where name=?");
//		query.setString(0, "三星");
//		Phone phone = (Phone) query.uniqueResult();
//		
//		//分配
//		phone.setStu(student);
		
		//录入手机信息后直接分配
		Student student = (Student) session.load(Student.class, 4L);
		Phone phone1 = new Phone("魅族", "2s", 2699);
		session.save(phone1);
		phone1.setStu(student);
		
		
		tran.commit();
		System.out.println("----");
	}
}
