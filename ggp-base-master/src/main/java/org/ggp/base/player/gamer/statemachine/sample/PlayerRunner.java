package org.ggp.base.player.gamer.statemachine.sample;

import org.ggp.base.player.GamePlayer;
import org.ggp.base.player.gamer.Gamer;


public class PlayerRunner {

	    public static final Class GAMER_CLASS = WMC.class;
	    public static final int DEFAULT_PORT = 9147;
	    public static void main(String[] args) throws Exception	{
	        int port = (args.length >= 1 ? Integer.parseInt(args[0]) : DEFAULT_PORT);
	        Gamer gamer = (Gamer) GAMER_CLASS.newInstance();
	        GamePlayer player = new GamePlayer(port, gamer);
	        player.start();
	        System.out.println("çalışıyorum abla");
	    }
	}

