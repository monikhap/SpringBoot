package com.springbatch.SpringBatchDemo;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBatchApp 
{
    public static void main( String[] args ) throws Exception
    {
       //@SuppressWarnings("resource")
       ApplicationContext context = new ClassPathXmlApplicationContext("jobConfig.xml");
       JobLauncher launcher=(JobLauncher) context.getBean("jobLauncher");
       Job demoJob=(Job) context.getBean("demoJob");
       
       String dateParam=new Date().toString();
       JobParameters param=new JobParametersBuilder().addString("date", dateParam).toJobParameters();
       
       System.out.println(dateParam);
       
       JobExecution execute=launcher.run(demoJob, param);
       System.out.println("Job status "+execute.getStatus());
    }
}
