package com.example.demo.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile("dev")
@Repository("db")
public class BookDaoDbImpl implements BookDao {

	@Override
	public void addBook() {
		System.out.println("stored using RDBMS!!!");
	}

}
