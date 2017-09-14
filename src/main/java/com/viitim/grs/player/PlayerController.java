package com.viitim.grs.player;

import java.sql.Connection;

import org.jooq.Record;

public class PlayerController {

	public PlayerController() {

	}

	public void doSomething() {
	     /* String userName = "";
	        String password = "";
	        String url = "jdbc:postgresql://localhost:5432/GRS";

	        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
	            DSLContext create = DSL.using(conn, SQLDialect.POSTGRESQL);
	            Result<Record> result = create.select().from(PLAYER).fetch();

	            for (Record r : result) {
	                Integer id = r.getValue(PLAYER.ID);
	                String name = r.getValue(PLAYER.NAME);

	                System.out.println("ID: " + id + " name: " + name);
	            }
	        } 

	        catch (Exception e) {
	            e.printStackTrace();
	        }*/
	}

}
