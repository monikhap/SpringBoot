package com.springbatch.SpringBatchDemo.tasklet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class MyScheduler {
	File file = new File("SchedulerFile.txt");
	FileWriter writer;

	public MyScheduler() {
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Scheduled(cron = "0 2/2 * * * ?")
	public void execute() throws Exception {

		writer.write("SpringBatchDemo " + new Date().toString());
		System.out.println("SpringBatchDemo " + new Date().toString());

	}

}
