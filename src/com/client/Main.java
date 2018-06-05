package com.client;


import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.conf.test.ConfigLoader;
import com.conf.test.RSStub;

public class Main extends JFrame
{
	private static final int WIDTH = 765;
	private static final int HEIGHT = 503;

	public Main() throws IOException
	{
		this.setSize(800, 600);
		Client client = new Client();

		ConfigLoader config = new ConfigLoader();
		config.fetch();

		client.setStub(new RSStub(config, client));

		this.add(client);

		client.setSize(WIDTH, HEIGHT);

		this.setTitle("OSRS dumper - #171");
		
		client.init();
		client.start();
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		client.setVisible(true);
		this.setVisible(true);
	}

	public static void main(String[] args) throws IOException
	{
		new Main();
	}
}
