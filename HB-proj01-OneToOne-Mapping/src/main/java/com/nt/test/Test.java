package com.nt.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Answer;
import com.nt.entity.Question;

public class Test
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("com/nt/cfg/Hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        //create question object
        Question q=new Question();
        q.setQuestionId(1212);
        q.setQuestion("What is java");
        
        //create Answer Object
        Answer ans=new Answer();
        ans.setAnswerId(343);
        ans.setAnswer("Java is a programming language");
        ans.setQuestion(q);
        q.setAnswer(ans);
        
        //------------------------------------------------
        
      //create question object
        Question q1=new Question();
        q1.setQuestionId(1213);
        q1.setQuestion("What is collection framework");
        
        //create Answer Object
        Answer ans1=new Answer();
        ans1.setAnswerId(344);
        ans1.setAnswer("Api to work with objects in java");
        ans1.setQuestion(q1);
        q1.setAnswer(ans1);
        
        //=============================
        
      //create question object
        Question q2=new Question();
        q2.setQuestionId(1214);
        q2.setQuestion("What is netbeans?");
        
        //create Answer Object
        Answer ans2=new Answer();
        ans2.setAnswerId(345);
        ans2.setAnswer("NetBeans is a programming language");
        ans2.setQuestion(q2);
        q2.setAnswer(ans2);
        
        Session ses=factory.openSession();
        try{
        	Transaction tx=ses.beginTransaction();
        
        	ses.save(q);
        	ses.save(q1);
        	ses.save(q2);
        	
        	ses.save(ans);
        	ses.save(ans1);
        	ses.save(ans2);
        	
        	System.out.println("Object saved to db.");
        	tx.commit();
        }
        catch(Exception e) {
        	e.printStackTrace();
        } 
        ses.close();
        factory.close();
    }
}
